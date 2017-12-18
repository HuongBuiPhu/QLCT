package mainprogram.tienich;

import dbconnection.SQLprocess;
import fileprocess.ExportFile;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import mainprogram.Program;
import org.jfree.chart.ChartPanel;

public class XemThanhVien extends javax.swing.JPanel {

    Process process;
    String sql = "select idThanhVien from thanhvien";
    SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat form1 = new SimpleDateFormat("dd/MM/yyyy");

    ExportFile exp;
    Program program;
    BarChart frame;
    boolean isStart;

    public XemThanhVien(Program program) {
        initComponents();
        table.setRowHeight(30);
        this.program = program;

        process = new Process();
        exp = new ExportFile();

        isStart = true;

        process.loadThanhVien(SQLprocess.getData(sql), maTvCb);
        process.searchData(table, "0000-1-1", "9999-12-31", searchTf.getText().trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        maTvCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        searchTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        searchBut = new javax.swing.JButton();
        fileBut = new javax.swing.JButton();
        showChartBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tình hình chi tiêu các thành viên");

        table.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(102, 102, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id giao dịch", "số tiền", "Hạng mục", "thời gian", "diễn giải"
            }
        ));
        table.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Mã thành viên");

        maTvCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả thành viên" }));
        maTvCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maTvCbItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tìm kiếm");

        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTfKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Từ  ");

        fromDate.setForeground(new java.awt.Color(102, 102, 102));
        fromDate.setDateFormatString("dd - MM - yyyy");
        fromDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Đến  ");

        toDate.setForeground(new java.awt.Color(102, 102, 102));
        toDate.setDateFormatString("dd - MM - yyyy");
        toDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchBut.setBackground(new java.awt.Color(255, 255, 255));
        searchBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/timkiem.png"))); // NOI18N
        searchBut.setBorder(null);
        searchBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButMouseClicked(evt);
            }
        });
        searchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButActionPerformed(evt);
            }
        });

        fileBut.setBackground(new java.awt.Color(255, 255, 255));
        fileBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file.png"))); // NOI18N
        fileBut.setBorder(null);
        fileBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileButMouseClicked(evt);
            }
        });

        showChartBut.setBackground(new java.awt.Color(255, 255, 255));
        showChartBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showchart.png"))); // NOI18N
        showChartBut.setBorder(null);
        showChartBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showChartButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(maTvCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fileBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(showChartBut)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(showChartBut)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maTvCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButActionPerformed

    private void maTvCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maTvCbItemStateChanged
        // TODO add your handling code here
        if (maTvCb.getSelectedIndex() == 0) {
            process.searchData(table, "0000-1-1", "9999-12-31", searchTf.getText().trim());
        } else {
            String sql = "select HoTen from thanhvien where idThanhVien = " + maTvCb.getSelectedItem().toString();
            process.searchData(table, "0000-1-1", "9999-12-31", maTvCb.getSelectedItem().toString(),
                    searchTf.getText().trim());
        }
        isStart = false;
    }//GEN-LAST:event_maTvCbItemStateChanged

    private void searchButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButMouseClicked
        // TODO add your handling code here:
        if (maTvCb.getSelectedIndex() == 0) {
            String date1 = form.format(fromDate.getDate());
            String date2 = form.format(toDate.getDate());
            process.searchData(table, date1, date2, searchTf.getText().trim());
        } else {
            String date1 = form.format(fromDate.getDate());
            String date2 = form.format(toDate.getDate());
            process.searchData(table, date1, date2, maTvCb.getSelectedItem().toString(), searchTf.getText().trim());
        }
        isStart = false;
    }//GEN-LAST:event_searchButMouseClicked

    private void searchTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyPressed
        // TODO add your handling code here:
        if (maTvCb.getSelectedIndex() == 0) {
            String date1 = form.format(fromDate.getDate());
            String date2 = form.format(toDate.getDate());
            process.searchData(table, date1, date2, searchTf.getText().trim());
        } else {
            String date1 = form.format(fromDate.getDate());
            String date2 = form.format(toDate.getDate());
            process.searchData(table, date1, date2, maTvCb.getSelectedItem().toString(), searchTf.getText().trim());
        }
        isStart = false;
    }//GEN-LAST:event_searchTfKeyPressed

    private void fileButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileButMouseClicked
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xuất ra file các dữ liệu này?", "Thông báo", 0);
        if (choose == JOptionPane.YES_OPTION) {
            String tieude = "BẢNG KÊ THU CHI CÁC THÀNH VIÊN";
            String time = "Từ ngày " + form1.format(fromDate.getDate()) + "đến ngày " + form1.format(toDate.getDate());
            exp.exportExcel(table, 6, 0, tieude, time, "Tài khoản: " + program.hoten, "-1", "-1");
        }
        isStart = false;
    }//GEN-LAST:event_fileButMouseClicked

    private void showChartButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showChartButActionPerformed
        // TODO add your handling code here:
        drawChart();
    }//GEN-LAST:event_showChartButActionPerformed

    private void drawChart() {
        if (isStart) {
            String title = "Tình hình chi tiêu tất cả thành viên";
            ChartPanel chart = new ChartPanel(process.createBarChart(process.createDataset(
                    process.getDataChi("0000-1-1", "9999-12-31"), process.getDataThu("0000-1-1", "9999-12-31")), title));
            frame = new BarChart(chart);
            frame.setVisible(true);
        } else {
            String date1 = form.format(fromDate.getDate());
            String date2 = form.format(toDate.getDate());
            String title = "Tình hình chi tiêu các thành viên từ " + form1.format(fromDate.getDate())
                    + " đến " + form1.format(toDate.getDate());
            ChartPanel chart = new ChartPanel(process.createBarChart(process.createDataset(
                    process.getDataChi(date1, date2), process.getDataThu(date1, date2)), title));
            frame = new BarChart(chart);
            frame.setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fileBut;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> maTvCb;
    private javax.swing.JButton searchBut;
    private javax.swing.JTextField searchTf;
    private javax.swing.JButton showChartBut;
    private javax.swing.JTable table;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
