<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/14/16
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="GBK" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="GBK">
    <title></title>
    <base href="<%=basePath%>"/>
</head>
<body>
Category-list
<a href="admin/Category-addInput">���Category</a>
<a href="admin/Category-updateInput">����Category</a>
<a href="admin/Category-delete">ɾ��Category</a>
<hr/>
<s:iterator value="categories" var="c">
    <s:property value="#c.name"/> |
    <s:property value="#c.description"/> |
    <a href="admin/Category-delete?id=<s:property value='#c.id'/> ">ɾ��Category</a> |
    <a href="admin/Category-updateInput?id=<s:property value='#c.id'/> ">����Category</a> |
    <br/>
</s:iterator>

<s:debug/>


</body>
</html>
