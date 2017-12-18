
package dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SQLprocess {
    public static Connection con = null;
    public static ResultSet result = null;
    public static PreparedStatement pst = null;

    public static ResultSet getData(String sql) {
        con = DBconnection.connection();
        try {
            pst = con.prepareStatement(sql);
            result = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
        return result;
    }
}
