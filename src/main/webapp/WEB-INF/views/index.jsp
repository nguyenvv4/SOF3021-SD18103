<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<p>Hello </p>
<%--<form action="/sinh-vien/add" , method="post">--%>
<%--    <div class="form-group">--%>
<%--        <label>id</label>--%>
<%--        <input class="form-control" name="id">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Username</label>--%>
<%--        <input class="form-control" id="" name="username">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Dia chi</label>--%>
<%--        <input class="form-control" name="diaChi">--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label>Gioi Tinh</label><br>--%>
<%--        <input type="radio" id="contactChoice2" name="gioiTinh" value="Nam"/>--%>
<%--        <label for="contactChoice2">Nam</label>--%>
<%--        <input type="radio" id="contactChoice3" name="gioiTinh" value="Nu"/>--%>
<%--        <label for="contactChoice3">Nu</label>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--</form>--%>
<form:form action="/sinh-vien/add" modelAttribute="sinhVien">
    <div class="form-group">
        <label>id</label>
        <form:input path="id" class="form-control"/> <br/>
        <form:errors path="id"/>
    </div>

    <form:input path="username"/> <br/>
    <form:errors path="username"/>
    <form:input path="diaChi"/>
    <form:input path="gioiTinh"/>
    <button>Save</button>

</form:form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">username</th>
        <th scope="col">gioi tinh</th>
        <th scope="col">dia chi</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sinhVien">
        <tr>
            <td>${sinhVien.id}</td>
            <td>${sinhVien.username}</td>
            <td>${sinhVien.gioiTinh}</td>
            <td>${sinhVien.diaChi}</td>
            <td><a class="btn btn-primary" href="/sinh-vien/detail/${sinhVien.id}">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>