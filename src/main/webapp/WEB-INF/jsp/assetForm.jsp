
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Asset</title>
</head>
<body>

 <form:form action="save" method="post" modelAttribute="asset">
    Name: <form:input id="name" path="name" />
    Price: <form:input path="price" />

    <input type="submit" value="submit">
 </form:form>

</body>
</html>
