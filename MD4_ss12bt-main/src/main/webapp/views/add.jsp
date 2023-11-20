<html xmlns:th="http://www.thymeleaf.org">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới</h1>
<form th:action="/ProductController/add" method="post" >
    <label for="productCode">Id</label>
    <input id="productCode" type="text" name="productCode" value="${product.productCode}">
    <br>
    <label for="productName">Tên</label>
    <input id="productName" type="text" name="productName"  value="${product.productName}">
    <br>
    <label for="productPrice">Giá</label>
    <input id="productPrice" type="number" name="productPrice" value="${product.productPrice}">
    <br>
    <button type="submit">Add</button>
</form>
</body>
</html>
