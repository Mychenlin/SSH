package com.direct.service.impl;

import java.util.List;

import com.direct.dao.IEmployeeDao;
import com.direct.dao.impl.EmployeeDao;
import com.direct.entity.EmployeeInfo;
import com.direct.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {
	//定义dao接口属性(容器中需要注入dao实现对象)
	private IEmployeeDao iedao;
	public IEmployeeDao getIedao() {
		return iedao;
	}
	public void setIedao(IEmployeeDao iedao) {
		this.iedao = iedao;
	}

	@Override
	public EmployeeInfo login(EmployeeInfo emp) {
		return iedao.queryLogin(emp);
	}

	@Override
	public int addEmp(EmployeeInfo emp) {
		return iedao.insertEmp(emp);
	}

	@Override
	public EmployeeInfo showEmpById(int id) {
		return iedao.queryEmpById(id);
	}

	@Override
	public int changeEmp(EmployeeInfo emp) {
		return iedao.udpateEmp(emp);
	}

	@Override
	public int removeEmp(EmployeeInfo emp) {
		return iedao.deleteEmp(emp);
	}

	@Override
	public List<EmployeeInfo> showEmp(int deptId,String name) {
		return iedao.queryEmp(deptId,name);
	}

}
