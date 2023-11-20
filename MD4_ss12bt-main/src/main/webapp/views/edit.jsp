<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/2023
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chỉnh sửa</h1>
<form action="/ProductController/edit" method="post">
    <input type="text" name="id" readonly value="${product.productCode}">
    <br>
    <input type="text" name="name" value="${product.productName}">
    <br>
    <input type="text" name="price" value="${product.productPrice}">
    <button type="submit">Update</button>
</form>
</body>
</html>
