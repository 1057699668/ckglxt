<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/index.css" />
    <title>仓库管理系统</title>
    <style type="text/css" media="screen">
        .center{
            position:absolute;
            width: 200px;
            height: 120px;
            left: 50%;
            top: 50%;
            margin: -60px 0px 0px -60px;
        }
    </style>
</head>

<center>
    <div class="center">
        <h3 style="color:deepskyblue">欢迎使用仓库管理系统</h3>

        <tr>
            <a href="add_element.jsp"><li>添加零件信息</li></a>
            <a href="add_supplier.jsp" ><li>添加供应商信息</li></a>
            <a href="add_transaction.jsp"><li>添加事务信息</li></a>
        </tr>
    </div>
    </body>
</center>
</html>