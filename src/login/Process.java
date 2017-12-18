package login;

import dbconnection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Process {

    public static Connection con = DBconnection.connection();
    public static PreparedStatement pst = null;

    public ResultSet testUser(String tk, String mk) {
        ResultSet r = null;
        String sql = "select idThanhVien,HoTen,Quyen from thanhvien where TaiKhoan=? and MatKhau=? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, tk);
            pst.setString(2, mk);
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
        return r;
    }

    public void changePass(String pass, String id) {
        String sql = "update thanhvien set MatKhau = ? where idThanhVien = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,pass);
            pst.setString(2,id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

}
