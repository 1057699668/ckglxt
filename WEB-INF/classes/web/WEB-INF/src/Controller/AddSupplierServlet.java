package Controller;

import Dao.Dao;
import Entity.Element;
import Entity.Supplier;
import Util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

// 输入供应商信息的Servlet
@WebServlet("/Supplier")
public class AddSupplierServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int supplier_number = Integer.parseInt(request.getParameter("supplier_number"));
        String supplier_name = request.getParameter("supplier_name");
        int supplier_contact = Integer.parseInt(request.getParameter("supplier_contact"));
        String supplier_address = request.getParameter("supplier_address");
        DbUtil dbUtil = new DbUtil();
        Supplier supplier = new Supplier(supplier_number, supplier_name, supplier_contact, supplier_address);
        Dao dao = new Dao();
        try {
            Connection conn = dbUtil.getConn();
            if (dao.add_supplier(conn, supplier)) {
                response.sendRedirect("main.jsp"); // 添加信息成功跳转至主页面
            } else {
                response.sendRedirect("add_supplier.jsp"); // 添加信息失败重新添加
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
