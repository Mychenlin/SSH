package com.direct.entity;

import java.util.Date;

public class EmployeeInfo {
	private int empid;
	private String empName;
	private String empSex;
	private String empIdcard;
	private Double subsidies;
	private Date empDate;
	private DepartmentInfo dinfo;
	private String remark;
	private String userName;
	private String userPwd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSex() {
		return empSex;
	}
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	public String getEmpIdcard() {
		return empIdcard;
	}
	public void setEmpIdcard(String empIdcard) {
		this.empIdcard = empIdcard;
	}
	public Double getSubsidies() {
		return subsidies;
	}
	public void setSubsidies(Double subsidies) {
		this.subsidies = subsidies;
	}
	public Date getEmpDate() {
		return empDate;
	}
	public void setEmpDate(Date empDate) {
		this.empDate = empDate;
	}
	public DepartmentInfo getDinfo() {
		return dinfo;
	}
	public void setDinfo(DepartmentInfo dinfo) {
		this.dinfo = dinfo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
