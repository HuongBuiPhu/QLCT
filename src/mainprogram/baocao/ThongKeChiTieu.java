package mainprogram.baocao;

import java.text.SimpleDateFormat;
import javax.swing.JTable;
import mainprogram.Program;
import org.jfree.chart.ChartPanel;

public class ThongKeChiTieu extends javax.swing.JPanel {

    Process process;
    Program program;

    SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat form2 = new SimpleDateFormat("yyyy-MM");
    SimpleDateFormat form3 = new SimpleDateFormat("yyyy");

    ChartPanel chart;
    BarChart frame;

    public ThongKeChiTieu(Program program) {
        initComponents();
        process = new Process();
        this.program = program;

        process.loadData(process.loadDataChiNam("", program.maThanhVien), chiTable, 1);
        process.loadData(process.loadDataThuNam("", program.maThanhVien), thuTable, 1);
        avgChi.setText(String.valueOf(avg(chiTable)) + " (nghìn)/năm");
        avgThu.setText(String.valueOf(avg(thuTable)) + " (nghìn)/năm");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        chiTable = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        thuTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        avgChi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avgThu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thống kê chi tiêu");

        option.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option.setForeground(new java.awt.Color(51, 51, 51));
        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo các năm", "Theo các tháng trong năm", "Theo các ngày trong tháng" }));
        option.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optionItemStateChanged(evt);
            }
        });
        option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionMouseClicked(evt);
            }
        });
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });

        chiTable.setForeground(new java.awt.Color(51, 51, 51));
        chiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thời gian", "Số tiền"
            }
        ));
        chiTable.setRowHeight(30);
        chiTable.setSelectionBackground(new java.awt.Color(129, 159, 248));
        chiTable.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(chiTable);

        date.setForeground(new java.awt.Color(51, 51, 51));
        date.setDateFormatString("dd - MM - yyyy");
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        thuTable.setForeground(new java.awt.Color(51, 51, 51));
        thuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thời gian", "Số tiền"
            }
        ));
        thuTable.setRowHeight(30);
        thuTable.setSelectionBackground(new java.awt.Color(129, 159, 248));
        thuTable.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(thuTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Chi");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Thu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        avgChi.setBackground(new java.awt.Color(255, 255, 255));
        avgChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        avgChi.setForeground(new java.awt.Color(102, 102, 102));
        avgChi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        avgChi.setText("Trung bình");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Trung bình");

        avgThu.setBackground(new java.awt.Color(255, 255, 255));
        avgThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        avgThu.setForeground(new java.awt.Color(102, 102, 102));
        avgThu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        avgThu.setText("Trung bình");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Trung bình");

        jLabel8.setText(" ");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avgChi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avgThu, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(avgChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(avgThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showchart.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(277, 277, 277)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(option)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemChange() {
        String nam = form3.format(date.getDate());
        String thang = form2.format(date.getDate());
        switch (option.getSelectedIndex()) {
            case 0:
                process.loadData(process.loadDataChiNam("", program.maThanhVien), chiTable, 1);
                process.loadData(process.loadDataThuNam("", program.maThanhVien), thuTable, 1);
                avgChi.setText(String.valueOf(avg(chiTable)) + " (nghìn)/năm");
                avgThu.setText(String.valueOf(avg(thuTable)) + " (nghìn)/năm");
                break;
            case 1:
                process.loadData(process.loadDataChiThang(nam, program.maThanhVien), chiTable, 1);
                process.loadData(process.loadDataThuThang(nam, program.maThanhVien), thuTable, 1);
                avgChi.setText(String.valueOf(avg(chiTable)) + " (nghìn)/tháng");
                avgThu.setText(String.valueOf(avg(thuTable)) + " (nghìn)/tháng");
                break;
            default:
                process.loadData(process.loadDataChiNgay(thang, program.maThanhVien), chiTable, 1);
                process.loadData(process.loadDataThuNgay(thang, program.maThanhVien), thuTable, 1);
                avgChi.setText(String.valueOf(avg(chiTable)) + " (nghìn)/ngày");
                avgThu.setText(String.valueOf(avg(thuTable)) + " (nghìn)/ngày");
                break;
        }
    }

    public void drawChart() {
        String nam = form3.format(date.getDate());
        String thang = form2.format(date.getDate());
        String title;
        String time;
        switch (option.getSelectedIndex()) {
            case 0:
                title = "Biểu đồ thu chi theo các năm";
                time = "Năm";
                chart = new ChartPanel(process.createBarChart(process.createDataset(
                        process.loadDataChiNam("", program.maThanhVien),
                        process.loadDataThuNam("", program.maThanhVien)), title, time));
                break;
            case 1:
                title = "Biểu đồ thu chi theo các tháng trong năm " + nam;
                time = "Tháng";
                chart = new ChartPanel(process.createBarChart(process.createDataset(
                        process.loadDataChiThang(nam, program.maThanhVien),
                        process.loadDataThuThang(nam, program.maThanhVien)), title, time));
                break;
            default:
                title = "Biểu đồ thu chi theo các ngày trong tháng " + thang;
                time = "Ngày";
                chart = new ChartPanel(process.createBarChart(process.createDataset(
                        process.loadDataChiNgay(thang, program.maThanhVien),
                        process.loadDataThuNgay(thang, program.maThanhVien)), title, time));
                break;
        }
        frame = new BarChart(chart);
        frame.setVisible(true);
    }

    public float avg(JTable table) {
        long s = 0;
        int row = table.getRowCount();
        if (row==0) return 0;
        for (int i = 0; i < row; i++) {
            s += Integer.parseInt(table.getModel().getValueAt(i, 1).toString());
        }
        return (float) (s /(1000* row));
    }

    private void optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optionItemStateChanged
        // TODO add your handling code here:
        itemChange();
    }//GEN-LAST:event_optionItemStateChanged

    private void optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_optionMouseClicked

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        drawChart();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgChi;
    private javax.swing.JLabel avgThu;
    private javax.swing.JTable chiTable;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JTable thuTable;
    // End of variables declaration//GEN-END:variables
}
