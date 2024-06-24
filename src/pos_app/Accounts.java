/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;

import log_in.Login;

import javax.swing.*;
import java.sql.PreparedStatement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Accounts extends javax.swing.JFrame {
    
    Transac transac = new Transac();
    JpanelLoader jpload = new JpanelLoader();
    
    public Accounts() {
        
        initComponents();
        AppController.registerFrame(this);
            
        this.setExtendedState(Transac.MAXIMIZED_BOTH);
        accUser.setText(UserSession.getUserName());
        accType.setText(UserSession.getUserType());

        try {
            populateTableFromDatabaseAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            populateTableFromDatabaseCashier();
        } catch (SQLException ex) {
            Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public JPanel getPanelLoad() {
        return panel_load;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_load = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        recBtn = new javax.swing.JButton();
        transacBtn = new javax.swing.JButton();
        invenBtn = new javax.swing.JButton();
        acctBtn = new javax.swing.JButton();
        accUser = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        logoutBtn3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminTable = new javax.swing.JTable();
        AddAdmin = new javax.swing.JButton();
        RemoveAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        CashierTable = new javax.swing.JTable();
        AddCashier = new javax.swing.JButton();
        RemoveCashier = new javax.swing.JButton();
        InputUsernameAdmin = new javax.swing.JTextField();
        InputPasswordAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InputUsernameCashier = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InputPasswordCashier = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_load.setBackground(new java.awt.Color(225, 225, 225));
        panel_load.setPreferredSize(new java.awt.Dimension(1200, 650));

        SideBar.setBackground(new java.awt.Color(51, 51, 51));
        SideBar.setForeground(new java.awt.Color(255, 255, 255));
        SideBar.setPreferredSize(new java.awt.Dimension(250, 650));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/placeholder-fb.png"))); // NOI18N

        recBtn.setBackground(new java.awt.Color(51, 51, 51));
        recBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recBtn.setForeground(new java.awt.Color(255, 255, 255));
        recBtn.setText("Records");
        recBtn.setBorder(null);
        recBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recBtn.setFocusable(false);
        recBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recBtnActionPerformed(evt);
            }
        });

        transacBtn.setBackground(new java.awt.Color(51, 51, 51));
        transacBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transacBtn.setForeground(new java.awt.Color(255, 255, 255));
        transacBtn.setText("Transaction");
        transacBtn.setBorder(null);
        transacBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transacBtn.setFocusable(false);
        transacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacBtnActionPerformed(evt);
            }
        });

        invenBtn.setBackground(new java.awt.Color(51, 51, 51));
        invenBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invenBtn.setForeground(new java.awt.Color(255, 255, 255));
        invenBtn.setText("Inventory");
        invenBtn.setBorder(null);
        invenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invenBtn.setFocusable(false);
        invenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenBtnActionPerformed(evt);
            }
        });

        acctBtn.setBackground(new java.awt.Color(0, 0, 0));
        acctBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        acctBtn.setForeground(new java.awt.Color(255, 255, 255));
        acctBtn.setText("Accounts");
        acctBtn.setBorder(null);
        acctBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acctBtn.setFocusable(false);
        acctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctBtnActionPerformed(evt);
            }
        });

        accUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accUser.setForeground(new java.awt.Color(255, 255, 255));
        accUser.setText("Username");

        accType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accType.setForeground(new java.awt.Color(255, 255, 255));
        accType.setText("ADMIN");

        logoutBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-right-from-bracket-solid (1).png"))); // NOI18N
        logoutBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtn3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accUser)
                    .addComponent(accType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(invenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acctBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transacBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addComponent(accUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accType))
                    .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(transacBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(invenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(acctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(recBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainPanel.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Admin Account");

        AdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(AdminTable);

        AddAdmin.setBackground(new java.awt.Color(51, 51, 51));
        AddAdmin.setForeground(new java.awt.Color(255, 255, 255));
        AddAdmin.setText("Add");
        AddAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });

        RemoveAdmin.setBackground(new java.awt.Color(51, 51, 51));
        RemoveAdmin.setForeground(new java.awt.Color(255, 255, 255));
        RemoveAdmin.setText("Remove");
        RemoveAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Cashiers");

        CashierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(CashierTable);

        AddCashier.setBackground(new java.awt.Color(51, 51, 51));
        AddCashier.setForeground(new java.awt.Color(255, 255, 255));
        AddCashier.setText("Add");
        AddCashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCashierActionPerformed(evt);
            }
        });

        RemoveCashier.setBackground(new java.awt.Color(51, 51, 51));
        RemoveCashier.setForeground(new java.awt.Color(255, 255, 255));
        RemoveCashier.setText("Remove");
        RemoveCashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCashierActionPerformed(evt);
            }
        });

        InputUsernameAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameAdminActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel7.setText("Password");

        jLabel8.setText("Username");

        InputUsernameCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameCashierActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(92, 92, 92))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(AddAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveAdmin)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputUsernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(InputPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AddCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RemoveCashier)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InputUsernameCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InputPasswordCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGap(92, 92, 92))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAdmin)
                    .addComponent(RemoveAdmin)
                    .addComponent(InputUsernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCashier)
                    .addComponent(RemoveCashier)
                    .addComponent(InputUsernameCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(InputPasswordCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE))
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctBtnActionPerformed
      
    }//GEN-LAST:event_acctBtnActionPerformed

    private void invenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenBtnActionPerformed
        Inventory inven = new Inventory();
        jpload.jPanelLoader(panel_load, inven.getPanelLoad());
    }//GEN-LAST:event_invenBtnActionPerformed

    private void transacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacBtnActionPerformed
        Transac transac = new Transac();
        jpload.jPanelLoader(panel_load, transac.getPanelLoad());
    }//GEN-LAST:event_transacBtnActionPerformed

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed
        Records rec = new Records();
        jpload.jPanelLoader(panel_load, rec.getPanelLoad());
    }//GEN-LAST:event_recBtnActionPerformed

    private void AddCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCashierActionPerformed
                try {
                    addCashierAccount();
                    
                    populateTableFromDatabaseAdmin();
                    populateTableFromDatabaseCashier();
                    
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_AddCashierActionPerformed

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
        try {
                    addAdminAccount();
                    
                    populateTableFromDatabaseAdmin();
                    populateTableFromDatabaseCashier();
                    
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        
    }//GEN-LAST:event_AddAdminActionPerformed

    private void InputUsernameAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameAdminActionPerformed

    private void InputUsernameCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameCashierActionPerformed

    private void RemoveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAdminActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) AdminTable.getModel();

    // Check if the admin table has any rows
    if (tblModel.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Admin accounts table is empty. There are no accounts to delete.");
        return;
    }

    // Check if there's only one admin account left
    if (tblModel.getRowCount() == 1) {
        JOptionPane.showMessageDialog(this, "Only one admin account left. Deletion is not allowed.");
        return;
    }

    if (AdminTable.getSelectedRowCount() == 1) {
        // Get the username of the selected row (assuming username is in the second column)
        int selectedRow = AdminTable.getSelectedRow();
        String username = (String) tblModel.getValueAt(selectedRow, 0);

        // Query the database to get the account_id for the selected username
        String selectQuery = "SELECT account_id FROM accounts WHERE username = ?";
        try {
            db.connect();
            PreparedStatement selectPrep = db.con.prepareStatement(selectQuery);
            selectPrep.setString(1, username);
            ResultSet rs = selectPrep.executeQuery();

            if (rs.next()) {
                int accountId = rs.getInt("account_id");

                // Execute SQL DELETE query to remove the row from the database
                String deleteQuery = "DELETE FROM accounts WHERE account_id = ?";
                PreparedStatement deletePrep = db.con.prepareStatement(deleteQuery);
                deletePrep.setInt(1, accountId);
                deletePrep.executeUpdate();

                // Remove the row from the JTable
                tblModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Admin account deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Admin account not found in the database.");
            }
            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(this, "Failed to delete admin account from database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE));
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a single row.");
    }
    }//GEN-LAST:event_RemoveAdminActionPerformed

    private void RemoveCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCashierActionPerformed
          DefaultTableModel tblModel = (DefaultTableModel) CashierTable.getModel();

    if (CashierTable.getSelectedRowCount() == 1) {
        // Get the username of the selected row (assuming username is in the second column)
        int selectedRow = CashierTable.getSelectedRow();
        String username = (String) tblModel.getValueAt(selectedRow, 0);

        // Query the database to get the account_id for the selected username
        String selectQuery = "SELECT account_id FROM accounts WHERE username = ?";
        try {
            db.connect();
            PreparedStatement selectPrep = db.con.prepareStatement(selectQuery);
            selectPrep.setString(1, username);
            ResultSet rs = selectPrep.executeQuery();

            if (rs.next()) {
                int accountId = rs.getInt("account_id");

                // Execute SQL DELETE query to remove the row from the database
                String deleteQuery = "DELETE FROM accounts WHERE account_id = ?";
                PreparedStatement deletePrep = db.con.prepareStatement(deleteQuery);
                deletePrep.setInt(1, accountId);
                deletePrep.executeUpdate();

                // Remove the row from the JTable
                tblModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Cashier account deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Cashier account not found in the database.");
            }
            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(this, "Failed to delete account from database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE));
        }
    } else {
        if (CashierTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table is Empty.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a single row.");
        }
    }
    }//GEN-LAST:event_RemoveCashierActionPerformed

    private void logoutBtn3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn3MouseReleased

        CustomDialog dialog = new CustomDialog(this);
        int choice = dialog.showDialog();

        if (choice == JOptionPane.YES_OPTION) {

            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            loginFrame.setLocationRelativeTo(null);

            UserSession.setUserName(null);
            UserSession.setUserType(null);

            AppController.disposeAllFrames();
        }

    }//GEN-LAST:event_logoutBtn3MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAdmin;
    private javax.swing.JButton AddCashier;
    private javax.swing.JTable AdminTable;
    private javax.swing.JTable CashierTable;
    private javax.swing.JTextField InputPasswordAdmin;
    private javax.swing.JTextField InputPasswordCashier;
    private javax.swing.JTextField InputUsernameAdmin;
    private javax.swing.JTextField InputUsernameCashier;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton RemoveAdmin;
    private javax.swing.JButton RemoveCashier;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel accType;
    private javax.swing.JLabel accUser;
    private javax.swing.JButton acctBtn;
    private javax.swing.JButton invenBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logoutBtn3;
    private javax.swing.JPanel panel_load;
    private javax.swing.JButton recBtn;
    private javax.swing.JButton transacBtn;
    // End of variables declaration//GEN-END:variables







private void populateTableFromDatabaseAdmin() throws SQLException {
                db.connect();
                String query = "SELECT username, password FROM accounts WHERE account_type = 'Admin'";
                ResultSet rs = db.executeQuery(query);
                DefaultTableModel model = (DefaultTableModel) AdminTable.getModel();
 
                model.setRowCount(0);
 
                while (rs.next()) {
                    Object[] rowData = new Object[] { rs.getObject(1), rs.getObject(2) };
                    model.addRow(rowData);
                }
 
                db.close();
            }


private void populateTableFromDatabaseCashier() throws SQLException {
                db.connect();
                String query = "SELECT username, password FROM accounts WHERE account_type = 'Cashier'";
                ResultSet rs = db.executeQuery(query);
                DefaultTableModel model = (DefaultTableModel) CashierTable.getModel();
 
                model.setRowCount(0);
 
                while (rs.next()) {
                    Object[] rowData = new Object[] { rs.getObject(1), rs.getObject(2) };
                    model.addRow(rowData);
                }
 
                db.close();
            }

    private void addAdminAccount() throws SQLException {
        db.connect();
        
        String username = InputUsernameAdmin.getText();
        String password = InputPasswordAdmin.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and Password cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String checkQuery = "SELECT username FROM accounts WHERE username = ?";
        PreparedStatement checkPrep = db.con.prepareStatement(checkQuery);
        checkPrep.setString(1, username);
        ResultSet rs = checkPrep.executeQuery();
        System.out.println(username);
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Username already exists", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {

            String query = "INSERT INTO accounts (username, password, account_type) VALUES (?, ?, 'ADMIN')";
            PreparedStatement prep = db.con.prepareStatement(query);
            prep.setString(1, username);
            prep.setString(2, password);
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to add admin account", "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        } finally {
            db.close();
        }

        InputUsernameAdmin.setText("");
        InputPasswordAdmin.setText("");

        JOptionPane.showMessageDialog(null, "Admin account added successfully");
    }
    
    private void addCashierAccount() throws SQLException {
        String username = InputUsernameCashier.getText();
        String password = InputPasswordCashier.getText();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username and Password cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        db.connect();
        
        String checkQuery = "SELECT username FROM accounts WHERE username = ?";
        PreparedStatement checkPrep = db.con.prepareStatement(checkQuery);
        checkPrep.setString(1, username);
        ResultSet rs = checkPrep.executeQuery();
        System.out.println(username);
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Username already exists", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        System.out.println(username);
        String query = "INSERT INTO accounts (username, password, account_type) VALUES (?, ?, 'CASHIER')";
        PreparedStatement prep = db.con.prepareStatement(query);
        prep.setString(1, username);
        prep.setString(2, password);
        prep.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Failed to add admin account", "Database Error", JOptionPane.ERROR_MESSAGE);
        return;
    } finally {
        db.close();
    }
    
    InputUsernameCashier.setText("");
    InputPasswordCashier.setText("");

    JOptionPane.showMessageDialog(null, "Cashier account added successfully");
    }
    
}



 
   
        
           
