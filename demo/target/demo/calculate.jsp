<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.11.2019
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is a motherfucking good calculator</title>
</head>
<body>
<h1>Wynik:</h1>

<form action="/calculator" method="post">
    Liczba 1: <input type="number" step="0.01" name="pierwszaLiczba"></br>
    Liczba 2: <input type="number" step="0.01" name="drugaLiczba"></br>
    Dzialanie: <input type="text" name="dzialanie"></br></br>
    <input type="submit">
    </form>
    <hr>
<%
    if (request.getAttribute("wynik") != null) {
        out.println("Wynik działania " + request.getAttribute("wynik"));
    }
%>

</body>
</html>
