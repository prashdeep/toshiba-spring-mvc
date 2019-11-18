
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Asset</title>
    <style>
        .error{
            background-color: red;
            color:white;
            padding:10px;
        }
    </style>
</head>

<body>

 <form:form action="save" method="post" modelAttribute="asset">
    Name: <form:input id="name" path="name" />
    <form:errors path="name" cssClass="error" />
    Price: <form:input path="price" />
     <form:errors path="price" cssClass="error" />
    <input type="submit" value="submit">
 </form:form>

</body>
</html>
