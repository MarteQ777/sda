<%@ page import="com.javagda28.jsp.model.Student" %><%--
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
<h1>Student Form</h1>

<%
    Student student = null;
    if (request.getAttribute("student") !=null ) {
        student = (Student) request.getAttribute("student")
    }
            %>
<form action="<%= student!=null ? "/student-edit" : "/student-add" %>" method="post">
    First name: <input type="text" name="name" value="<%= student != null ? student.getFirstName() : "" %>" /><br/>
    Last name: <input type="text" name="surname" value="<%= student != null ? student.getLastName() : "" %>"/><br/>
    Index : <input type="text" name="index" value="<%= student != null ? student.getIndexNumber() : "" %>"/><br/>
    Age: <input type="number" name="age" value="<%= student != null ? student.getAge() : "0" %>"/><br/>
    Suspended: <input type="checkbox" name="suspended" <%= student != null && student.isSuspended() ? "checked" : ""%>/><br/><br/>
    <input type="submit"/>
</form>

    <input type="submit">

</form>
</body>
</html>
