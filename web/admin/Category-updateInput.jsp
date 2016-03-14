<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/14/16
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="GBK" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="GBK">
    <title></title>
    <base href="<%=basePath%>">
</head>
<body>
<form action="admin/Category-update" method="post">
    <input type="hidden" name="category.id" value="<s:property value="category.id" />">
    name:<input name="category.name"  value="<s:property value="category.name"/> "/>
    description:<textarea name="category.description"><s:property value="category.name"/> </textarea>
    <input type="submit" value="update" />
</form>
<s:debug/>
</body>
</html>
