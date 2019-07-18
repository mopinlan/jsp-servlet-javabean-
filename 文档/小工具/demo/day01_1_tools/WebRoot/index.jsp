<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<a href="<c:url value='/EncodingServlet?method=test&name=张三'/>">点击这里发出GET请求</a><br/>
<form action="<c:url value='/EncodingServlet'/>" method="post">
  <input type="hidden" name="method" value="test"/>
  <input type="text" name="name" value="李四"/>
  <input type="submit" value="请求这里发出POST请求"/>
</form>
  </body>
</html>
