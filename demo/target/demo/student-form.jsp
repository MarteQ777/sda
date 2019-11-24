<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.11.2019
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form action="/student-add" method="post">
    First name: <input type="text" name="name"/><br/>
    Last name: <input type="text" name="surname"/><br/>
    Index: <input type="text" name="index"/><br/>
    Age: <input type="number" name="age"/><br/>
    Suspended: <input type="checkbox" name="suspended"/><br/> <br/>

    <input type="submit">

</form>
</body>
</html>
