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
    <table style="border:1px solid green"><tr><td>bookId<td>bookName<td>bookAuthor<td>bookPress<td>bookPrice<td>bookNumber<td>bookType<td>bookRemark<td>action
    <s:iterator value="book" var="row">
    <tr>
      <td><s:property value="#row[0]"/>
      <td><s:property value="#row[1]"/>
      <td><s:property value="#row[2]"/>
      <td><s:property value="#row[3]"/>
      <td><s:property value="#row[4]"/>
      <td><s:property value="#row[5]"/>
      <td><s:property value="#row[6]"/>
      <td><s:property value="#row[7]"/>
      <td>
      <s:url var="updateUrl" action="book_update">
         <s:param name="mybook.bookId" value="#row[0]"/>
      </s:url>
      <a href="${updateUrl}">加入购物车</a>
      <s:url var="delUrl" action="book_del">
         <s:param name="mybook.bookId" value="#row[0]"/>
      </s:url>
      <a href="${delUrl}" onClick="return readyDel();">删除</a>
    </s:iterator>
    </table>
     <script>
      function readyDel(){
        return confirm("是否真的删除?");
      }
    </script>
  </body>
</html>
