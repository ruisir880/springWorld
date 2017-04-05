<%--
  Created by IntelliJ IDEA.
  User: rui
  Date: 2017/4/5
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Register</title>
</head>
<body>
<sf:form method="post" action="doRegister">
    UserName: <sf:input path="userName"/><br/>
    Email: <sf:input path="email"/><br/>
    Password: <sf:password path="password"/><br/>
    <sf:button name="submit" value="submit"/>
</sf:form>
<form id="userInfo" method="post" action="doRegister">

</form>

</body>
</html>
