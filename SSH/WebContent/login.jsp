<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
		<style type="text/css">
			#out{width: 350px;}
			div{margin-top: 10px;}
		</style>
</head>
<body>
	<div id="out">
		<form method="post" action="empC!login" role="form">
			<div class="form-inline">
			    <label for="name">用户:</label>
			    <input type="text" class="form-control" name="emp.userName" placeholder="请输入登录名称" style="width: 300px;"/>
			</div>
			<div class="form-inline">
			    <label for="name">密码:</label>
			    <input type="password" class="form-control" name="emp.userPwd" placeholder="请输入登录密码" style="width: 300px;"/>
			</div>
			<div class="form-inline" style="margin-left: 130px;">
			    <input type="submit" class="form-control" value="登录" />
			</div>
		</form>
	</div>
</body>
</html>