<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/index.css"/>
    <title>仓库管理系统</title>
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

<center>
    <div class="center">
        <code><font size="5"><h3 style="color:black">欢迎使用仓库管理系统</h3></font></code>

        <tr>
            <strong><font size="2"><a href="add_element.jsp">
                <h3 style="color:black">
                    <li>添加零件信息</li>
                </h3>
            </a></font></strong>
            <strong><font size="2"><a href="add_supplier.jsp">
                <h3 style="color:black">
                    <li>添加供应商信息</li>
                </h3>
            </a></font></strong>
            <strong><font size="2"><a href="add_transaction.jsp">
                <h3 style="color:black">
                    <li>添加事务信息</li>
                </h3>
            </a></font></strong>
            <strong><font size="2"><a href="print_inventory_list.jsp">
                <h3 style="color:black">
                    <li>更新库存清单</li>
                </h3>
            </a></font></strong>
            <strong><font size="2"><a href="print_order_information.jsp">
                <h3 style="color:black">
                    <li>打印订货报表</li>
                </h3>
            </a></font></strong>
        </tr>
    </div>
    </body>
</center>
</html>