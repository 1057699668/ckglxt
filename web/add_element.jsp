<%--
  Created by IntelliJ IDEA.
  User: -QL-
  Date: 2020/5/10
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <title>添加零件信息</title>
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
        <code><font size="5"><h3 style="color:black">添加零件信息</h3></font></code>
        <form action="/ckglxt/Element" method="post">
            <table>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">零件编号:</font></code>
                    </td>
                    <td>
                        <input type="text" name="element_number" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">零件名称:</font></code>
                    </td>
                    <td>
                        <input type="text" name="element_name" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">当前价格:</font></code>
                    </td>
                    <td>
                        <input type="text" name="element_price" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">主要供应商:</font></code>
                    </td>
                    <td>
                        <input type="text" name="major_supplier" style="width:150px;height:20px"/>
                    </td>
                </tr>
                <tr>
                    <td class="alignRight">
                        <code><font size="3">次要供应商:</font></code>
                    </td>
                    <td>
                        <input type="text" name="secondary_supplier" style="width:150px;height:20px"/>
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