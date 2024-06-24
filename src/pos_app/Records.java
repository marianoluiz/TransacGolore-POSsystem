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

import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Records extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();
    
    public Records() {
        initComponents();
        AppController.registerFrame(this);
        
        this.setExtendedState(Transac.MAXIMIZED_BOTH);
        accUser.setText(UserSession.getUserName());
        accType.setText(UserSession.getUserType());
        populateTransactions();
        populateInvHistory();
        addDocumentListenerToTextField(transacDate, transactionsRecordTable, 0);
        addDocumentListenerToTextField(invenDate, invHistory, 0);
        calculateTotalRevenue();
    }
    
    public JPanel getPanelLoad() {
        return panel_load;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_load = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        recBtn = new javax.swing.JButton();
        transacBtn = new javax.swing.JButton();
        invenBtn = new javax.swing.JButton();
        acctBtn = new javax.swing.JButton();
        logoutBtn3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accUser = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        invHistory = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        deleteTransacBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionsRecordTable = new javax.swing.JTable();
        delInvHistory = new javax.swing.JButton();
        transacDate = new javax.swing.JTextField();
        invenDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalRevenue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        itemRecSearchBar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_load.setBackground(new java.awt.Color(225, 225, 225));
        panel_load.setPreferredSize(new java.awt.Dimension(1200, 650));

        SideBar.setBackground(new java.awt.Color(51, 51, 51));
        SideBar.setPreferredSize(new java.awt.Dimension(250, 384));

        recBtn.setBackground(new java.awt.Color(0, 0, 0));
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

        acctBtn.setBackground(new java.awt.Color(51, 51, 51));
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

        logoutBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-right-from-bracket-solid (1).png"))); // NOI18N
        logoutBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtn3MouseReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/placeholder-fb.png"))); // NOI18N

        accUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accUser.setForeground(new java.awt.Color(255, 255, 255));
        accUser.setText("Username");

        accType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accType.setForeground(new java.awt.Color(255, 255, 255));
        accType.setText("ADMIN");

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
                    .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addComponent(accUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accType)))
                .addGap(39, 39, 39)
                .addComponent(transacBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(invenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(acctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(recBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 606, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(225, 225, 225));
        MainPanel.setPreferredSize(new java.awt.Dimension(948, 650));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Transactions History");

        invHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Status", "Item Name", "Item ID", "Category", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(invHistory);

        deleteTransacBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteTransacBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteTransacBtn.setText("Delete");
        deleteTransacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTransacBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Inventory History");

        transactionsRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Item Name ", "Item code", "Category", "Price ", "Quantity "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(transactionsRecordTable);

        delInvHistory.setBackground(new java.awt.Color(51, 51, 51));
        delInvHistory.setForeground(new java.awt.Color(255, 255, 255));
        delInvHistory.setText("Delete");
        delInvHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delInvHistoryActionPerformed(evt);
            }
        });

        transacDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacDateActionPerformed(evt);
            }
        });
        transacDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                transacDateKeyReleased(evt);
            }
        });

        invenDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenDateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Date (YYYY-MM-DD):");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Date (YYYY-MM-DD):");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Total Revenue:");

        totalRevenue.setEditable(false);
        totalRevenue.setBackground(new java.awt.Color(255, 255, 255));
        totalRevenue.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Item search:");

        itemRecSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemRecSearchBarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(invenDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delInvHistory))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1)))
                        .addGap(46, 46, 46)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(transacDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemRecSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(deleteTransacBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2)))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(transacDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(itemRecSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteTransacBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invenDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delInvHistory))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed

    }//GEN-LAST:event_recBtnActionPerformed

    private void transacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacBtnActionPerformed
        Transac transac = new Transac();
        jpload.jPanelLoader(panel_load, transac.getPanelLoad());
    }//GEN-LAST:event_transacBtnActionPerformed

    private void invenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenBtnActionPerformed
        Inventory inven = new Inventory();
        jpload.jPanelLoader(panel_load, inven.getPanelLoad());
    }//GEN-LAST:event_invenBtnActionPerformed

    private void acctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctBtnActionPerformed
        Accounts acct = new Accounts();
        jpload.jPanelLoader(panel_load, acct.getPanelLoad());
    }//GEN-LAST:event_acctBtnActionPerformed

    private void deleteTransacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTransacBtnActionPerformed
        int[] selectedRows = transactionsRecordTable.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Please select transaction(s) to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        try {
            db.connect();

            for (int selectedRow : selectedRows) {
                Object transacDate = transactionsRecordTable.getValueAt(selectedRow, 0);
                Object transacTime = transactionsRecordTable.getValueAt(selectedRow, 1);
                Object itemId = transactionsRecordTable.getValueAt(selectedRow, 3);
                Object itemQty = transactionsRecordTable.getValueAt(selectedRow, 6);

                System.out.println("Deleting transaction: Date=" + transacDate + ", Time=" + transacTime + ", Item ID=" + itemId + ", Quantity=" + itemQty);

                String deleteSQL = "DELETE FROM transactions WHERE transac_date = ? AND transac_time = ? AND item_id = ? AND item_qty = ?";

                db.prep = db.con.prepareStatement(deleteSQL);

                db.prep.setObject(1, transacDate);
                db.prep.setObject(2, transacTime);
                db.prep.setObject(3, itemId);
                db.prep.setObject(4, itemQty);

                db.prep.executeUpdate();

            }

            populateTransactions();
            calculateTotalRevenue();
            JOptionPane.showMessageDialog(this, "Transaction(s) deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting transaction(s): " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
            db.close();
        }
        
    }//GEN-LAST:event_deleteTransacBtnActionPerformed

    private void delInvHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delInvHistoryActionPerformed
                int selectedRow = invHistory.getSelectedRow();

            if (selectedRow != -1) {
                int itemId = (int) invHistory.getValueAt(selectedRow, 4);

                String deleteSql = "DELETE FROM `inventory history` WHERE item_id = " + itemId;

                try {
                    db.connect();
                    Connection conn = db.con;
                    Statement stmt = conn.createStatement();

                    int rowsDeleted = stmt.executeUpdate(deleteSql);
                    if (rowsDeleted > 0) {
                        System.out.println("The inventory history record was deleted successfully!");

                        ((DefaultTableModel) invHistory.getModel()).removeRow(selectedRow);
                    } else {
                        System.out.println("No inventory history record found with the specified item_id.");
                    }
                    stmt.close();
                    db.close();
                } catch (SQLException ex) {
                    System.out.println("An error occurred while deleting the inventory history record: " + ex.getMessage());
                }
            } else {
                System.out.println("Please select a row to delete.");
            }
            populateInvHistory();
    }//GEN-LAST:event_delInvHistoryActionPerformed

    private void transacDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacDateActionPerformed
        
    }//GEN-LAST:event_transacDateActionPerformed

    private void invenDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenDateActionPerformed
    }//GEN-LAST:event_invenDateActionPerformed

    private void itemRecSearchBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemRecSearchBarKeyTyped
        String searchText = itemRecSearchBar.getText();
        transacDate.setText("");
        filterTableByName(searchText);
        calculateTotalRevenue();

    }//GEN-LAST:event_itemRecSearchBarKeyTyped

    private void transacDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transacDateKeyReleased
         itemRecSearchBar.setText("");
        calculateTotalRevenue();
    }//GEN-LAST:event_transacDateKeyReleased

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
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel accType;
    private javax.swing.JLabel accUser;
    private javax.swing.JButton acctBtn;
    private javax.swing.JButton delInvHistory;
    private javax.swing.JButton deleteTransacBtn;
    private javax.swing.JTable invHistory;
    private javax.swing.JButton invenBtn;
    private javax.swing.JTextField invenDate;
    private javax.swing.JTextField itemRecSearchBar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn3;
    private javax.swing.JPanel panel_load;
    private javax.swing.JButton recBtn;
    private javax.swing.JTextField totalRevenue;
    private javax.swing.JButton transacBtn;
    private javax.swing.JTextField transacDate;
    private javax.swing.JTable transactionsRecordTable;
    // End of variables declaration//GEN-END:variables

    public void populateTransactions() {
        try {
           db.connect();
           String query = "SELECT t.transac_date, t.transac_time, t.item_id, t.item_qty, " +
                          "i.item_name, i.item_type, i.item_price " +
                          "FROM transactions t " +
                          "JOIN items i ON t.item_id = i.item_id";
           ResultSet rs = db.executeQuery(query);

           DefaultTableModel model = (DefaultTableModel) transactionsRecordTable.getModel();

           model.setRowCount(0);

           while (rs.next()) {
               Object[] rowData = new Object[]{
                       rs.getObject(1), // transac_date
                       rs.getObject(2), // transac_time
                       rs.getObject(5), // item_id
                       rs.getObject(3), // item_qty
                       rs.getObject(6), // item_name
                       rs.getObject(7), // item_type
                       rs.getObject(4)  // item_price
               };
               model.addRow(rowData);
           }

           TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
           transactionsRecordTable.setRowSorter(sorter);
       } catch (SQLException ex) {
           Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
            db.close();
       }

   }
 
    public void populateInvHistory() {
        try {
            db.connect();
            String query = "SELECT ih.inven_date, ih.inven_time, ih.inven_status, ih.item_id, ih.inven_qty, i.item_name, i.item_type, i.item_price " +
                           "FROM `inventory history` ih " +  // Use backticks if the table name contains spaces
                           "INNER JOIN items i ON ih.item_id = i.item_id";
            ResultSet rs = db.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) invHistory.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                Object[] rowData = new Object[]{
                    rs.getObject("inven_date"),  // 1st column: inven_date
                    rs.getObject("inven_time"),  // 2nd column: inven_time
                    rs.getObject("inven_status"), // 3rd column: inven_status
                    rs.getObject("item_name"),  // 6th column: item_name
                    rs.getObject("item_id"),  // 4th column: item_id
                    rs.getObject("item_type"), // 7th column: item_type
                    rs.getObject("item_price"), // 8th column: item_price
                    rs.getObject("inven_qty")  // 5th column: inven_qty
                };
                model.addRow(rowData);
            }

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            invHistory.setRowSorter(sorter);
        } catch (SQLException ex) {
            Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.close();
        }
    }
    
        public void addDocumentListenerToTextField(JTextField textField, JTable table, int columnToFilter) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable(table, textField.getText(), columnToFilter);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable(table, textField.getText(), columnToFilter);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable(table, textField.getText(), columnToFilter);
            }

            private void filterTable(JTable table, String filterText, int column) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                table.setRowSorter(sorter);
                sorter.setRowFilter(RowFilter.regexFilter(filterText, column));
            }
        });
    }

    private void filterTableByName(String searchText) {
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) transactionsRecordTable.getModel());
            transactionsRecordTable.setRowSorter(sorter);
            
            if (searchText.trim().length() == 0) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 2));
            }

    }

    private void calculateTotalRevenue() {
    DefaultTableModel model = (DefaultTableModel) transactionsRecordTable.getModel();
    float total = 0;

    for (int viewRowIndex = 0; viewRowIndex < transactionsRecordTable.getRowCount(); viewRowIndex++) {
        int modelRowIndex = transactionsRecordTable.convertRowIndexToModel(viewRowIndex);

        float price = (float) model.getValueAt(modelRowIndex, 5);
        int quantity = (int) model.getValueAt(modelRowIndex, 6);

        total += price * quantity;
    }

    totalRevenue.setText(String.valueOf(total));
}
        

}

