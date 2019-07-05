package com.direct.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.direct.dao.IEmployeeDao;
import com.direct.entity.EmployeeInfo;

public class EmployeeDao extends HibernateTemplate implements IEmployeeDao {

	@Override
	public EmployeeInfo queryLogin(EmployeeInfo emp) {
		List<EmployeeInfo> elist = super.find("from EmployeeInfo where userName=? and userPwd=?",emp.getUserName(),emp.getUserPwd());
		if(elist!=null && elist.size()>0){
			return elist.get(0);
		}
		return null;
	}

	@Override
	public int insertEmp(EmployeeInfo emp) {
		try {
			super.save(emp);
			return 1;
		} catch (Exception e) {
			Logger.getLogger(EmployeeDao.class).info("添加失败，原因:"+e.getMessage());
		}
		return 0;
	}

	@Override
	public EmployeeInfo queryEmpById(int id) {
		List<EmployeeInfo> elist = super.find("from EmployeeInfo where empid=?",id);
		if(elist!=null && elist.size()>0){
			return elist.get(0);
		}
		return null;
	}

	@Override
	public int udpateEmp(EmployeeInfo emp) {
		try {
			super.update(emp);
			return 1;
		} catch (Exception e) {
			Logger.getLogger(EmployeeDao.class).info("修改失败，原因:"+e.getMessage());
		}
		return 0;
	}

	@Override
	public int deleteEmp(EmployeeInfo emp) {
		try {
			super.delete(emp);
			return 1;
		} catch (Exception e) {
			Logger.getLogger(EmployeeDao.class).info("删除失败，原因:"+e.getMessage());
		}
		return 0;
	}

	@Override
	public List<EmployeeInfo> queryEmp(int deptId,String name) {
		String hql="from EmployeeInfo";
		if(deptId!=0 || !"".equals(name)){
			hql+=" where ";
			if(deptId!=0 && !"".equals(name)){
				hql+=" deptid=? or empName like ?";
				return super.find(hql,deptId,"%"+name+"%");
			}else if(deptId!=0){
				hql+=" deptid=?";
				return super.find(hql,deptId);
			}else if(!"".equals(name)){
				hql+=" empName like ?";
				return super.find(hql,"%"+name+"%");
			}
		}
		return super.find(hql);
	}

}
