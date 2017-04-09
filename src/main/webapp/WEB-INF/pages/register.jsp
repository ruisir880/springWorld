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
<sf:form commandName="userInfo" method="POST" action="doRegister">
    <table id="registerTable" border="0">
        <tr> <td>UserName: </td><td><sf:input path="userName"/><sf:errors path="userName"/></td> </tr>
        <tr><td>Email:</td><td> <sf:input path="email"/></td></tr>
        <tr> <td>Password:</td><td> <sf:password path="password"/></td></tr>
    </table>
    <input type="submit" value="register">
</sf:form>

</form>

</body>
</html>
