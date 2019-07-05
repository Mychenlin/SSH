package com.direct.service.impl;

import java.util.List;

import com.direct.dao.IDeptDao;
import com.direct.dao.IEmployeeDao;
import com.direct.dao.impl.EmployeeDao;
import com.direct.entity.DepartmentInfo;
import com.direct.entity.EmployeeInfo;
import com.direct.service.IDeptService;
import com.direct.service.IEmployeeService;

public class DeptService implements IDeptService {
	//定义dao接口属性(容器中需要注入dao实现对象)
	private IDeptDao iddao;

	public IDeptDao getIddao() {
		return iddao;
	}

	public void setIddao(IDeptDao iddao) {
		this.iddao = iddao;
	}

	@Override
	public List<DepartmentInfo> showDept() {
		return iddao.queryDept();
	}

}
