package mainprogram.baocao;

import java.text.SimpleDateFormat;
import mainprogram.Program;
import org.jfree.chart.ChartPanel;

public class PhanTichChiTieu extends javax.swing.JPanel {

    Process process;
    Program program;

    SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat form2 = new SimpleDateFormat("yyyy-MM");
    SimpleDateFormat form3 = new SimpleDateFormat("yyyy");

    boolean isChi;

    public PhanTichChiTieu(Program program) {
        initComponents();
        this.program = program;
        process = new Process();
        isChi = true;
        chiBut.setSelected(true);
        itemChange();
        process.setTong(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ChartPanel = new javax.swing.JPanel();
        date = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        loaiLabel = new javax.swing.JLabel();
        tongLabel = new javax.swing.JLabel();
        chiBut = new javax.swing.JToggleButton();
        thuBut = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PHÂN TÍCH CHI TIÊU");

        option.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        option.setForeground(new java.awt.Color(51, 51, 51));
        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Ngày", "Tháng", "Năm" }));
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

        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "hạng mục", "số tiền", "tỉ lệ"
            }
        ));
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(129, 159, 248));
        jScrollPane1.setViewportView(table);

        ChartPanel.setBackground(new java.awt.Color(255, 255, 255));
        ChartPanel.setLayout(new javax.swing.BoxLayout(ChartPanel, javax.swing.BoxLayout.X_AXIS));

        date.setForeground(new java.awt.Color(51, 51, 51));
        date.setDateFormatString("dd - MM - yyyy");
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loaiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loaiLabel.setForeground(new java.awt.Color(51, 51, 51));
        loaiLabel.setText("Chi");

        tongLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tongLabel.setForeground(new java.awt.Color(51, 51, 51));
        tongLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tongLabel.setText("12500000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tongLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(loaiLabel)
                .addComponent(tongLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chiBut.setBackground(new java.awt.Color(255, 255, 255));
        chiBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chiBut.setForeground(new java.awt.Color(0, 102, 255));
        chiBut.setText("Chi");
        chiBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        chiBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiButMouseClicked(evt);
            }
        });

        thuBut.setBackground(new java.awt.Color(255, 255, 255));
        thuBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thuBut.setForeground(new java.awt.Color(0, 102, 255));
        thuBut.setText("Thu");
        thuBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        thuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thuButMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chiBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(203, 203, 203)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chiBut, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(thuBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(option, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionActionPerformed

    private void optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_optionMouseClicked

    private void itemChange() {
        String ngay = form1.format(date.getDate());
        String thang = form2.format(date.getDate());
        String nam = form3.format(date.getDate());
        String op = null;
        if (isChi) {
            switch (option.getSelectedIndex()) {
                case 0:
                    op = "";
                    break;
                case 1:
                    op = ngay;
                    break;
                case 2:
                    op = thang;
                    break;
                case 3:
                    op = nam;
                    break;
            }
            ChartPanel chart = new ChartPanel(process.CreatePieChart(process.CreateData(
                    process.loadDataChi(op, program.maThanhVien))));
            ChartPanel.removeAll();
            ChartPanel.add(chart);
            ChartPanel.repaint();
            ChartPanel.validate();
            process.loadData(process.loadDataChi(op, program.maThanhVien), table);
            loaiLabel.setText("Chi");
            tongLabel.setText(String.valueOf(process.getTong()));
            
        } else {
            switch (option.getSelectedIndex()) {
                case 0:
                    op = "";
                    break;
                case 1:
                    op = ngay;
                    break;
                case 2:
                    op = thang;
                    break;
                case 3:
                    op = nam;
                    break;
            }
            ChartPanel chart = new ChartPanel(process.CreatePieChart(process.CreateData(
                    process.loadDataThu(op, program.maThanhVien))));
            ChartPanel.removeAll();
            ChartPanel.add(chart);
            ChartPanel.repaint();
            ChartPanel.validate();
            process.loadData(process.loadDataThu(op, program.maThanhVien), table);
            loaiLabel.setText("Thu");
            tongLabel.setText(String.valueOf(process.getTong()));
        }
    }

    private void optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optionItemStateChanged
        // TODO add your handling code here:
        itemChange();
        process.setTong(0);
    }//GEN-LAST:event_optionItemStateChanged

    private void chiButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiButMouseClicked
        // TODO add your handling code here:
        isChi=true;
        chiBut.setSelected(true);
        thuBut.setSelected(false);
        itemChange();
        process.setTong(0);
    }//GEN-LAST:event_chiButMouseClicked

    private void thuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thuButMouseClicked
        // TODO add your handling code here:
        isChi=false;
        thuBut.setSelected(true);
        chiBut.setSelected(false);
        itemChange();
        process.setTong(0);
    }//GEN-LAST:event_thuButMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChartPanel;
    private javax.swing.JToggleButton chiBut;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loaiLabel;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JTable table;
    private javax.swing.JToggleButton thuBut;
    private javax.swing.JLabel tongLabel;
    // End of variables declaration//GEN-END:variables
}
