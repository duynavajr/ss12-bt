<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h1>Danh sách công việc</h1>
<td><a href="/ProductController/add/${p.productCode}">Add</a></td>
<table border="10" cellpadding="10" cellspacing="10">
    <thead>
    <tr>
        <th>Id</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${product}" var="p" >
        <tr>
            <td>${p.productCode}</td>
            <td>${p.productName}</td>
            <td>${p.productPrice}</td>
            <td><a href="/ProductController/edit/${p.productCode}">Edit</a></td>
            <td><a onclick="return confirm('Are u sure to delete this item?')" href="/ProductController/delete/${p.productCode}">Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
