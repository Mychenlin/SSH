<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<script type="text/javascript" src="js/jquery-1.4.1.js"></script>
	<style type="text/css">
		#out{width: 350px;}
		div{margin: 10px;}
	</style>
	<script type="text/javascript">
		$(function(){
			$(":button").click(function(){
				window.location.href="empC!toAdd";
			});
		});
	</script>
</head>
<body>
	<form method="post" action="empC!showByKey" role="form">
		<div class="form-inline">
		    <label for="name">选择部门:</label>
		    <select name="deptId" class="form-control">
		    	<option value="0">请选择</option>
		    	<c:forEach items="${dlist }" var="dt">
		    		<option value="${dt.deptid }" ${dt.deptid==deptId?"selected":"" }>${dt.deptName }</option>
		    	</c:forEach>
		    </select>
		    <label for="name" style="margin-left: 30px;">输入员工姓名:</label>
		    <input type="text" class="form-control" name="ename" value="${ename }" placeholder="请输入查询员工姓名" style="width: 200px; margin-right: 20px;"/>
		    <input type="submit" class="form-control" value="查询" />
		    <input type="button" class="form-control" value="添加" style="margin-left: 20px;"/>
		</div>
	</form>
	<table class="table table-hover table-striped">
		<thead>
		    <tr>
		      <th>编号</th>
		      <th>姓名</th>
		      <th>部门</th>
		      <th>性别</th>
		      <th>身份证号</th>
		      <th>补贴</th>
		      <th>日期</th>
		      <th>备注</th>
		      <th>操作</th>
		    </tr>
		</thead>
		<tbody>
			<c:forEach items="${elist }" var="ei">
			    <tr>
			      <td>${ei.empid }</td>
			      <td>${ei.empName }</td>
			      <td>${ei.dinfo.deptName }</td>
			      <td>${ei.empSex }</td>
			      <td>${ei.empIdcard }</td>
			      <td>${ei.subsidies }</td>
			      <td>${ei.empDate }</td>
			      <td>${ei.remark }</td>
			      <td>
			      	<a href="empC!toEdit?emp.empid=${ei.empid }">修改</a>
			      	<a href="empC!delete?emp.empid=${ei.empid }">删除</a>
			      </td>
			    </tr>
		    </c:forEach>
		</tbody>
	</table>
</body>
</html>