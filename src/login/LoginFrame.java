package login;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import mainprogram.Program;

public class LoginFrame extends javax.swing.JFrame {

    Program program;
    Process process;
    ResultSet result;
    
    ChangePassword changePass;

    public String maTV;
    public String quyen;
    public String tenTv;

    public LoginFrame() {
        initComponents();
        process = new Process();

        try {
            this.setIconImage(ImageIO.read(new File("data/icon.png")));
        } catch (IOException ex) {
            System.out.println("Loi: "+ex.getMessage());
        }

        Toolkit toolkit = this.getToolkit();
        Dimension solution = toolkit.getScreenSize();

        this.setBounds((solution.width - this.getWidth()) / 2, (solution.height - this.getHeight()) / 2,
                this.getWidth(), this.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginBut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        changePassBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÍ CHI TIÊU");
        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(325, 510));
        setResizable(false);

        pass.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        user.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N

        loginBut.setBackground(new java.awt.Color(0, 102, 255));
        loginBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginBut.setForeground(new java.awt.Color(255, 255, 255));
        loginBut.setText("Đăng nhập");
        loginBut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)));
        loginBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButMouseClicked(evt);
            }
        });
        loginBut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButKeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/key.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock1.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), null));

        jLabel7.setText("@Nhóm 3");

        changePassBut.setBackground(new java.awt.Color(238, 237, 237));
        changePassBut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changePassBut.setForeground(new java.awt.Color(0, 102, 255));
        changePassBut.setText("Đổi mật khẩu");
        changePassBut.setBorder(null);
        changePassBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassButMouseClicked(evt);
            }
        });
        changePassBut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                changePassButKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(loginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(changePassBut)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(loginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(changePassBut)
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButMouseClicked
        // TODO add your handling code here:     
        if (this.user.getText().length() == 0 || 0 == String.valueOf(this.pass.getParent()).length()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập!", "THÔNG BÁO", 1);
        } else {
            result = process.testUser(this.user.getText(), String.valueOf(this.pass.getPassword()));
            try {
                if (result.next()) {
                    maTV = result.getString(1);
                    tenTv = result.getString(2);
                    quyen = result.getString(3);
                    program = new Program(this);
                    program.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!", "THÔNG BÁO", 0);
                }
            } catch (SQLException ex) {
                System.out.print("Loi: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_loginButMouseClicked

    private void loginButKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.user.getText().length() == 0 || 0 == String.valueOf(this.pass.getParent()).length()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập!", "THÔNG BÁO", 1);
            } else {
                result = process.testUser(this.user.getText(), String.valueOf(this.pass.getPassword()));
                try {
                    if (result.next()) {
                        maTV = result.getString(1);
                        tenTv = result.getString(2);
                        quyen = result.getString(3);
                        program = new Program(this);
                        program.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!", "THÔNG BÁO", 0);
                    }
                } catch (SQLException ex) {
                    System.out.print("Loi: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_loginButKeyPressed

    private void changePassButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassButMouseClicked
        // TODO add your handling code here:
        changePass = new ChangePassword(this);
        this.setVisible(false);
    }//GEN-LAST:event_changePassButMouseClicked

    private void changePassButKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changePassButKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePassButKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loginBut;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
