package Controller;

import Entity.User;
import Dao.Dao;
import Util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

// 新用户注册Servlet
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_account = request.getParameter("user_account");
        String user_password = request.getParameter("user_password");
        DbUtil dbUtil = new DbUtil();
        User user = new User(user_account, user_password);
        Dao dao = new Dao();
        try {
            Connection conn = dbUtil.getConn();
            if (dao.register(conn, user)) {
                response.sendRedirect("login.jsp"); // 注册成功跳转至登录页面
            } else {
                response.sendRedirect("register.jsp"); // 注册失败重新注册
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

