package mainprogram.taikhoan;

import dbconnection.SQLprocess;
import fileprocess.ExportFile;
import javax.swing.JOptionPane;
import mainprogram.Program;

public class ThanhVien extends javax.swing.JPanel {

    Process process;
    String sql = "select * from thanhvien";
    Program program;
    ExportFile exp;

    public ThanhVien(Program program) {
        initComponents();
        process = new Process();
        this.program = program;
        exp = new ExportFile();
        process.loadData(SQLprocess.getData(sql), tvTable);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tvTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        maTvTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tenTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tuoiTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ngheTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tkTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mkTf = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        mkTf2 = new javax.swing.JPasswordField();
        quyenCb = new javax.swing.JComboBox<>();
        addBut = new javax.swing.JButton();
        editBut = new javax.swing.JButton();
        delBut = new javax.swing.JButton();
        clearBut = new javax.swing.JButton();
        fileBut = new javax.swing.JButton();
        gioiCb = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Thành viên");

        tvTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thành viên", "Họ tên", "tuổi", "Nghề nghiệp", "giới tính"
            }
        ));
        tvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tvTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tvTable);
        if (tvTable.getColumnModel().getColumnCount() > 0) {
            tvTable.getColumnModel().getColumn(0).setResizable(false);
            tvTable.getColumnModel().getColumn(1).setResizable(false);
            tvTable.getColumnModel().getColumn(2).setResizable(false);
            tvTable.getColumnModel().getColumn(3).setResizable(false);
            tvTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mã thành viên");

        maTvTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maTvTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maTvTfKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Họ Tên*");

        tenTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tenTfKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tuổi*");

        tuoiTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tuoiTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tuoiTfKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nghề nghiệp");

        ngheTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ngheTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ngheTfKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("giới tính");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tài khoản*");

        tkTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tkTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkTfKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Mật khẩu");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Quyền");

        mkTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Xác nhận mật khẩu");

        mkTf2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quyenCb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quyenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thành viên", "Quản lí chung", "Admin" }));
        quyenCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                quyenCbItemStateChanged(evt);
            }
        });

        addBut.setBackground(new java.awt.Color(255, 255, 255));
        addBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them.png"))); // NOI18N
        addBut.setBorder(null);
        addBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButMouseClicked(evt);
            }
        });

        editBut.setBackground(new java.awt.Color(255, 255, 255));
        editBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua2.png"))); // NOI18N
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

        delBut.setBackground(new java.awt.Color(255, 255, 255));
        delBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        delBut.setBorder(null);
        delBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButMouseClicked(evt);
            }
        });

        clearBut.setBackground(new java.awt.Color(255, 255, 255));
        clearBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
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

        fileBut.setBackground(new java.awt.Color(255, 255, 255));
        fileBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file.png"))); // NOI18N
        fileBut.setBorder(null);
        fileBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileButMouseClicked(evt);
            }
        });
        fileBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButActionPerformed(evt);
            }
        });

        gioiCb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gioiCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        gioiCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gioiCbItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maTvTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tuoiTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ngheTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gioiCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mkTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(addBut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quyenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(editBut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearBut)
                                        .addGap(39, 39, 39)
                                        .addComponent(delBut)
                                        .addGap(35, 35, 35)
                                        .addComponent(fileBut))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mkTf)
                                    .addComponent(tkTf, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maTvTf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tkTf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mkTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tuoiTf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mkTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngheTf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quyenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gioiCb, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(delBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editBut))
                                    .addComponent(clearBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(fileBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButMouseClicked
        // TODO add your handling code here:
        if (checkTaiKhoan()) {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại", "Thông báo", 0);
            return;
        }
        if (tkTf.getText().trim().length() != 0
                && maTvTf.getText().length() == 0 && tenTf.getText().trim().length() != 0 && tuoiTf.getText().length() != 0
                && String.valueOf(mkTf.getPassword()).length() != 0) {
            if (String.valueOf(mkTf.getPassword()).equals(String.valueOf(mkTf2.getPassword()))) {
                int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn thêm thành viên này?", "Thông báo", 0);
                if (chon == JOptionPane.YES_OPTION) {
                    process.addData(tenTf.getText().trim(), tuoiTf.getText().trim(), ngheTf.getText().trim(),
                            gioiCb.getSelectedItem().toString(), tkTf.getText().trim(), String.valueOf(mkTf.getPassword()),
                            quyenCb.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", 1);
                    process.loadData(SQLprocess.getData(sql), tvTable);
                    this.tenTf.setText("");
                    this.ngheTf.setText("");
                    this.tuoiTf.setText("");
                    this.tkTf.setText("");
                    this.maTvTf.setText("");
                    this.mkTf.setText("");
                    this.mkTf2.setText("");
                    this.quyenCb.setSelectedItem(0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp", "Thông báo", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", 0);
        }
    }//GEN-LAST:event_addButMouseClicked

    private void clearButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButMouseClicked
        // TODO add your handling code here:
        this.tenTf.setText("");
        this.ngheTf.setText("");
        this.tuoiTf.setText("");
        this.tkTf.setText("");
        this.maTvTf.setText("");
        this.mkTf.setText("");
        this.mkTf2.setText("");
        this.quyenCb.setSelectedIndex(0);
        gioiCb.setSelectedIndex(0);
        process.loadData(SQLprocess.getData(sql), tvTable);
    }//GEN-LAST:event_clearButMouseClicked

    private void tvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvTableMouseClicked
        // TODO add your handling code here:
        int row = tvTable.getSelectedRow();
        this.maTvTf.setText(tvTable.getValueAt(row, 0).toString());
        this.tenTf.setText(tvTable.getValueAt(row, 1).toString());
        this.tuoiTf.setText(tvTable.getValueAt(row, 2).toString());
        this.ngheTf.setText(tvTable.getValueAt(row, 4).toString());
        this.gioiCb.setSelectedItem(tvTable.getValueAt(row, 3).toString());
        this.tkTf.setText(tvTable.getValueAt(row, 5).toString());
        this.quyenCb.setSelectedItem(tvTable.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tvTableMouseClicked

    public boolean checkTaiKhoan() {
        String tk = tkTf.getText().trim();
        for (int i = 0; i < this.tvTable.getRowCount(); i++) {
            if (tvTable.getModel().getValueAt(i, 5).toString().equals(tk)) {
                return true;
            }
        }
        return false;
    }

    private void editButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButMouseClicked
        // TODO add your handling code here:
        if (maTvTf.getText().length() != 0 && tenTf.getText().trim().length() != 0
                && tuoiTf.getText().trim().length() != 0) {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa thành viên này?", "Thông báo", 0);
            if (chon == JOptionPane.YES_OPTION) {
                process.editData(tenTf.getText().trim(), tuoiTf.getText().trim(), ngheTf.getText().trim(),
                        gioiCb.getSelectedItem().toString(),
                        quyenCb.getSelectedItem().toString(), maTvTf.getText());
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", 1);
                process.loadData(SQLprocess.getData(sql), tvTable);
                this.tenTf.setText("");
                this.ngheTf.setText("");
                this.tuoiTf.setText("");
                this.tkTf.setText("");
                this.maTvTf.setText("");
                this.quyenCb.setSelectedItem(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", 0);
        }
    }//GEN-LAST:event_editButMouseClicked

    private void delButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButMouseClicked
        // TODO add your handling code here:
        if (maTvTf.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn thành viên", "Thông báo", 1);
            return;
        }
        int choose = JOptionPane.showConfirmDialog(this, "Khi xóa mọi dữ liệu của thành viên sẽ bị xóa\n"
                + " Bạn có muốn xóa?", "Thông báo", 0);
        if (choose == JOptionPane.YES_OPTION) {
            process.delData(maTvTf.getText());
            process.delMember(maTvTf.getText());
            JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", 1);
            process.loadData(SQLprocess.getData(sql), tvTable);
            this.tenTf.setText("");
            this.ngheTf.setText("");
            this.tuoiTf.setText("");
            this.tkTf.setText("");
            this.maTvTf.setText("");
            this.quyenCb.setSelectedItem(0);
        }

    }//GEN-LAST:event_delButMouseClicked

    private void fileButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileButActionPerformed

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButActionPerformed

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButActionPerformed

    private void maTvTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maTvTfKeyPressed
        // TODO add your handling code here:
        process.loadData(process.getData(maTvTf.getText().trim()), tvTable);
    }//GEN-LAST:event_maTvTfKeyPressed

    private void tenTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenTfKeyPressed
        // TODO add your handling code here:
        process.loadData(process.getData(tenTf.getText().trim()), tvTable);
    }//GEN-LAST:event_tenTfKeyPressed

    private void tuoiTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuoiTfKeyPressed
        // TODO add your handling code here:
        process.loadData(process.getData(tuoiTf.getText().trim()), tvTable);
    }//GEN-LAST:event_tuoiTfKeyPressed

    private void ngheTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ngheTfKeyPressed
        // TODO add your handling code here:
        process.loadData(process.getData(ngheTf.getText().trim()), tvTable);
    }//GEN-LAST:event_ngheTfKeyPressed

    private void gioiCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gioiCbItemStateChanged
        // TODO add your handling code here:
        process.loadData(process.getData(gioiCb.getSelectedItem().toString()), tvTable);
    }//GEN-LAST:event_gioiCbItemStateChanged

    private void tkTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkTfKeyPressed
        // TODO add your handling code here:
        process.loadData(process.getData(tkTf.getText().trim()), tvTable);
    }//GEN-LAST:event_tkTfKeyPressed

    private void quyenCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_quyenCbItemStateChanged
        // TODO add your handling code here:
        process.loadData(process.getData(quyenCb.getSelectedItem().toString()), tvTable);
    }//GEN-LAST:event_quyenCbItemStateChanged

    private void fileButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileButMouseClicked
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(this, "Bạn muốn xuất ra file các dữ liệu này?", "Thông báo", 0);
        if (choose == JOptionPane.YES_OPTION) {
            exp.fileThanhVien(tvTable, 4, 0,program.hoten);
        }
    }//GEN-LAST:event_fileButMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBut;
    private javax.swing.JButton clearBut;
    private javax.swing.JButton delBut;
    private javax.swing.JButton editBut;
    private javax.swing.JButton fileBut;
    private javax.swing.JComboBox<String> gioiCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maTvTf;
    private javax.swing.JPasswordField mkTf;
    private javax.swing.JPasswordField mkTf2;
    private javax.swing.JTextField ngheTf;
    private javax.swing.JComboBox<String> quyenCb;
    private javax.swing.JTextField tenTf;
    private javax.swing.JTextField tkTf;
    private javax.swing.JTextField tuoiTf;
    private javax.swing.JTable tvTable;
    // End of variables declaration//GEN-END:variables
}
