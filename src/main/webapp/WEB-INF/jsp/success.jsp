<%--
  Created by IntelliJ IDEA.
  User: classpath
  Date: 18-Nov-19
  Time: 7:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">

</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Asset Manangement</a>
    </nav>
    <div class="container">
        <div style="width: 50%; margin:10px auto;">
            <h2>Asset Added to the Inventory</h2>
            <h2>${asset.name} is saved in the inventory with id  ${asset.id}</h2>
        </div>
    </div>

</body>
</html>
