<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <title>添加事务信息</title>
    <style type="text/css" media="screen">
        .center {
            position: absolute;
            width: 300px;
            height: 100px;
            left: 50%;
            top: 30%;
            margin: -100px 0px 0px -100px;

        }
    </style>
</head>
<div class="center">
    <center>
        <code><font size="5"><h3 style="color:black">添加事务信息</h3></font></code>
        <form action="/ckglxt/Transaction" method="post">
            <table>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">事务(零件)编号:</font></code>
                    <td>
                        <input type="text" name="transaction_number" style="width:150px;height:20px;"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">事务类型(出库/入库):</font></code>
                    </td>
                    <td>
                        <input type="text" name="transaction_type" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">出/入库数量:</font></code>
                    </td>
                    <td>
                        <input type="text" name="transaction_amount" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">时间:</font></code>
                    </td>
                    <td>
                        <input type="text" name="transaction_time" style="width:150px;height:20px"/>
                    </td>
                </tr>
            </table>
            <input type="submit" value="提交" class="submit">
            <input type="reset" value="重置" class="reset">
        </form>
    </center>
</div>
</body>
</html>