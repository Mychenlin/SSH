package com.direct.service;

import java.util.List;

import com.direct.entity.EmployeeInfo;

public interface IEmployeeService {
	public EmployeeInfo login(EmployeeInfo emp);
	
	public int addEmp(EmployeeInfo emp);
	
	public EmployeeInfo showEmpById(int id);
	public int changeEmp(EmployeeInfo emp);
	
	public int removeEmp(EmployeeInfo emp);
	
	public List<EmployeeInfo> showEmp(int deptId,String name);
}
