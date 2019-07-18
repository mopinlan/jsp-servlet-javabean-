<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<c:url value='/js/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript">
		function change() {
			$("#img").attr("src", "<c:url value='/VerifyCodeServlet?'/>" + new Date().getTime());
		}
	</script>
  </head>
  
  <body>
<form action="<c:url value='/UserServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	验证码：<input type="text" name="verifyCode"/>
	<img id="img" src="<c:url value='/VerifyCodeServlet'/>" border="1"/>
	<a href="javascript:change();">换一张</a>
	<br/>
	<input type="submit" value="注册"/>
</form>
  </body>
</html>
