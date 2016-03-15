<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/15/16
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="utf-8">
    <title></title>
    <base href="<%=basePath%>">
</head>
<body>
<form action="admin/Login-login" method="post">
    <s:property value="getText('login.username')"/> <input type="text" name="username"/>
    <s:property value="getText('login.password')" /> <input type="password" name="password"/>
    <input type="submit" value="<s:property value="getText('login.login')" />">
</form>

<a href="admin/lang?request_locale=en_US">en</a>
<a href="admin/lang?request_locale=zh_CN">ch</a>
</body>
</html>
