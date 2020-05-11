package Controller;

import Dao.Dao;
import Entity.Element;
import Util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

// 输入零件信息Servlet
@WebServlet("/Element")
public class AddElementServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int element_number = Integer.parseInt(request.getParameter("element_number"));
        String element_name = request.getParameter("element_name");
        double element_price = Double.parseDouble(request.getParameter("element_price"));
        String major_supplier = request.getParameter("major_supplier");
        String secondary_supplier = request.getParameter("secondary_supplier");
        DbUtil dbUtil = new DbUtil();
        Element element = new Element(element_number, element_name, element_price, major_supplier, secondary_supplier);
        Dao dao = new Dao();
        try {
            Connection conn = dbUtil.getConn();
            if (dao.add_element(conn, element)) {
                response.sendRedirect("main.jsp"); // 添加信息成功跳转至主页面
            } else {
                response.sendRedirect("add_element.jsp"); // 添加信息失败重新添加
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
