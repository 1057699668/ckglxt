<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户登录</title>
    <style type="text/css" media="screen">
        .center {
            position: absolute;
            width: 250px;
            height: 120px;
            left: 50%;
            top: 50%;
            margin: -100px 0px 0px -100px;

        }
    </style>
</head>
<div class="center">

    <center>
        <form action="/Wirehouse_Management_System_war_exploded/Login" method="post">
            <h3 style="color:deepskyblue">欢迎登录!</h3>
            账号：<input name="user_account" type="text" style="width:150px"><br>
            密码：<input name="user_password" type="password" style="width:150px"><br>
            <input type="submit" value="登录" class="submit" style="width:50px;height: 30px">
            <input type="reset" value="重置" class="reset" style="width:50px;height: 30px">
        </form>

    </center>
</div>
</body>
</html>