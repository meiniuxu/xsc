<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goods_list.jsp' starting page</title>
    
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
    <table style="border:1px solid green"><tr><td>bookId<td>bookName<td>bookAuthor
    <s:iterator value="book" var="row">
    <tr>
      <td><s:property value="#row[0]"/>
      <td><s:property value="#row[1]"/>
      <td><s:property value="#row[2]"/>
      <td>
      <s:url var="lookinfo" action="bookinfo">
         <s:param name="mybook.bookId" value="#row"/>
      </s:url>
      <a href="${lookinfo}">查看信息</a>
      <s:url var="shopcar" action="toshopcar">
         <s:param name="mybook.bookId" value="#row"/>
      </s:url>
      <a href="${shopcar}">加入购物车</a>
    </s:iterator>
    </table>
  </body>
</html>
