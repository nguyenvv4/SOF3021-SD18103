<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<p>Hello </p>
<form action="/sinh-vien/update/${sinhVien.id}" , method="post">

    <div class="form-group">
        <label>Username</label>
        <input class="form-control" id="" name="username" value="${sinhVien.username}">
    </div>
    <div class="form-group">
        <label>Dia chi</label>
        <input class="form-control" name="diaChi" value="${sinhVien.diaChi}">
    </div>
    <div>
        <label>Gioi Tinh</label><br>
        <input type="radio" id="contactChoice2" name="gioiTinh" value="Nam"/>
        <label for="contactChoice2">Nam</label>
        <input type="radio" id="contactChoice3" name="gioiTinh" value="Nu"/>
        <label for="contactChoice3">Nu</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>