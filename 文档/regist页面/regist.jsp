<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/user/regist.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/css/css.css'/>">
	
	<script src="<c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	
	<script src="<c:url value='/jsps/js/user/regist.js'/>"></script>
	<script src="<c:url value='/js/common.js'/>"></script>

  </head>
  
  <body>
    <div class="divBody">
      <div class="divTitle"><span class="spanTitle">新用户注册</span></div>
      <div class="divCenter">
        <form action="<c:url value='/jsps/msg.jsp'/>" method="post" id="registForm">
          <input type="hidden" name="method" value="regist"/>
          <table>
            <tr>
              <td class="tdTitle">用户名：</td>
              <td class="tdInput"><input value="" type="text" name="loginname" id="loginname" class="input"/></td>
              <td class="tdLabel"><label id="loginnameError" class="error">用户名不能为空</label></td>
            </tr>
            <tr>
              <td class="tdTitle">登录密码：</td>
              <td class="tdInput"><input type="password" name="loginpass" id="loginpass" class="input"/></td>
              <td class="tdLabel"><label id="loginpassError" class="error"></label></td>
            </tr>
            <tr>
              <td class="tdTitle">确认密码：</td>
              <td class="tdInput"><input type="password" name="reloginpass" id="reloginpass" class="input"/></td>
              <td class="tdLabel"><label id="reloginpassError" class="error"></label></td>
            </tr>
            <tr>
              <td class="tdTitle">Email：</td>
              <td class="tdInput"><input value="" type="text" name="email" id="email" class="input"/></td>
              <td class="tdLabel"><label id="emailError" class="error"></label></td>
            </tr>
            <tr>
              <td class="tdTitle">图形验证码：</td>
              <td class="tdInput"><input value="" type="text" name="verifyCode" id="verifyCode" class="input"/></td>
              <td class="tdLabel"><label id="verifyCodeError" class="error"></label></td>
            </tr>
            <tr>
              <td></td>
              <td><span class="spanImg"><img width="100" id="vCode" src="<c:url value='/VerifyCodeServlet'/>"/></span></td>
              <td><a id="verifyCode" href="javascript:_change();">换张图</a></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><input type="image" id="submit" src="<c:url value='/images/regist1.jpg'/>" /></td> 
              <td>&nbsp;</td>
            </tr>
          </table>
        </form>
      </div>
    </div>
  </body>
</html>
	