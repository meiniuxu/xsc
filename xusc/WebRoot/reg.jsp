<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
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
    <s:form action="CheckReg" method="post">
    <tr>
    	<td><s:textfield name="user.username" label="*用户名称："/></td>
    	<td><s:password  name="user.pwd1" label="*用户密码："/></td>
    </tr>
    <tr>
    	<td><s:password  name="user.pwd2" label="*确认密码："/></td>
    	<td><s:textfield name="user.realname" label="真实姓名："/></td>
    </tr>
    <tr>
    	<td><s:textfield name="user.phone" label="联系电话："/></td>
    	<td><s:textfield name="user.address" label="收货地址："/></td>
    </tr>
    <s:submit/>
    </s:form>
  </body>
</html>
