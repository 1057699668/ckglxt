package Controller;

import Dao.Dao;
import Entity.Transaction;
import Util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

// 输入事务信息的Servlet
@WebServlet("/Transaction")
public class AddTransactionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int transaction_number = Integer.parseInt(request.getParameter("transaction_number"));
        String transaction_type = request.getParameter("transaction_type");
        int transaction_amount = Integer.parseInt(request.getParameter("transaction_amount"));
        String transaction_time = request.getParameter("transaction_time");
        DbUtil dbUtil = new DbUtil();
        Transaction transaction = new Transaction(transaction_number, transaction_type, transaction_amount, transaction_time);
        Dao dao = new Dao();
        try {
            Connection conn = dbUtil.getConn();
            if (dao.add_transaction(conn, transaction)) {
                response.sendRedirect("main.jsp"); // 添加信息成功跳转至主页面
            } else {
                response.sendRedirect("add_transaction.jsp"); // 添加信息失败重新添加
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
