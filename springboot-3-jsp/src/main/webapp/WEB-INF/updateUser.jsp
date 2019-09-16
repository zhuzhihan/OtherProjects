<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<title>Ajax专项练习</title>
	<!--引入js函数类库  -->
	<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="../js/user.js"></script>
</head>
<body>
	<center>
		<br>
		<br><h1>添加用户:</h1><br>
		<br> 
			ID号: <input type="text" name="id" id="id"	/>&nbsp;&nbsp; 
			姓名:<input type="text" name="name" id="name"	/>&nbsp;&nbsp; 
			年龄:<input type="text" name="age" id="age"	/>&nbsp;&nbsp; 
			性别: <input type="text" name="sex" id="sex"	/>
		<br>
		<br>
		<button id="addUser">提交</button>
		<br>
		<br>
		<hr>
		<br>
		<br>
		<table id="usertable" border="1" cellpadding="5" cellspacing=0>
			<tr>
				<th><input type="checkbox" id="allCheckbox" /></th>
				<th>ID</th>
				<th>姓名</th>
				<th>email</th>
				<th>电话</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
		</table>
		<button type="button" id="deleteUser">删除选中数据</button>
		<br> <br> <br>
		<hr>
		修改用户:<br>
		<br> ID:<input type="text" name="name" id="id_update"
			readonly="readoonly" />&nbsp;&nbsp; 姓名: <input type="text"
			name="name" id="name_update" />&nbsp;&nbsp; email: <input
			type="text" name="email" id="email_update" />&nbsp;&nbsp; 电话: <input
			type="text" name="tel" id="tel_update" /><br>
		<br> <input type="hidden" id="id_update" />
		<button id="updateUser">提交</button>
	</center>
</body>
</html>