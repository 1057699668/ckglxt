<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <title>新用户注册</title>
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
        <code><font size="5"><h3 style="color:black">新用户注册</h3></font></code>
        <form action="/Warehouse_Management_System_war_exploded/Register" method="post">
            <table>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">账号:</font></code>
                    </td>
                    <td>
                        <input type="text" name="user_account" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">密码:</font></code>
                    </td>
                    <td>
                        <input type="password" name="user_password" style="width:150px;height:20px"/>
                    </td>
                </tr>

            </table>
            <input type="submit" value="提交" class="submit" style="width:50px;height: 30px">
            <input type="reset" value="重置" class="reset" style="width:50px;height: 30px">
        </form>
    </center>
</div>
</body>
</html>