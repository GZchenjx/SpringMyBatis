<%--
  Created by IntelliJ IDEA.
  User: WangGenshen
  Date: 7/16/15
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link href="<%=path %>/public/css/style.css" rel="stylesheet" />
</head>
<body>
${user.name}
<br />
<c:forEach items="${users}" var="user">
    ${user.id }, ${user.name }, ${user.password }
    <br/>
</c:forEach>
</body>
</html>
