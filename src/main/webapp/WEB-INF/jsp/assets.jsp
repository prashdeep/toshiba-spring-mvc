<%--
  Created by IntelliJ IDEA.
  User: classpath
  Date: 18-Nov-19
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Assets</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
    <style>
        tr, td, table, th{
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Asset Manangement</a>
    </nav>
    <div style="width:600px; margin:10px auto;">
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Email Address</th>
            </tr>
            <c:forEach var="asset" items="${assets}">
            <tr>
                <td><c:out value="${asset.id}"/></td>
                <td><c:out value="${asset.name}"/></td>
                <td><c:out value="${asset.price}"/></td>
                <td><c:out value="${asset.supportEmail}"/></td>
            </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>
