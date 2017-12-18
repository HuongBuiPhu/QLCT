
package dbconnection;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBconnection {

    public static Connection connection() {

        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/qlct";
        String username = "username";
        String pass = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo", 0);
        }
        return con;
    }
}

