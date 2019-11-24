<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.11.2019
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of our students</title>
    <style>
        td{
            border: 1px solid #002;
        }
    </style>
</head>
<body>
<h1>Student List</h1>
<%--for(Student student: students) --%>

<table style="border: green" border: 1px solid; width=100%>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Index</th>
        <th>Age</th>
        <th>Is suspended</th>
        <th></th>
        <th></th>
    </tr>
<c:forEach var="student" items="${requestScope.students}" varStatus="loop">
    <tr>
        <td>${loop.index}</td>
        <td>${student.getFirstName()}</td>
        <td>${student.getLastName()}</td>
        <td>${student.getIndexNumber()}</td>
        <td>${student.getAge()}</td>
        <td>${student.isSuspended()}</td>
        <td>
            <a href="/student-remove?indexNumber=${student.getIndexNumber()}">Usun</a>
        </td>
        <td>
            <a href="/student-remove?indexNumber=${student.getIndexNumber()}">Usun</a>
        </td>
    </tr>
</c:forEach>
</table>

</body>
</html>
