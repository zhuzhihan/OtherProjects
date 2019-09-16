<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>您好Springboot</title>
<!--1.导入js函数类库
	2.让页面加载完成之后执行js
	3.发起异步请求
		$.load(url)  从远程获取html代码在制定的元素中展现.
		$.get(url,data,callback,type)
		$.post(url,data,callback,type)
		$.getJSON(url,data,callback)
		$.ajax({
			type: "get/post",
			url : "请求路径",
			data:  {key:value,key2:value2....},
			dataType: 服务器返回数据格式 text/json
			success : function(data){....
				编辑回调函数
			}
		});
	4.回调函数处理
  -->
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	/*$(function() {
		$.ajax({
			type : "get",
			url : "http://127.0.0.1:8090/testAjax",
			dataType : "json",
			success : function(result) {
				$.each(result, function(index, user) {
					var id = user.id;
					var name = user.name;
					var age = user.age;
					var sex = user.sex;
					var tr = "<tr align='center'><td>" + id + "</td><td>"
							+ name + "</td><td>" + age + "</td><td>" + sex
							+ "</td></tr>"
					$("#table1").append(tr);
				});
			}
		});
	});*/

	$(function() {
		$.getJSON("/testAjax", function(result) {
			var trs = doEach(result);
			$("#table1").append(trs);
		})
	});

	function doEach(result) {
		var trs = null;
		$.each(result, function(index, user) {
			var id = user.id;
			var name = user.name;
			var age = user.age;
			var sex = user.sex;
			trs += "<tr align='center'><td>" + id + "</td><td>" + name
					+ "</td><td>" + age + "</td><td>" + sex + "</td></tr>"
		})
		return trs;
	}
</script>
</head>
<body>
	<table id="table1" border="1px" width="80%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th></th>
		</tr>
	</table>
</body>
</html>