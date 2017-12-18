package mainprogram.taikhoan;

import dbconnection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Process {

    public static Connection con = DBconnection.connection();
    public static PreparedStatement pst = null;

    public void loadData(ResultSet r, JTable table) {
        String[] arr = {"Mã thành viên", "Họ tên", "Tuổi", "Giới tính", "Nghề nghiệp", "Tài khoản", "Quyền"};
        DefaultTableModel model = new DefaultTableModel(null, arr);
        table.setRowHeight(30);
        try {
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("idThanhVien"));
                v.add(r.getString("HoTen"));
                v.add(r.getString("Tuoi"));
                v.add(r.getString("GioiTinh"));
                v.add(r.getString("NgheNghiep"));
                v.add(r.getString("TaiKhoan"));
                v.add(r.getString("Quyen"));
                model.addRow(v);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    public void addData(String ten, String tuoi, String nghenghiep,
            String gioitinh, String taikhoan, String matkhau, String quyen) {
        String sql = "insert into thanhvien "
                + "(HoTen,Tuoi,NgheNghiep,GioiTinh,TaiKhoan,MatKhau,Quyen) values "
                + "(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ten);
            pst.setString(2, tuoi);
            pst.setString(3, nghenghiep);
            pst.setString(4, gioitinh);
            pst.setString(5, taikhoan);
            pst.setString(6, matkhau);
            pst.setString(7, quyen);
            pst.execute();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    public void editData(String ten, String tuoi, String nghenghiep,
            String gioitinh, String quyen, String matv) {
        String sql = "update thanhvien set "
                + "HoTen = ?,Tuoi = ?, NgheNghiep=?,GioiTinh=?,"
                + "Quyen=? where idThanhVien=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ten);
            pst.setString(2, tuoi);
            pst.setString(3, nghenghiep);
            pst.setString(4, gioitinh);
            pst.setString(5, quyen);
            pst.setString(6, matv);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    public void delMember(String matv) {
        String sql = "delete from thanhvien where idThanhVien = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    public void delData(String mtv) {
        String sql = "delete from giaodich where ThanhVien = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, mtv);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
    
    public ResultSet getData(String data){
        ResultSet r=null;
        String sql="select * from thanhvien where idThanhVien like ? or HoTen like ? or "
                + "Tuoi like ? or NgheNghiep like ? or GioiTinh like ? or TaiKhoan like ? "
                + " or Quyen like ? ";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, '%'+data+'%');
            pst.setString(2, '%'+data+'%');
            pst.setString(3, '%'+data+'%');
            pst.setString(4, '%'+data+'%');
            pst.setString(5, '%'+data+'%');
            pst.setString(6, '%'+data+'%');
            pst.setString(7, '%'+data+'%');
            r=pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return r;
    }
}
