package mainprogram.tienich;

import dbconnection.SQLprocess;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import mainprogram.Program;

public class HangMuc extends javax.swing.JPanel {

    Process process;
    String sql1 = "select Ten from hangmucchi";
    String sql2 = "select Ten from hangmucthu";

    public boolean isChi;
    Program program;
    public boolean isChiTien;

    public HangMuc(Program program) {
        initComponents();
        this.program = program;
        process = new Process();
        process.loadHangMuc(SQLprocess.getData(sql1), hangMucList);
        isChi = true;
        chiBut.setSelected(true);
        backBut.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hangMucList = new javax.swing.JList<>();
        chiBut = new javax.swing.JToggleButton();
        thuBut = new javax.swing.JToggleButton();
        hangMucTf = new javax.swing.JTextField();
        addBut = new javax.swing.JButton();
        delBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hạng mục");

        hangMucList.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        hangMucList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hangMucList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " 1", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(hangMucList);

        chiBut.setBackground(new java.awt.Color(255, 255, 255));
        chiBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chiBut.setForeground(new java.awt.Color(0, 102, 255));
        chiBut.setText("Mục chi");
        chiBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        chiBut.setFocusPainted(false);
        chiBut.setPreferredSize(new java.awt.Dimension(0, 0));
        chiBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiButMouseClicked(evt);
            }
        });

        thuBut.setBackground(new java.awt.Color(255, 255, 255));
        thuBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thuBut.setForeground(new java.awt.Color(0, 102, 255));
        thuBut.setText("Mục thu");
        thuBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        thuBut.setPreferredSize(new java.awt.Dimension(0, 0));
        thuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thuButMouseClicked(evt);
            }
        });
        thuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuButActionPerformed(evt);
            }
        });

        hangMucTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hangMucTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangMucTfActionPerformed(evt);
            }
        });
        hangMucTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hangMucTfKeyPressed(evt);
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

        delBut.setBackground(new java.awt.Color(255, 255, 255));
        delBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        delBut.setBorder(null);
        delBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButMouseClicked(evt);
            }
        });

        backBut.setBackground(new java.awt.Color(255, 255, 255));
        backBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backBut.setBorder(null);
        backBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hangMucTf, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(addBut)
                        .addGap(40, 40, 40)
                        .addComponent(delBut)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chiBut, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(thuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chiBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thuBut, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hangMucTf)
                    .addComponent(delBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void thuButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thuButActionPerformed

    public void itemList() {
        if (isChi) {
            chiBut.setSelected(true);
            thuBut.setSelected(false);
            process.loadHangMuc(SQLprocess.getData(sql1), hangMucList);
        } else {
            thuBut.setSelected(true);
            chiBut.setSelected(false);
            process.loadHangMuc(SQLprocess.getData(sql2), hangMucList);
        }
    }

    private void chiButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chiButMouseClicked
        // TODO add your handling code here:
        isChi = true;
        itemList();
    }//GEN-LAST:event_chiButMouseClicked


    private void thuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thuButMouseClicked
        // TODO add your handling code here:
        isChi = false;
        itemList();
    }//GEN-LAST:event_thuButMouseClicked

    private void addButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButMouseClicked
        // TODO add your handling code here:
        String ten = hangMucTf.getText().trim();
        if (isChi) {
            if (hangMucTf.getText().trim().length() != 0) {
                String sql = "insert into hangmucchi (ten) values (?)";
                process.themHangMuc(sql, ten);
                process.loadHangMuc(SQLprocess.getData(sql1), hangMucList);
                hangMucTf.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập hạng mục mới", "Thông báo", 1);
            }
        } else {
            if (hangMucTf.getText().trim().length() != 0) {
                String sql = "insert into hangmucthu (ten) values (?)";
                process.themHangMuc(sql, ten);
                process.loadHangMuc(SQLprocess.getData(sql2), hangMucList);
                hangMucTf.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập hạng mục mới", "Thông báo", 1);
            }
        }
    }//GEN-LAST:event_addButMouseClicked

    private void delButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButMouseClicked
        // TODO add your handling code here:
        try {
            String[] ten = hangMucList.getSelectedValue().split(" ");
            int i = 2;
            String hm = "";
            while (i < (ten.length - 1)) {
                hm = hm + (ten[i] + " ");
                i++;
            }
            hm = hm + ten[ten.length - 1];
            if (isChi) {
                int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa hạng mục này?", "Thông báo", 0);
                if (choose == JOptionPane.YES_OPTION) {
                    String sql = "delete from hangmucchi where Ten like ?";
                    process.xoaHangMuc(sql, hm);
                    process.loadHangMuc(SQLprocess.getData(sql1), hangMucList);
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", 1);
                }
            } else {
                int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa hạng mục này?", "Thông báo", 0);
                if (choose == JOptionPane.YES_OPTION) {
                    String sql = "delete from hangmucthu where Ten like ?";
                    process.xoaHangMuc(sql, hm);
                    process.loadHangMuc(SQLprocess.getData(sql2), hangMucList);
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", 1);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa nhận được lựa chọn của bạn", "Thông báo", 0);
        }
    }//GEN-LAST:event_delButMouseClicked

    private void hangMucTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangMucTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hangMucTfActionPerformed

    private void backButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButMouseClicked
        // TODO add your handling code here:
        if (isChiTien) {
            program.getMain().removeAll();
            program.getMain().add(program.chiTien);
            program.getMain().repaint();
            program.getMain().revalidate();
            program.chiTien.getHangMucCb().setSelectedIndex(0);
        } else {
            program.getMain().removeAll();
            program.getMain().add(program.thuTien);
            program.getMain().repaint();
            program.getMain().revalidate();
            program.chiTien.getHangMucCb().setSelectedIndex(0);
        }
    }//GEN-LAST:event_backButMouseClicked

    private void hangMucTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hangMucTfKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String ten = hangMucTf.getText().trim();
            if (isChi) {
                if (hangMucTf.getText().trim().length() != 0) {
                    String sql = "insert into hangmucchi (ten) values (?)";
                    process.themHangMuc(sql, ten);
                    process.loadHangMuc(SQLprocess.getData(sql1), hangMucList);
                    hangMucTf.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập hạng mục mới", "Thông báo", 1);
                }
            } else {
                if (hangMucTf.getText().trim().length() != 0) {
                    String sql = "insert into hangmucthu (ten) values (?)";
                    process.themHangMuc(sql, ten);
                    process.loadHangMuc(SQLprocess.getData(sql2), hangMucList);
                    hangMucTf.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập hạng mục mới", "Thông báo", 1);
                }
            }
        }
    }//GEN-LAST:event_hangMucTfKeyPressed

    public JButton getBackBut() {
        return backBut;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBut;
    private javax.swing.JButton backBut;
    private javax.swing.JToggleButton chiBut;
    private javax.swing.JButton delBut;
    private javax.swing.JList<String> hangMucList;
    private javax.swing.JTextField hangMucTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton thuBut;
    // End of variables declaration//GEN-END:variables
}
