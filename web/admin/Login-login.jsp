<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/15/16
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="GBK" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="GBK">
    <title></title>
</head>
<body>
<s:property value="username"/>

<s:text name="welcome.msg">
    <s:param value="username"/>
</s:text>

<s:debug/>
</body>
</html>
