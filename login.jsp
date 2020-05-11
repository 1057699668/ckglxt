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
            height: 100px;
            left: 50%;
            top: 30%;
            margin: -100px 0px 0px -100px;

        }
    </style>
</head>
<div class="center">

    <center>
        <form action="/ckglxt/Login" method="post">
            <code><font size="5"><h3 style="color:black">欢迎登录!</h3></font></code>
            <code><font size="3">账号：</font></code><input name="user_account" type="text" style="width:150px"><br>
            <code><font size="3">密码：</font></code><input name="user_password" type="password" style="width:150px"><br>
            <input type="submit" value="登录" class="submit" style="width:50px;height: 30px">
            <input type="reset" value="重置" class="reset" style="width:50px;height: 30px">
        </form>

    </center>
</div>
</body>
</html>