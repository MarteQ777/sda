<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.11.2019
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello!</title>
</head>
<body>
<h1>Hello World!</h1>

<%
    String username = String.valueOf(request.getAttribute("user_name"));
    out.println("Witaj użytkowniku " + username + "!");
%>

</body>
</html>
