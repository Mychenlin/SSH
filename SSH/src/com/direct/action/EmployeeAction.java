package com.direct.action;





import java.util.List;

import com.direct.entity.DepartmentInfo;
import com.direct.entity.EmployeeInfo;
import com.direct.service.IDeptService;
import com.direct.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	//定义属性封装请求的数据
	private EmployeeInfo emp;
	private int deptId=0;//接收选择的部门
	private String ename="";//接收输入的关键词
	//定义service接口属性(容器中注入service实现类对象)
	private IEmployeeService ieservice;
	private IDeptService idservice;
	public IDeptService getIdservice() {
		return idservice;
	}
	public void setIdservice(IDeptService idservice) {
		this.idservice = idservice;
	}
	public EmployeeInfo getEmp() {
		return emp;
	}
	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}
	public IEmployeeService getIeservice() {
		return ieservice;
	}
	public void setIeservice(IEmployeeService ieservice) {
		this.ieservice = ieservice;
	}
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	//提供访问方法
	public String login(){
		//调用业务层方法
		EmployeeInfo ei = ieservice.login(emp);
		if(ei!=null){
			ActionContext.getContext().getSession().put("user", ei);
			
			this.loadEmp();
			return "index";
		}
		ActionContext.getContext().put("msg", "用户名或密码错误");
		return "fail";
	}
	
	//提供到添加页面的访问方法
	public String toAdd(){
		//得到所有的部门
		List<DepartmentInfo> dlist = idservice.showDept();
		ActionContext.getContext().put("dlist", dlist);
		return "add";
	}
	
	//提供到添加的访问方法
	public String add(){
		int count = ieservice.addEmp(emp);
		if(count>0){
			this.loadEmp();
			return "index";
		}
		return "fail";
	}
	
	//提供到修改页面的访问方法
	public String toEdit(){
		//得到所有的部门
		List<DepartmentInfo> dlist = idservice.showDept();
		ActionContext.getContext().put("dlist", dlist);
		
		//根据id查询修改的当前数据
		EmployeeInfo ei = ieservice.showEmpById(emp.getEmpid());
		ActionContext.getContext().put("ei", ei);
		return "update";
	}
	//提供到修改的访问方法
	public String update(){
		int count = ieservice.changeEmp(emp);
		if(count>0){
			this.loadEmp();
			return "index";
		}
		return "fail";
	}
	//提供删除的访问方法
	public String delete(){
		int count = ieservice.removeEmp(emp);
		if(count>0){
			this.loadEmp();
			return "index";
		}
		return "fail";
	}
	
	//提供条件查询的访问方法
	public String showByKey(){
		this.loadEmp();
		return "index";
	}
	
	
	public void loadEmp(){
		//得到所有的员工信息
		List<EmployeeInfo> elist = ieservice.showEmp(deptId,ename);
		ActionContext.getContext().put("elist", elist);
		
		//得到所有的部门
		List<DepartmentInfo> dlist = idservice.showDept();
		ActionContext.getContext().put("dlist", dlist);
	}
}
