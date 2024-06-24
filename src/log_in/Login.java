/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package log_in;

import pos_app.db;
import pos_app.Transac;
import pos_app.UserSession;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTextfield = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Right = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setName("LOGIN"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setForeground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 480));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));
        Left.add(usernameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 43));

        jLabel2.setText("Password");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, -1));
        Left.add(passwordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 290, 45));

        loginBtn.setText("Log in");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        Left.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 85, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoTransacGalore.jpg"))); // NOI18N
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 89, 91));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Galore");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Transac");
        Left.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jPanel1.add(Left);
        Left.setBounds(340, 0, 350, 410);

        Right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blck-bg 3.jpg"))); // NOI18N
        Right.setText("jLabel3");
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.add(Right);
        Right.setBounds(0, 0, 340, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        login();
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JLabel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables


    public void login() {
        String username = usernameTextfield.getText();
        String password = new String(passwordTextfield.getPassword());

        String query = "SELECT account_type, username FROM accounts WHERE BINARY username = ? AND password = ?";

        try {
            db.connect();
            db.prep = db.con.prepareStatement(query);
            db.prep.setString(1, username);
            db.prep.setString(2, password);
            db.result = db.prep.executeQuery();

            if (db.result.next()) {
                String accountType = db.result.getString("account_type");
                UserSession.setUserType(accountType);
                
                String accountName = db.result.getString("username");
                UserSession.setUserName(accountName);
                
                Transac transacFrame = new Transac();
                transacFrame.setVisible(true);
                transacFrame.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error logging in: " + ex.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            db.close();
        }
    }



}






