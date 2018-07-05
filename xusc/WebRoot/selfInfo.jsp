<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selfInfo.jsp' starting page</title>
    
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
    <table style="border:1px solid green"><tr><td>username<td><td>phone<td><td>relname<td><td>address
    <s:iterator value="usres" var="row2">
    <tr>
      <td><s:property value="#row2[0]"/>
      <td><s:property value="#row2[1]"/>
      <td><s:property value="#row2[2]"/>
      <td><s:property value="#row2[3]"/>
      <td><s:property value="#row2[4]"/>
      </s:iterator>
      </table>
    
  </body>
</html>
