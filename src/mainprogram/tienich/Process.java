package mainprogram.tienich;

import dbconnection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Process {

    public static Connection con = DBconnection.connection();
    public static PreparedStatement pst = null;
    SimpleDateFormat form = new SimpleDateFormat("dd - MM - yyyy");

    //hạng mục
    public void loadHangMuc(ResultSet r, JList list) {
        Vector v = new Vector();
        try {
            while (r.next()) {
                v.add(" + " + r.getString("Ten"));
            }
            list.setListData(v);
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
    }

    public void themHangMuc(String sql, String ten) {
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ten);
            pst.execute();
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
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

    public void xoaHangMuc(String sql, String ten) {
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ten);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    //xem thành viên
    //load id Thanh Vien
    public void loadThanhVien(ResultSet r, JComboBox box) {
        try {
            while (r.next()) {
                box.addItem(r.getString("idThanhVien"));
            }
        } catch (SQLException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
    }

    //tim kiem tat ca thanh vien
    public ResultSet searchDataThu(String date1, String date2, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucthu as b,thanhvien as c "
                + "where a.HangMuc=b.idHangMucThu and a.ThanhVien=c.idThanhVien and Ngay>= ? and Ngay<=?) "
                + " as a where HoTen like ? or "
                + "idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1 + '%');
            pst.setString(2, date2 + '%');
            pst.setString(3, '%' + data + '%');
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            pst.setString(8, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public ResultSet searchDataChi(String date1, String date2, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucchi as b,thanhvien as c "
                + "where a.HangMuc=b.idHangMucChi and a.ThanhVien=c.idThanhVien and Ngay>= ? and Ngay<=?) "
                + " as a where HoTen like ? or "
                + "idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1 + '%');
            pst.setString(2, date2 + '%');
            pst.setString(3, '%' + data + '%');
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            pst.setString(8, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public void searchData(JTable table, String date1, String date2, String data) {
        table.removeAll();

        String[] arr = {"Mã giao dịch", "Thu/Chi", "Hạng mục", "Số tiền", "Ngày", "Giờ", "Diễn giải", "Thành viên"};
        DefaultTableModel model = new DefaultTableModel(null, arr);

        ResultSet r1 = searchDataThu(date1, date2, data);
        ResultSet r2 = searchDataChi(date1, date2, data);
        try {
            while (r1.next()) {
                Vector v = new Vector();
                v.add(r1.getString("idGiaoDich"));
                v.add(r1.getString("Loai"));
                v.add(r1.getString("Ten"));
                v.add(r1.getString("SoTien"));
                String d = form.format(r1.getDate("Ngay"));
                v.add(d);
                v.add(r1.getString("Gio"));
                v.add(r1.getString("DienGiai"));
                v.add(r1.getString("HoTen"));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        try {
            while (r2.next()) {
                Vector v = new Vector();
                v.add(r2.getString("idGiaoDich"));
                v.add(r2.getString("Loai"));
                v.add(r2.getString("Ten"));
                v.add(r2.getString("SoTien"));
                String d = form.format(r2.getDate("Ngay"));
                v.add(d);
                v.add(r2.getString("Gio"));
                v.add(r2.getString("DienGiai"));
                v.add(r2.getString("HoTen"));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        table.setModel(model);
    }

    //tim kiem tung thanh vien
    public ResultSet searchDataThu(String date1, String date2, String matv, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucthu as b,thanhvien as c "
                + "where a.HangMuc=b.idHangMucThu and a.ThanhVien=c.idThanhVien and Ngay>= ? and Ngay<=? "
                + "and a.ThanhVien like?) "
                + " as a where HoTen like ? or "
                + "idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1 + '%');
            pst.setString(2, date2 + '%');
            pst.setString(3, matv);
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            pst.setString(8, '%' + data + '%');
            pst.setString(9, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public ResultSet searchDataChi(String date1, String date2, String matv, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucchi as b,thanhvien as c "
                + "where a.HangMuc=b.idHangMucChi and a.ThanhVien=c.idThanhVien and Ngay>= ? and Ngay<=?"
                + " and a.ThanhVien like?) "
                + " as a where HoTen like ? or "
                + "idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1 + '%');
            pst.setString(2, date2 + '%');
            pst.setString(3, matv);
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            pst.setString(8, '%' + data + '%');
            pst.setString(9, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public void searchData(JTable table, String date1, String date2, String matv, String data) {
        table.removeAll();

        String[] arr = {"Mã giao dịch", "Thu/Chi", "Hạng mục", "Số tiền", "Ngày", "Giờ", "Diễn giải", "Thành viên"};
        DefaultTableModel model = new DefaultTableModel(null, arr);

        ResultSet r1 = searchDataThu(date1, date2, matv, data);
        ResultSet r2 = searchDataChi(date1, date2, matv, data);
        try {
            while (r1.next()) {
                Vector v = new Vector();
                v.add(r1.getString("idGiaoDich"));
                v.add(r1.getString("Loai"));
                v.add(r1.getString("Ten"));
                v.add(r1.getString("SoTien"));
                String d = form.format(r1.getDate("Ngay"));
                v.add(d);
                v.add(r1.getString("Gio"));
                v.add(r1.getString("DienGiai"));
                v.add(r1.getString("HoTen"));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        try {
            while (r2.next()) {
                Vector v = new Vector();
                v.add(r2.getString("idGiaoDich"));
                v.add(r2.getString("Loai"));
                v.add(r2.getString("Ten"));
                v.add(r2.getString("SoTien"));
                String d = form.format(r2.getDate("Ngay"));
                v.add(d);
                v.add(r2.getString("Gio"));
                v.add(r2.getString("DienGiai"));
                v.add(r2.getString("HoTen"));
                model.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        table.setModel(model);
    }

    //biểu đồ cột
    public ResultSet getDataChi(String date1, String date2) {
        ResultSet r = null;
        String sql = "select ThanhVien,sum(SoTien) from (select ThanhVien,SoTien from giaodich "
                + "where Loai='chi' and Ngay>= ? and Ngay <= ? ) as a group by ThanhVien";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1);
            pst.setString(2, date2);
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public ResultSet getDataThu(String date1, String date2) {
        ResultSet r = null;
        String sql = "select ThanhVien,sum(SoTien) from (select ThanhVien,SoTien from giaodich "
                + "where Loai='thu' and Ngay>= ? and Ngay <= ? ) as a group by ThanhVien";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date1);
            pst.setString(2, date2);
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public ResultSet getThanhVienChuaGiaoDich() {
        ResultSet r = null;
        String sql = "select idThanhVien from thanhvien where idThanhVien "
                + "not in (select distinct ThanhVien from giaodich)";
        try {
            pst = con.prepareStatement(sql);
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public CategoryDataset createDataset(ResultSet chi, ResultSet thu) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        ResultSet r = getThanhVienChuaGiaoDich();
        try {
            while (chi.next()) {
                dataSet.addValue((chi.getInt(2) / 1000), "Chi", chi.getString(1));
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        try {
            while (thu.next()) {
                dataSet.addValue((thu.getInt(2) / 1000), "Thu", thu.getString(1));
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        try {
            while (r.next()) {
                dataSet.addValue(0, "Thu", r.getString(1));
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return dataSet;
    }

    public JFreeChart createBarChart(CategoryDataset data, String title) {
        JFreeChart barChart;
        barChart = ChartFactory.createBarChart(title, "Mã thành viên", "Số tiền (nghìn đồng)", data,
                PlotOrientation.VERTICAL, true, true, false);
        return barChart;
    }

}
