
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Asset</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
    <style>
        .error{
            background-color: red;
            color:white;
            padding:10px;
        }
        div{
            width: 600px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Asset Manangement</a>
    </nav>

    <div style="margin-top: 10px">
     <form:form action="save" method="post" modelAttribute="asset">
        Name: <form:input id="name" path="name" />
         <br/>
        <form:errors path="name" cssClass="error" />
         <br/>
        Price: <form:input path="price" />
         <br/>
         <form:errors path="price" cssClass="error" />
         <br/>
        Email: <form:input path="supportEmail"  />
         <br/>
         <form:errors path="supportEmail" cssClass="error" />
         <br/>
        <input type="submit" class="btn btn-primary" value="submit">
     </form:form>
    </div>
</body>
</html>
