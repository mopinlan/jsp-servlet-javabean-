<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>图书详细</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/pager/pager.css'/>" />
    <script type="text/javascript" src="<c:url value='/jsps/pager/pager.js'/>"></script>
	<script src="<c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/book/desc.css'/>">
	<script src="<c:url value='/jsps/js/book/desc.js'/>"></script>
  </head>
  
  <body>
  <div class="divBookName">Spring实战(第3版)（In Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）</div>
  <div>
    <img align="top" src="<c:url value='/book_img/23254532-1_w.jpg'/>" class="img_image_w"/>
    <div class="divBookDesc">
	    <ul>
	    	<li>商品编号：4A9574F03A6B40C1B2A437237C17DEEC</li>
	    	<li>传智价：<span class="price_n">&yen;40.7</span></li>
	    	<li>定价：<span class="spanPrice">&yen;59.0</span>　折扣：<span style="color: #c30;">6.9</span>折</li>
	    </ul>
		<hr class="hr1"/>
		<table>
			<tr>
				<td colspan="3">
					作者：Craig Walls 著
				</td>
			</tr>
			<tr>
				<td colspan="3">
					出版社：人民邮电出版社
				</td>
			</tr>
			<tr>
				<td colspan="3">出版时间：2013-06-01</td>
			</tr>
			<tr>
				<td>版次：1</td>
				<td>页数：374</td>
				<td>字数：48700</td>
			</tr>
			<tr>
				<td width="180">印刷时间：2013-06-01</td>
				<td>开本：16 开</td>
				<td>纸张：胶版纸</td>
			</tr>
		</table>
		<div class="divForm">
			<form id="form1" action="<c:url value='/jsps/cart/list.jsp'/>" method="post">
				<input type="hidden" name="method" value=""/>
				<input type="hidden" name="bid" value=""/>
  				我要买：<input id="cnt" style="width: 40px;text-align: center;" type="text" name="quantity" value="1"/>件
  			</form>
  			<a id="btn" href="javascript:$('#form1').submit();"></a>
  		</div>	
	</div>
  </div>
  </body>
</html>
