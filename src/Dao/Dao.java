package Dao;

import Entity.*;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.security.spec.PSSParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 工具类
public class Dao {
    // 登录验证
    public User login(Connection conn, User user) throws Exception {
        User result_user = null;
        String sql = "SELECT * FROM user WHERE user_account=? AND user_password=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUser_account());
        pstmt.setString(2, user.getUser_password());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            result_user = new User();
            result_user.setUser_account(rs.getString("user_account"));
            result_user.setUser_password(rs.getString("user_password"));
        }
        return result_user;
    }

    // 注册功能
    public boolean register(Connection conn, User user) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO user(user_account,user_password) VALUES (?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUser_account());
        pstmt.setString(2, user.getUser_password());
        if (pstmt.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }

    // 输入零件信息功能
    public boolean add_element(Connection conn, Element element) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO element(lql_element_number,lql_element_name,lql_element_price,lql_major_supplier,lql_secondary_supplier) VALUES(?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, element.getElement_number());
        pstmt.setString(2, element.getElement_name());
        pstmt.setDouble(3, element.getElement_price());
        pstmt.setString(4, element.getMajor_supplier());
        pstmt.setString(5, element.getSecondary_supplier());
        if (pstmt.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }

    // 输入供应商信息功能
    public boolean add_supplier(Connection conn, Supplier supplier) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO supplier(lql_supplier_number,lql_supplier_name,lql_supplier_contact,lql_supplier_address) VALUES(?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, supplier.getSupplier_number());
        pstmt.setString(2, supplier.getSupplier_name());
        pstmt.setInt(3, supplier.getSupplier_contact());
        pstmt.setString(4, supplier.getSupplier_address());
        if (pstmt.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }

    // 输入事务信息功能
    public boolean add_transaction(Connection conn, Transaction transaction) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO transaction(lql_transaction_number,lql_transaction_type,lql_transaction_amount,lql_transaction_time) VALUES(?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, transaction.getTransaction_number());
        pstmt.setString(2, transaction.getTransaction_type());
        pstmt.setInt(3, transaction.getTransaction_amount());
        pstmt.setString(4, transaction.getTransaction_time());
        if (pstmt.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }

    // 更新库存清单功能
    public boolean update_list(Connection conn, InventoryList inventoryList) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "";
        pstmt = conn.prepareStatement(sql);
        return flag;
    }

    // 打印订货报表功能
    public boolean print_order(Connection conn, OrderInformation orderInformation) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "";
        pstmt = conn.prepareStatement(sql);
        return flag;
    }
}
