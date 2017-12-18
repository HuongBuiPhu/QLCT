package mainprogram.baocao;

import fileprocess.ExportFile;
import fileprocess.ImportFromFile;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import mainprogram.Program;
import mainprogram.ghichep.ChiPanel;
import mainprogram.ghichep.ThuPanel;

public class TinhHinhThuChi extends javax.swing.JPanel {

    Program program;
    Process process;

    SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat form2 = new SimpleDateFormat("yyyy-MM");
    SimpleDateFormat form3 = new SimpleDateFormat("yyyy");
    SimpleDateFormat form4 = new SimpleDateFormat("dd - MM - yyyy");
    SimpleDateFormat form5 = new SimpleDateFormat("dd/MM/yyyy");

    ImportFromFile imp;
    ExportFile exp;

    public String idGiaoDich;

    public TinhHinhThuChi(Program program) {
        initComponents();

        this.program = program;
        process = new Process();
        table.setRowHeight(30);

        exp = new ExportFile();
        imp = new ImportFromFile();

        addBut.setEnabled(false);

        process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
        process.searchData("",program.maThanhVien, thu, chi, tong);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timeCb = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        exportBut = new javax.swing.JButton();
        delBut = new javax.swing.JButton();
        searchBut = new javax.swing.JButton();
        dataTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        importBut = new javax.swing.JButton();
        addBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        thu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TÌNH HÌNH THU CHI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Xem theo");

        timeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tât cả", "Ngày", "Tháng", "Năm" }));
        timeCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                timeCbItemStateChanged(evt);
            }
        });

        table.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setGridColor(new java.awt.Color(102, 102, 102));
        table.setSelectionBackground(new java.awt.Color(156, 179, 248));
        table.setShowHorizontalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        date.setDateFormatString("dd - MM - yyyy");

        exportBut.setBackground(new java.awt.Color(255, 255, 255));
        exportBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file.png"))); // NOI18N
        exportBut.setBorder(null);
        exportBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportButMouseClicked(evt);
            }
        });
        exportBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButActionPerformed(evt);
            }
        });

        delBut.setBackground(new java.awt.Color(255, 255, 255));
        delBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        delBut.setBorder(null);
        delBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButMouseClicked(evt);
            }
        });
        delBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButActionPerformed(evt);
            }
        });

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

        dataTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dataTfKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Tìm kiếm");

        importBut.setBackground(new java.awt.Color(255, 255, 255));
        importBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhapfile.png"))); // NOI18N
        importBut.setBorder(null);
        importBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importButMouseClicked(evt);
            }
        });

        addBut.setBackground(new java.awt.Color(255, 255, 255));
        addBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addhm.png"))); // NOI18N
        addBut.setBorder(null);
        addBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Thu: ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Chi: ");

        thu.setBackground(new java.awt.Color(255, 255, 255));
        thu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thu.setForeground(new java.awt.Color(51, 51, 51));
        thu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        thu.setText("1251");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");

        chi.setBackground(new java.awt.Color(255, 255, 255));
        chi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chi.setForeground(new java.awt.Color(51, 51, 51));
        chi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chi.setText("12353");
        chi.setPreferredSize(new java.awt.Dimension(32, 17));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("=");

        tong.setBackground(new java.awt.Color(255, 255, 255));
        tong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tong.setForeground(new java.awt.Color(51, 51, 51));
        tong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tong.setText("21353");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(thu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(importBut)
                                    .addComponent(addBut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(191, 191, 191))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(265, 265, 265))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataTf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(exportBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importBut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportBut))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBut, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(timeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButActionPerformed

    private void delButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delButActionPerformed

    private void exportButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportButActionPerformed

    private void searchButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButMouseClicked
        // TODO add your handling code here:
        addBut.setEnabled(false);
        process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
    }//GEN-LAST:event_searchButMouseClicked

    private void itemSeacrh() {
        String ngay = form1.format(date.getDate());
        String thang = form2.format(date.getDate());
        String nam = form3.format(date.getDate());
        switch (timeCb.getSelectedIndex()) {
            case 0:
                process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
                process.searchData("",program.maThanhVien, thu, chi, tong);
                break;
            case 1:
                process.searchData(table, ngay, program.maThanhVien, dataTf.getText().trim());
                process.searchData(ngay,program.maThanhVien, thu, chi, tong);
                break;
            case 2:
                process.searchData(table, thang, program.maThanhVien, dataTf.getText().trim());
                process.searchData(thang,program.maThanhVien, thu, chi, tong);
                break;
            default:
                process.searchData(table, nam, program.maThanhVien, dataTf.getText().trim());
                process.searchData(nam,program.maThanhVien, thu, chi, tong);
                break;
        }
    }

    private void timeCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_timeCbItemStateChanged
        // TODO add your handling code here:
        addBut.setEnabled(false);
        itemSeacrh();
    }//GEN-LAST:event_timeCbItemStateChanged

    private void delButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButMouseClicked
        // TODO add your handling code here:
        addBut.setEnabled(false);
        int row = table.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chưa nhận dạng được lựa chọn của bạn", "Thông báo", 0);
            return;
        }
        int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa dữ liệu này?", "Thông báo", 0);
        if (choose == JOptionPane.YES_OPTION) {
            process.delData(table.getModel().getValueAt(row, 0).toString());
            JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", 1);
            process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
        }
    }//GEN-LAST:event_delButMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int row = table.getSelectedRow();
                Date date1 = new SimpleDateFormat("dd - MM - yyyy").parse(table.getModel().getValueAt(row, 4).toString());
                Date gio1 = new SimpleDateFormat("HH:mm").parse(table.getModel().getValueAt(row, 5).toString());
                idGiaoDich = table.getModel().getValueAt(row, 0).toString();
                if (table.getModel().getValueAt(row, 1).equals("chi")) {
                    program.chiTien = new ChiPanel(program);
                    program.chiTien.getSaveBut().setEnabled(false);
                    program.chiTien.getEditBut().setEnabled(true);
                    program.chiTien.getNgay().setDate(date1);
                    program.chiTien.getGio().setDate(gio1);
                    program.chiTien.getTienTf().setText(table.getModel().getValueAt(row, 3).toString());
                    program.chiTien.getHangMucCb().setSelectedItem(table.getModel().getValueAt(row, 2).toString());
                    program.chiTien.getDienGiaiTf().setText(table.getModel().getValueAt(row, 6).toString());
                    program.getMain().removeAll();
                    program.getMain().add(program.chiTien);
                    program.getMain().repaint();
                    program.getMain().revalidate();
                } else {
                    program.thuTien = new ThuPanel(program);
                    program.thuTien.getSaveBut().setEnabled(false);
                    program.thuTien.getEditBut().setEnabled(true);
                    program.thuTien.getNgay().setDate(date1);
                    program.thuTien.getGio().setDate(gio1);
                    program.thuTien.getTienTf().setText(table.getModel().getValueAt(row, 3).toString());
                    program.thuTien.getHangMucCb().setSelectedItem(table.getModel().getValueAt(row, 2).toString());
                    program.thuTien.getDienGiaiTf().setText(table.getModel().getValueAt(row, 6).toString());
                    program.getMain().removeAll();
                    program.getMain().add(program.thuTien);
                    program.getMain().repaint();
                    program.getMain().revalidate();
                }

            } catch (ParseException ex) {
                System.out.println("Loi: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_tableKeyPressed

    private void importButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importButMouseClicked
        // TODO add your handling code here:
        String[] arr = {"Thu/Chi", "Hạng mục", "Số tiền", "Ngày", "Giờ", "Diễn giải"};
        table.removeAll();
        imp.importExcel(table, arr);
        addBut.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Đọc file thành công!", "Thông báo", 1);
    }//GEN-LAST:event_importButMouseClicked

    private void addButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButMouseClicked
        // TODO add your handling code here:
        try {
            for (int i = 0; i < table.getRowCount(); i++) {
                if ("chi".equals(table.getModel().getValueAt(i, 0).toString())) {
                    String gi = table.getModel().getValueAt(i, 4).toString();
                    Date date = form5.parse(table.getModel().getValueAt(i, 3).toString());
                    String ng = form1.format(date);
                    String id = process.getHangMucChiId(process.getHangMucChiId(
                            table.getModel().getValueAt(i, 1).toString()));
                    process.ghiChep("chi", table.getModel().getValueAt(i, 2).toString(), ng, gi, id,
                            table.getModel().getValueAt(i, 5).toString(), program.maThanhVien);
                } else {
                    String gi = table.getModel().getValueAt(i, 4).toString();
                    Date date = form5.parse(table.getModel().getValueAt(i, 3).toString());
                    String ng = form1.format(date);
                    String id = process.getHangMucThuId(process.getHangMucThuId(
                            table.getModel().getValueAt(i, 1).toString()));
                    process.ghiChep("thu", table.getModel().getValueAt(i, 2).toString(), ng, gi, id,
                            table.getModel().getValueAt(i, 5).toString(), program.maThanhVien);
                }

            }
            addBut.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Thành công", "Thông báo", 1);
            process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
        } catch (ParseException ex) {
            System.err.println("Loi: " + ex.getMessage());
        }
    }//GEN-LAST:event_addButMouseClicked

    private void dataTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTfKeyPressed
        // TODO add your handling code here:
        addBut.setEnabled(false);
        process.searchData(table, "", program.maThanhVien, dataTf.getText().trim());
    }//GEN-LAST:event_dataTfKeyPressed

    private void exportButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportButMouseClicked
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xuất ra file các dữ liệu này?", "Thông báo", 0);
        if (choose == JOptionPane.YES_OPTION) {
            String tieude = "BẢNG KÊ THU CHI";
            String ngay = form1.format(date.getDate());
            String thang = form2.format(date.getDate());
            String nam = form3.format(date.getDate());
            switch (timeCb.getSelectedIndex()) {
                case 0:
                    exp.exportExcel(table, 6, 0,tieude,"Tất cả thời gian","Tài khoản: "+program.hoten,thu.getText(),chi.getText());
                    break;
                case 1:
                    exp.exportExcel(table, 6, 0,tieude,"Trong ngày "+ngay,"Tài khoản: "+program.hoten,thu.getText(),chi.getText());
                    break;
                case 2:
                    exp.exportExcel(table, 6, 0,tieude,"Trong tháng "+thang,"Tài khoản: "+program.hoten,thu.getText(),chi.getText());
                    break;
                default:
                    exp.exportExcel(table, 6, 0,tieude,"Trong năm "+nam,"Tài khoản: "+program.hoten,thu.getText(),chi.getText());
                    break;
            }

        }
    }//GEN-LAST:event_exportButMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBut;
    private javax.swing.JLabel chi;
    private javax.swing.JTextField dataTf;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton delBut;
    private javax.swing.JButton exportBut;
    private javax.swing.JButton importBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBut;
    private javax.swing.JTable table;
    private javax.swing.JLabel thu;
    private javax.swing.JComboBox<String> timeCb;
    private javax.swing.JLabel tong;
    // End of variables declaration//GEN-END:variables
}
