package mainprogram.ghichep;

import com.toedter.calendar.JDateChooser;
import dbconnection.SQLprocess;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mainprogram.Program;
import mainprogram.baocao.TinhHinhThuChi;
import mainprogram.tienich.HangMuc;

public class ThuPanel extends javax.swing.JPanel {

    Program program;
    Process process;
    String sql = "select Ten from hangmucthu";

    SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");

    public ThuPanel(Program program) {
        initComponents();
        this.program = program;
        process = new Process();
        hangMucCb.removeAllItems();
        process.loadHangMuc(SQLprocess.getData(sql), hangMucCb);
        this.editBut.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ngay = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        gio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        tienTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dienGiaiTf = new javax.swing.JTextField();
        clearBut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        saveBut = new javax.swing.JButton();
        hangMucCb = new javax.swing.JComboBox<>();
        editBut = new javax.swing.JButton();
        daGhiBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Giờ");

        ngay.setBackground(new java.awt.Color(255, 255, 255));
        ngay.setDate(new Date());
        ngay.setDateFormatString("dd - MM - yyyy");
        ngay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ngày");

        gio.setBackground(new java.awt.Color(255, 255, 255));
        gio.setDate(new Date());
        gio.setDateFormatString("HH : mm ");
        gio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Số tiền");

        tienTf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tienTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("VNĐ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Mục thu");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Diễn giải");

        dienGiaiTf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        clearBut.setBackground(new java.awt.Color(255, 255, 255));
        clearBut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clean.png"))); // NOI18N
        clearBut.setBorder(null);
        clearBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButMouseClicked(evt);
            }
        });
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Thu tiền");

        saveBut.setBackground(new java.awt.Color(255, 255, 255));
        saveBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lưu.png"))); // NOI18N
        saveBut.setBorder(null);
        saveBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButMouseClicked(evt);
            }
        });

        hangMucCb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hangMucCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hangMucCbItemStateChanged(evt);
            }
        });

        editBut.setBackground(new java.awt.Color(255, 255, 255));
        editBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua.png"))); // NOI18N
        editBut.setBorder(null);
        editBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButMouseClicked(evt);
            }
        });
        editBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButActionPerformed(evt);
            }
        });

        daGhiBut.setBackground(new java.awt.Color(255, 255, 255));
        daGhiBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/daghi.png"))); // NOI18N
        daGhiBut.setBorder(null);
        daGhiBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daGhiButMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(daGhiBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(saveBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editBut)
                                .addGap(123, 123, 123)
                                .addComponent(clearBut)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tienTf, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dienGiaiTf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hangMucCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daGhiBut))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tienTf, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(hangMucCb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dienGiaiTf, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saveBut, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(clearBut, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(editBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButMouseClicked
        // TODO add your handling code here:
        this.dienGiaiTf.setText("");
        this.tienTf.setText("");
    }//GEN-LAST:event_clearButMouseClicked

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButActionPerformed

    private void saveButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButMouseClicked
        // TODO add your handling code here:
        if (!process.checkNumber(tienTf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Số tiền phải là giá trị số!", "Thông báo", 1);
            return;
        }
        if (tienTf.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tiền!", "Thông báo", 1);
            return;
        }
        if (hangMucCb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hạng mục!", "Thông báo", 1);
            return;
        }
        String gi = form2.format(gio.getDate());
        String ng = form1.format(ngay.getDate());
        String id = process.getHangMucThuId(process.getHangMucThuId(hangMucCb.getSelectedItem().toString()));
        process.ghiChep("thu", tienTf.getText().trim(), ng, gi, id, dienGiaiTf.getText().trim(), program.maThanhVien);
        JOptionPane.showMessageDialog(this, "Thành công", "Thông báo", 1);
        this.dienGiaiTf.setText("");
        this.tienTf.setText("");
        this.hangMucCb.setSelectedIndex(0);
    }//GEN-LAST:event_saveButMouseClicked

    private void editButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButMouseClicked
        // TODO add your handling code here:
        if (!process.checkNumber(tienTf.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Số tiền phải là giá trị số!", "Thông báo", 1);
            return;
        }
        if (tienTf.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số tiền", "Thông báo", 1);
        } else if (hangMucCb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập hạng mục", "Thông báo", 1);
        } else {
            String gi = form2.format(gio.getDate());
            String ng = form1.format(ngay.getDate());
            String id = process.getHangMucThuId(process.getHangMucThuId(hangMucCb.getSelectedItem().toString()));
            int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa ghi chép này?", "Thông báo", 0);
            if (choose == JOptionPane.YES_OPTION) {
                process.editData(program.tinhHinhThuChi.idGiaoDich, tienTf.getText().trim(),
                        ng, gi, id, dienGiaiTf.getText().trim());
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", 1);
                this.dienGiaiTf.setText("");
                this.tienTf.setText("");
                this.hangMucCb.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_editButMouseClicked

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButActionPerformed

    private void daGhiButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daGhiButMouseClicked
        // TODO add your handling code here:
        program.getMain().removeAll();
        program.tinhHinhThuChi = new TinhHinhThuChi(program);
        program.getMain().add(program.tinhHinhThuChi);
        program.getMain().repaint();
        program.getMain().validate();
    }//GEN-LAST:event_daGhiButMouseClicked

    private void hangMucCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hangMucCbItemStateChanged
        // TODO add your handling code here:
        if (hangMucCb.getSelectedItem() == "Khác") {
            program.hangMuc = new HangMuc(program);
            program.getMain().removeAll();
            program.getMain().add(program.hangMuc);
            program.getMain().repaint();
            program.getMain().revalidate();
            program.hangMuc.isChiTien = false;
            program.hangMuc.getBackBut().setEnabled(true);
            program.hangMuc.isChi = false;
            program.hangMuc.itemList();
        }
    }//GEN-LAST:event_hangMucCbItemStateChanged

    public JTextField getDienGiaiTf() {
        return dienGiaiTf;
    }

    public JDateChooser getGio() {
        return gio;
    }

    public JComboBox<String> getHangMucCb() {
        return hangMucCb;
    }

    public JDateChooser getNgay() {
        return ngay;
    }

    public JTextField getTienTf() {
        return tienTf;
    }

    public JButton getSaveBut() {
        return saveBut;
    }

    public JButton getEditBut() {
        return editBut;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBut;
    private javax.swing.JButton daGhiBut;
    private javax.swing.JTextField dienGiaiTf;
    private javax.swing.JButton editBut;
    private com.toedter.calendar.JDateChooser gio;
    private javax.swing.JComboBox<String> hangMucCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser ngay;
    private javax.swing.JButton saveBut;
    private javax.swing.JTextField tienTf;
    // End of variables declaration//GEN-END:variables
   
}
