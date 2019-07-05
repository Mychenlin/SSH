package com.direct.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.direct.dao.IDeptDao;
import com.direct.entity.DepartmentInfo;

public class DeptDao extends HibernateTemplate implements IDeptDao {

	@Override
	public List<DepartmentInfo> queryDept() {
		return super.find("from DepartmentInfo");
	}

}
