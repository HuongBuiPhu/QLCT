package mainprogram;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import login.LoginFrame;
import mainprogram.baocao.PhanTichChiTieu;
import mainprogram.baocao.ThongKeChiTieu;
import mainprogram.baocao.TinhHinhThuChi;
import mainprogram.ghichep.ChiPanel;
import mainprogram.ghichep.ThuPanel;
import mainprogram.taikhoan.ThanhVien;
import mainprogram.tienich.HangMuc;
import mainprogram.tienich.XemThanhVien;

public class Program extends javax.swing.JFrame {

    public ThuPanel thuTien;
    public ChiPanel chiTien;
    public TinhHinhThuChi tinhHinhThuChi;
    PhanTichChiTieu phanTichChiTieu;
    ThanhVien thanhVien;
    public HangMuc hangMuc;
    XemThanhVien xemThanhVien;
    ThongKeChiTieu thongKeChiTieu;

    LoginFrame login;
    public String maThanhVien;
    public String hoten;
    String quyen;

    public Program(LoginFrame login) {
        initComponents();

        try {
            this.setIconImage(ImageIO.read(new File("data/icon.png")));
        } catch (IOException ex) {}
        
        this.setResizable(false);

        Toolkit toolkit = this.getToolkit();
        Dimension solution = toolkit.getScreenSize();

        this.setBounds((solution.width - this.getWidth()) / 2, (solution.height - this.getHeight()) / 2,
                this.getWidth(), this.getHeight());

        this.login = login;

        maThanhVien = login.maTV;
        quyen = login.quyen;
        hoten = login.tenTv;
        this.maTvLb.setText(maThanhVien);

        if (quyen.equals("Thành viên")) {
            this.menuThanhVien.setEnabled(false);
            this.menuXemThanhVien.setEnabled(false);
        } else if (quyen.equals("Quản lí chung")) {
            this.menuThanhVien.setEnabled(false);
        }

        //this.setResizable(false);
        chiTien = new ChiPanel(this);
        main.add(chiTien);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        maTvLb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuChiTien = new javax.swing.JMenuItem();
        menuThuTien = new javax.swing.JMenuItem();
        menuBaoCao = new javax.swing.JMenu();
        menuTinhHinhThuChi = new javax.swing.JMenuItem();
        menuPhanTichChiTieu = new javax.swing.JMenuItem();
        thongkeMenu = new javax.swing.JMenuItem();
        menuTienIch = new javax.swing.JMenu();
        menuHangMuc = new javax.swing.JMenuItem();
        menuXemThanhVien = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuThanhVien = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÍ CHI TIÊU");
        setBackground(new java.awt.Color(255, 255, 255));

        main.setLayout(new javax.swing.BoxLayout(main, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("@Nhóm 3                                                Bùi Phú Hướng - Trần Nam Phương - Nguyễn Văn Phúc");

        maTvLb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maTvLb.setForeground(new java.awt.Color(102, 102, 102));
        maTvLb.setText("mã thành viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Chào");

        jMenuBar1.setBackground(new java.awt.Color(234, 233, 233));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(210, 60));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 51, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ghichep2.png"))); // NOI18N
        jMenu1.setText("Ghi chép");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(140, 50));

        menuChiTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chi.png"))); // NOI18N
        menuChiTien.setText("Chi tiền");
        menuChiTien.setPreferredSize(new java.awt.Dimension(150, 26));
        menuChiTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChiTienActionPerformed(evt);
            }
        });
        jMenu1.add(menuChiTien);

        menuThuTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thu.png"))); // NOI18N
        menuThuTien.setText("Thu tiền");
        menuThuTien.setPreferredSize(new java.awt.Dimension(150, 26));
        menuThuTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThuTienActionPerformed(evt);
            }
        });
        jMenu1.add(menuThuTien);

        jMenuBar1.add(jMenu1);

        menuBaoCao.setBackground(new java.awt.Color(255, 255, 255));
        menuBaoCao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBaoCao.setForeground(new java.awt.Color(0, 51, 255));
        menuBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baocao2.png"))); // NOI18N
        menuBaoCao.setText("Báo cáo");
        menuBaoCao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuBaoCao.setPreferredSize(new java.awt.Dimension(140, 50));

        menuTinhHinhThuChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tinhhinh2.png"))); // NOI18N
        menuTinhHinhThuChi.setText("Tình hình thu chi");
        menuTinhHinhThuChi.setPreferredSize(new java.awt.Dimension(150, 28));
        menuTinhHinhThuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTinhHinhThuChiActionPerformed(evt);
            }
        });
        menuBaoCao.add(menuTinhHinhThuChi);

        menuPhanTichChiTieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phantich2.png"))); // NOI18N
        menuPhanTichChiTieu.setText("Phân tích chi tiêu");
        menuPhanTichChiTieu.setPreferredSize(new java.awt.Dimension(150, 28));
        menuPhanTichChiTieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPhanTichChiTieuActionPerformed(evt);
            }
        });
        menuBaoCao.add(menuPhanTichChiTieu);

        thongkeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phantich.png"))); // NOI18N
        thongkeMenu.setText("Thống kê chi tiêu");
        thongkeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkeMenuMouseClicked(evt);
            }
        });
        thongkeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeMenuActionPerformed(evt);
            }
        });
        menuBaoCao.add(thongkeMenu);

        jMenuBar1.add(menuBaoCao);

        menuTienIch.setBackground(new java.awt.Color(255, 255, 255));
        menuTienIch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuTienIch.setForeground(new java.awt.Color(0, 51, 255));
        menuTienIch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tienich.png"))); // NOI18N
        menuTienIch.setText("Tiện ích");
        menuTienIch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuTienIch.setPreferredSize(new java.awt.Dimension(140, 50));

        menuHangMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hangmuc2.png"))); // NOI18N
        menuHangMuc.setText("Hạng mục");
        menuHangMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHangMucActionPerformed(evt);
            }
        });
        menuTienIch.add(menuHangMuc);

        menuXemThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/other.png"))); // NOI18N
        menuXemThanhVien.setText("Xem thành viên khác");
        menuXemThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuXemThanhVienActionPerformed(evt);
            }
        });
        menuTienIch.add(menuXemThanhVien);

        jMenuBar1.add(menuTienIch);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setForeground(new java.awt.Color(0, 51, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thanhvien.png"))); // NOI18N
        jMenu4.setText("Thành viên");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu4.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu4.setPreferredSize(new java.awt.Dimension(145, 50));

        menuThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thanh.png"))); // NOI18N
        menuThanhVien.setText("Thành viên");
        menuThanhVien.setPreferredSize(new java.awt.Dimension(150, 28));
        menuThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThanhVienActionPerformed(evt);
            }
        });
        jMenu4.add(menuThanhVien);

        jMenuBar1.add(jMenu4);

        menuExit.setBackground(new java.awt.Color(255, 255, 255));
        menuExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuExit.setForeground(new java.awt.Color(0, 51, 255));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat3.png"))); // NOI18N
        menuExit.setText("Thoát");
        menuExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuExit.setPreferredSize(new java.awt.Dimension(140, 50));
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maTvLb)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maTvLb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuChiTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChiTienActionPerformed
        // TODO add your handling code here:
        chiTien = new ChiPanel(this);
        main.removeAll();
        main.add(chiTien);
        main.repaint();
        main.revalidate();

    }//GEN-LAST:event_menuChiTienActionPerformed

    private void menuThuTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThuTienActionPerformed
        // TODO add your handling code here:
        thuTien = new ThuPanel(this);
        main.removeAll();
        main.add(thuTien);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuThuTienActionPerformed

    private void menuPhanTichChiTieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPhanTichChiTieuActionPerformed
        // TODO add your handling code here:
        phanTichChiTieu = new PhanTichChiTieu(this);
        main.removeAll();
        main.add(phanTichChiTieu);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuPhanTichChiTieuActionPerformed

    private void menuTinhHinhThuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTinhHinhThuChiActionPerformed
        // TODO add your handling code here:
        tinhHinhThuChi = new TinhHinhThuChi(this);
        main.removeAll();
        main.add(tinhHinhThuChi);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuTinhHinhThuChiActionPerformed

    private void menuHangMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHangMucActionPerformed
        // TODO add your handling code here:
        hangMuc = new HangMuc(this);
        main.removeAll();
        main.add(hangMuc);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuHangMucActionPerformed

    private void menuThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThanhVienActionPerformed
        // TODO add your handling code here:
        thanhVien = new ThanhVien(this);
        main.removeAll();
        main.add(thanhVien);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuThanhVienActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuXemThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuXemThanhVienActionPerformed
        // TODO add your handling code here:
        xemThanhVien = new XemThanhVien(this);
        main.removeAll();
        main.add(xemThanhVien);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_menuXemThanhVienActionPerformed

    private void thongkeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMenuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_thongkeMenuMouseClicked

    private void thongkeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeMenuActionPerformed
        // TODO add your handling code here:
        thongKeChiTieu = new ThongKeChiTieu(this);
        main.removeAll();
        main.add(thongKeChiTieu);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_thongkeMenuActionPerformed

    public void setMenuThanhVien(boolean bool) {
        this.menuThanhVien.setEnabled(bool);
    }

    public void setMenuXemThanhVien(boolean bool) {
        this.menuXemThanhVien.setEnabled(bool);
    }

    public JPanel getMain() {
        return this.main;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel maTvLb;
    private javax.swing.JPanel main;
    private javax.swing.JMenu menuBaoCao;
    private javax.swing.JMenuItem menuChiTien;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenuItem menuHangMuc;
    private javax.swing.JMenuItem menuPhanTichChiTieu;
    private javax.swing.JMenuItem menuThanhVien;
    private javax.swing.JMenuItem menuThuTien;
    private javax.swing.JMenu menuTienIch;
    private javax.swing.JMenuItem menuTinhHinhThuChi;
    private javax.swing.JMenuItem menuXemThanhVien;
    private javax.swing.JMenuItem thongkeMenu;
    // End of variables declaration//GEN-END:variables
}
