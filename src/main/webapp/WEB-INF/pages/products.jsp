<%--
  Created by IntelliJ IDEA.
  User: rui
  Date: 2017/4/4
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>welcome to products</h1>
<c:forEach items="${products}" var="product">
  <div>
    <c:out value="${product}"/>
  </div>
</c:forEach>
</body>
</html>
