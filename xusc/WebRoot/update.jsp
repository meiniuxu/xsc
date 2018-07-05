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
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
    <s:form action="update" method="post">
    <td><s:textfield name="mybook.bookId" label="图书编号"/></td>
    <td><s:textfield name="mybook.bookName" label="图书名称："/></td>
    <td><s:textfield name="mybook.bookAuthor" label="图书作者："/></td>
    <td><s:textfield name="mybook.bookPress" label="图书出版社："/></td>
    <td><s:textfield name="mybook.bookPrice" label="*图书价格："/></td>
    <td><s:textfield name="mybook.bookNumber" label="图书数量："/></td>
    <td><s:textfield name="mybook.bookType" label="图书类型："/></td>
    <td><s:textfield name="mybook.bookRemark" label="图书简介："/></td>
    <s:submit/>
    </s:form>
  </body>
</html>
