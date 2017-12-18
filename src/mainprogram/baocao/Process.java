package mainprogram.baocao;

import dbconnection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Process {

    public static Connection con = DBconnection.connection();
    public static PreparedStatement pst = null;
    SimpleDateFormat form = new SimpleDateFormat("dd - MM - yyyy");

    private long tong = 0;

    public long getTong() {
        return tong;
    }

    public void setTong(long tong) {
        this.tong = tong;
    }
    DecimalFormat tl = new DecimalFormat("0.00");

    //vẽ biểu đồ tròn
    //load du lieu
    public ResultSet loadDataChi(String date, String matv) {
        ResultSet r = null;
        String sql = "select Ten,Sum(SoTien) as tong from giaodich as a,hangmucchi as b where"
                + " a.HangMuc=b.idHangMucChi and ThanhVien like ? and Ngay like ? group by HangMuc";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    public ResultSet loadDataThu(String date, String matv) {
        ResultSet r = null;
        String sql = "select Ten,Sum(SoTien) as tong from giaodich as a,hangmucthu as b where"
                + " a.HangMuc=b.idHangMucThu and ThanhVien Like ? and Ngay like ? group by HangMuc";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    public void loadData(ResultSet r, JTable table) {
        table.removeAll();
        String[] arr = {"Hạng mục", "Số tiền (VND)", "Tỉ lệ (%)"};
        DefaultTableModel model = new DefaultTableModel(null, arr);
        try {
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString("Ten"));
                v.add(r.getString("tong"));
                v.add(tl.format((float) 100 * r.getInt("tong") / tong));
                model.addRow(v);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
    }

    public PieDataset CreateData(ResultSet r) {
        DefaultPieDataset data = new DefaultPieDataset();
        try {
            while (r.next()) {
                data.setValue(r.getString("Ten"), r.getInt("tong"));
                tong += r.getInt("tong");
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return data;
    }

    public JFreeChart CreatePieChart(PieDataset data) {
        JFreeChart pieChart = ChartFactory.createPieChart("", data, true, true, Locale.UK);
        return pieChart;
    }

    //biêu đo cot
    //theo nam
    public ResultSet loadDataThuNam(String date, String matv) {
        ResultSet r = null;
        String sql = "select year(Ngay) ,Sum(SoTien) as tong from giaodich where Loai = 'thu' and"
                + " ThanhVien Like ? and Ngay like ? group by year(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    public ResultSet loadDataChiNam(String date, String matv) {
        ResultSet r = null;
        String sql = "select year(Ngay) ,Sum(SoTien) as tong from giaodich where Loai='chi' and"
                + " ThanhVien Like ? and Ngay like ? group by year(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    //thang
    public ResultSet loadDataThuThang(String date, String matv) {
        ResultSet r = null;
        String sql = "select month(Ngay) ,Sum(SoTien) as tong from giaodich where Loai = 'thu' and"
                + " ThanhVien Like ? and Ngay like ? group by month(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    public ResultSet loadDataChiThang(String date, String matv) {
        ResultSet r = null;
        String sql = "select month(Ngay) ,Sum(SoTien) as tong from giaodich where Loai='chi' and"
                + " ThanhVien Like ? and Ngay like ? group by month(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    //Ngay
    public ResultSet loadDataThuNgay(String date, String matv) {
        ResultSet r = null;
        String sql = "select day(Ngay) ,Sum(SoTien) as tong from giaodich where Loai = 'thu' and"
                + " ThanhVien Like ? and Ngay like ? group by day(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    public ResultSet loadDataChiNgay(String date, String matv) {
        ResultSet r = null;
        String sql = "select day(Ngay) ,Sum(SoTien) as tong from giaodich where Loai='chi' and"
                + " ThanhVien Like ? and Ngay like ? group by day(Ngay)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, matv);
            pst.setString(2, date + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }

        return r;
    }

    //load table
    public void loadData(ResultSet r, JTable table, int i) {
        table.removeAll();
        String[] arr = {"Thời gian", "Số tiền"};
        DefaultTableModel model = new DefaultTableModel(null, arr);

        try {
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString(1));
                v.add(r.getString(2));
                model.addRow(v);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
    }

    //biểu đồ
    public CategoryDataset createDataset(ResultSet chi,ResultSet thu) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        try {
            while (chi.next()) {
                dataSet.addValue((chi.getInt(2)/1000), "Chi", chi.getString(1));
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        try {
            while (thu.next()) {
                dataSet.addValue((thu.getInt(2)/1000), "Thu", thu.getString(1));
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return dataSet;
    }
    
    public JFreeChart createBarChart(CategoryDataset data,String title,String time) {
        JFreeChart barChart;
        barChart = ChartFactory.createBarChart(title,time,"Số tiền (nghìn đồng)", data,
                                    PlotOrientation.VERTICAL, true, true, false);
        return barChart;
    }

    //tình hình thu chi
    public ResultSet searchDataThu(String date, String matv, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucthu as b where a.HangMuc=b.idHangMucThu and Ngay like ? "
                + "and ThanhVien like ?)as a where idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date + '%');
            pst.setString(2, matv);
            pst.setString(3, '%' + data + '%');
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public ResultSet searchDataChi(String date, String matv, String data) {
        ResultSet r = null;
        String sql = "select * from (select * from giaodich as a,hangmucchi as b where a.HangMuc=b.idHangMucChi and Ngay like ? "
                + "and ThanhVien like ?) as a where idGiaoDich like ? or Loai like ? or SoTien like ? or Ten like ? or DienGiai like ?"
                + " order by Ngay";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date + '%');
            pst.setString(2, matv);
            pst.setString(3, '%' + data + '%');
            pst.setString(4, '%' + data + '%');
            pst.setString(5, '%' + data + '%');
            pst.setString(6, '%' + data + '%');
            pst.setString(7, '%' + data + '%');
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public void searchData(JTable table, String date, String matv, String data) {

        table.removeAll();
        String[] arr = {"Mã giao dịch", "Thu/Chi", "Hạng mục", "Số tiền", "Ngày", "Giờ", "Diễn giải"};
        DefaultTableModel model = new DefaultTableModel(null, arr);

        ResultSet r1 = searchDataThu(date, matv, data);
        ResultSet r2 = searchDataChi(date, matv, data);
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
                model.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        table.setModel(model);
    }

    //tong thu chi
    public ResultSet getData(String loai, String date, String matv) {
        ResultSet r = null;
        String sql = "select Loai,sum(SoTien) as tong from giaodich where Ngay like ?"
                + " and ThanhVien like ? and Loai like ? "
                + " group by Loai";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, date + '%');
            pst.setString(2, matv);
            pst.setString(3, loai);
            r = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        return r;
    }

    public void searchData(String date, String matv, JLabel thu, JLabel chi, JLabel tong) {
        ResultSet r1 = getData("thu", date, matv);
        ResultSet r2 = getData("chi", date, matv);
        int t = 0, c = 0;
        try {
            while (r1.next()) {
                t = r1.getInt("tong");
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        try {
            while (r2.next()) {
                c = r2.getInt("tong");
            }
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
        thu.setText(String.valueOf(t));
        chi.setText(String.valueOf(c));
        tong.setText(String.valueOf(t - c));
    }

    //xoa du lieu
    public void delData(String magd) {
        String sql = "delete from giaodich where idGiaoDich = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, magd);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.print("Lỗi: " + ex.getMessage());
        }
    }

    //them tu file
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

}
