package Util;

import java.sql.Connection;
import java.sql.DriverManager;

// 数据库连接工具类
public class DbUtil {
    // 数据库相关信息
    private String db_url = "jdbc:mysql://localhost:3306/warehouse_management_system";
    private String db_username = "root";
    private String db_password = "123456";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";

    // 获取数据库连接
    public Connection getConn() throws Exception {
        Class.forName(jdbcName);
        Connection conn = DriverManager.getConnection(db_url, db_username, db_password);
        return conn;
    }

    // 关闭数据库连接
    public void close(Connection conn) throws Exception {
        if (conn != null) {
            conn.close();
        }
    }
}
