package com.direct.dao;

import java.util.List;

import com.direct.entity.EmployeeInfo;

public interface IEmployeeDao {
	public EmployeeInfo queryLogin(EmployeeInfo emp);
	
	public int insertEmp(EmployeeInfo emp);
	
	public EmployeeInfo queryEmpById(int id);
	public int udpateEmp(EmployeeInfo emp);
	
	public int deleteEmp(EmployeeInfo emp);
	
	public List<EmployeeInfo> queryEmp(int deptId,String name);
}
