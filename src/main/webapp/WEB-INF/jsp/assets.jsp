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
</head>
<body>


<c:forEach var="asset" items="${assets}">
    <span style="display: block">${asset.name}</span>
</c:forEach>

</body>
</html>
