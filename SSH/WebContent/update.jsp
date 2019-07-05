<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="layui/css/layui.css" />
	<style type="text/css">
		#out{width: 400px;}
		div{margin-top: 10px;}
	</style>
	<script type="text/javascript" src="layui/layui.js" ></script>
	<script>
		layui.use('laydate', function(){
		  var laydate = layui.laydate;
		  
		  //常规用法
		  laydate.render({
		    elem: '#bt',
		    type: 'datetime'
		  });
		});
	</script>
</head>
<body>
	<div id="out">
		<form method="post" action="empC!update" role="form">
			<input type="hidden" name="emp.empid" value="${ei.empid }" />
			<div class="form-inline">
			    <label for="name">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</label>
			    <input type="text" class="form-control" name="emp.empName" placeholder="请输入名称" style="width: 300px;" value="${ei.empName }"/>
			</div>
			<div class="form-inline">
			    <label for="name">选择部门:</label>
			    <select name="emp.dinfo.deptid" class="form-control" style="width: 300px;">
			    	<option value="0">请选择</option>
			    	<c:forEach items="${dlist }" var="dt">
			    		<option value="${dt.deptid }" ${dt.deptid==ei.dinfo.deptid?"selected":"" }>${dt.deptName }</option>
			    	</c:forEach>
			    </select>
			</div>
			<div class="form-inline">
			    <label for="name">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</label>
		        <input type="radio" name="emp.empSex" value="男" ${ei.empSex=="男"?"checked":"" } />男
		        <input type="radio" name="emp.empSex" value="女" style="margin-left: 80px;" ${ei.empSex=="女"?"checked":"" }/>女
			</div>
			<div class="form-inline">
			    <label for="name">身份证号:</label>
			   <input type="text" class="form-control" name="emp.empIdcard" placeholder="请输入身份证号" style="width: 300px;" value="${ei.empIdcard }"/>
			</div>
			<div class="form-inline">
			    <label for="name">补&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;贴:</label>
			   <input type="text" class="form-control" name="emp.subsidies" placeholder="请输入工资补贴" style="width: 300px;" value="${ei.subsidies }"/>
			</div>
			<div class="form-inline">
			    <label for="name">日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;期:</label>
			   <input type="text" class="form-control" name="emp.empDate" placeholder="请选择出生日期" id="bt" style="width: 300px;" value="${ei.empDate }"/>
			</div>
			
			<div class="form-inline">
			    <label for="name">备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:</label>
			   <textarea rows="3" cols="32" class="form-control" name="emp.remark">${ei.remark }</textarea>
			</div>
			<div class="form-inline" style="margin-left: 130px;">
			    <input type="submit" class="form-control" value="提交" />
			</div>
		</form>
	</div>
</body>
</html>