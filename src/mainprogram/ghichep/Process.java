package mainprogram.ghichep;

import dbconnection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class Process {

    public static Connection con = DBconnection.connection();
    public static PreparedStatement pst = null;

    public void loadHangMuc(ResultSet r, JComboBox box) {
        box.addItem("");
        try {
            while (r.next()) {
                box.addItem(r.getString("Ten"));
            }
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
        box.addItem("Khác");
    }

    public ResultSet getHangMucChiId(String hangmuc) {
        ResultSet r = null;
        String sql = "select idHangMucChi from hangmucchi where ten like ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, hangmuc);
            r = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        return r;
    }

    public String getHangMucChiId(ResultSet r) {
        String hangmuc = null;
        try {
            while (r.next()) {
                hangmuc = r.getString("idHangMucChi");
            }
            return hangmuc;
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
        return null;
    }

    public void ghiChep(String loai, String tien, String ngay, String gio, String hangmuc, String diengiai, String matv) {
        String sql = "insert into giaodich "
                + "(Loai,SoTien,Ngay,Gio,HangMuc,DienGiai,ThanhVien) "
                + "values (?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, loai);
            pst.setString(2, tien);
            pst.setString(3, ngay);
            pst.setString(4, gio);
            pst.setString(5, hangmuc);
            pst.setString(6, diengiai);
            pst.setString(7, matv);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    public ResultSet getHangMucThuId(String hangmuc) {
        ResultSet r = null;
        String sql = "select idHangMucThu from hangmucthu where ten like ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, hangmuc);
            r = pst.executeQuery();
        } catch (SQLException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        return r;
    }

    public String getHangMucThuId(ResultSet r) {
        String hangmuc = null;
        try {
            while (r.next()) {
                hangmuc = r.getString("idHangMucThu");
            }
            return hangmuc;
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
        return null;
    }

    public void editData(String id, String tien, String ngay,
            String gio, String hangmuc, String diengiai) {
        String sql = "update giaodich set "
                + "SoTien = ?,Ngay = ?,Gio = ?,HangMuc = ?,DienGiai=? "
                + "where idGiaoDich = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, tien);
            pst.setString(2, ngay);
            pst.setString(3, gio);
            pst.setString(4, hangmuc);
            pst.setString(5, diengiai);
            pst.setString(6, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
    }

    public boolean checkNumber(String text) {
        for(int i=0;i<text.length();i++){
            if(Character.isLetter(text.charAt(i)))
                return false;
        }
        return true;
    }

}
