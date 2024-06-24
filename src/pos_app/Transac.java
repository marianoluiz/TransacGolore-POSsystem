/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;
import java.awt.Color;
import log_in.Login;

import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Transac extends javax.swing.JFrame {
    
    JpanelLoader jpload = new JpanelLoader();
    
    public Transac() {
        initComponents();
        AppController.registerFrame(this);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        Insets screenInsets = tk.getScreenInsets(getGraphicsConfiguration());
        int usableHeight = screenSize.height - screenInsets.bottom;
        setSize(screenSize.width, usableHeight);
        setLocation(0, 0);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        accUser.setText(UserSession.getUserName());
        accType.setText(UserSession.getUserType());
        
        try {
            populateTableFromDatabase();
        } catch (SQLException e) {
            System.err.println("Error populating table: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error: Unable to populate table from the database.\nSome features may not be available.", "Database Error", JOptionPane.WARNING_MESSAGE);
        }
        
        transacInven.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    displayImage();
                }
            }
        });
    }
    

    public JPanel getPanelLoad() {
        return panel_load;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel_load = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        recBtn = new javax.swing.JButton();
        transacBtn = new javax.swing.JButton();
        invenBtn = new javax.swing.JButton();
        acctBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accUser = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        codeSearchBar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        itemSearchBar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        transacInven = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        addToCartBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cashInput = new javax.swing.JTextField();
        changeOutput = new javax.swing.JLabel();
        totalCost = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        scrollReceipt = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        qtySpinner = new javax.swing.JSpinner();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        confirmTransactionBtn = new javax.swing.JButton();
        receiptCheckBox = new javax.swing.JCheckBox();
        itemStock = new javax.swing.JLabel();
        itemPrice = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemName = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        cartDelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setPreferredSize(new java.awt.Dimension(948, 650));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_load.setBackground(new java.awt.Color(204, 204, 255));
        panel_load.setPreferredSize(new java.awt.Dimension(1200, 650));

        Sidebar.setBackground(new java.awt.Color(51, 51, 51));
        Sidebar.setForeground(new java.awt.Color(255, 255, 255));
        Sidebar.setPreferredSize(new java.awt.Dimension(250, 650));

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

        transacBtn.setBackground(new java.awt.Color(0, 0, 0));
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

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-right-from-bracket-solid (1).png"))); // NOI18N
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtnMouseReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/placeholder-fb.png"))); // NOI18N

        accUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accUser.setForeground(new java.awt.Color(255, 255, 255));
        accUser.setText("Username");

        accType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accType.setForeground(new java.awt.Color(255, 255, 255));
        accType.setText("ADMIN");

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acctBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transacBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accUser)
                    .addComponent(accType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(SidebarLayout.createSequentialGroup()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.setEnabled(false);
        MainPanel.setPreferredSize(new java.awt.Dimension(948, 650));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Price: ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Stocks: ");

        codeSearchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codeSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeSearchBarKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Item Search: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Code Search:");

        itemSearchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchBarActionPerformed(evt);
            }
        });
        itemSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemSearchBarKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        transacInven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Category", "Item ID"
            }
        ));
        transacInven.setToolTipText("");
        transacInven.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transacInven.setShowGrid(false);
        transacInven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transacInvenMouseClicked(evt);
            }
        });
        transacInven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transacInvenKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(transacInven);
        java.awt.EventQueue.invokeLater(() -> {
            // Get the total width of the table
            int totalWidth = transacInven.getWidth();

            // Calculate the desired widths as a percentage of the total width
            int column0Width = (int) (totalWidth * 0.60); // 50% of the total width
            int column1Width = (int) (totalWidth * 0.30); // 25% of the total width
            int column2Width = (int) (totalWidth * 0.10); // 25% of the total width

            // Set the preferred column widths
            transacInven.getColumnModel().getColumn(0).setPreferredWidth(column0Width);
            transacInven.getColumnModel().getColumn(1).setPreferredWidth(column1Width);
            transacInven.getColumnModel().getColumn(2).setPreferredWidth(column2Width);
        });

        transacInven.setDefaultEditor(Object.class, null);

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("🔃");
        backBtn.setFocusPainted(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backBtnMouseReleased(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        backBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                backBtnKeyReleased(evt);
            }
        });

        addToCartBtn.setBackground(new java.awt.Color(51, 51, 51));
        addToCartBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addToCartBtn.setText("Add");
        addToCartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCartBtn.setOpaque(true);
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Item ID", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setColumnSelectionAllowed(true);
        cartTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cartTable.setShowGrid(false);
        jScrollPane1.setViewportView(cartTable);
        cartTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        java.awt.EventQueue.invokeLater(() -> {
            // Get the total width of the table
            int totalWidth = transacInven.getWidth();

            // Calculate the desired widths as a percentage of the total width
            int column0Width = (int) (totalWidth * 0.50);
            int column1Width = (int) (totalWidth * 0.12);
            int column2Width = (int) (totalWidth * 0.12);
            int column3Width = (int) (totalWidth * 0.13);

            // Set the preferred column widths
            cartTable.getColumnModel().getColumn(0).setPreferredWidth(column0Width);
            cartTable.getColumnModel().getColumn(1).setPreferredWidth(column1Width);
            cartTable.getColumnModel().getColumn(2).setPreferredWidth(column2Width);
            cartTable.getColumnModel().getColumn(3).setPreferredWidth(column3Width);
        });

        cartTable.setDefaultEditor(Object.class, null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel4.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Total Cost: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Change:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Cash: ");

        cashInput.setEnabled(false);
        cashInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashInputKeyReleased(evt);
            }
        });

        changeOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeOutput.setText("0.0");

        totalCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalCost.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("PHP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cashInput, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        scrollReceipt.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        receiptArea.setEditable(false);
        receiptArea.setColumns(20);
        receiptArea.setLineWrap(true);
        receiptArea.setRows(5);
        receiptArea.setWrapStyleWord(true);
        receiptArea.setBorder(null);
        receiptArea.setFocusable(false);
        scrollReceipt.setViewportView(receiptArea);

        qtySpinner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNCATEGORIZED", "ACCESSORY", "BOOK", "CARD", "CRAFT", "FLOWER", "MISCELLANEOUS", "SCHOOL SUPPLY", "TOY" }));
        typeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        typeComboBox.setFocusable(false);
        typeComboBox.setOpaque(true);
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Item Category:");

        confirmTransactionBtn.setBackground(new java.awt.Color(51, 51, 51));
        confirmTransactionBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmTransactionBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmTransactionBtn.setText("CONFIRM");
        confirmTransactionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmTransactionBtn.setEnabled(false);
        confirmTransactionBtn.setFocusPainted(false);
        confirmTransactionBtn.setFocusable(false);
        confirmTransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTransactionBtnActionPerformed(evt);
            }
        });

        receiptCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        receiptCheckBox.setText("Receipt");
        receiptCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        receiptCheckBox.setFocusPainted(false);

        itemStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemStock.setText("              ");

        itemPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemPrice.setText("                 ");

        jScrollPane3.setBackground(new java.awt.Color(225, 225, 225));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setOpaque(false);

        itemName.setEditable(false);
        itemName.setColumns(20);
        itemName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        itemName.setLineWrap(true);
        itemName.setWrapStyleWord(true);
        itemName.setAlignmentX(0.0F);
        itemName.setAlignmentY(0.0F);
        itemName.setBorder(null);
        itemName.setCaretColor(new java.awt.Color(225, 225, 225));
        itemName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        itemName.setEnabled(false);
        itemName.setFocusable(false);
        itemName.setHighlighter(null);
        jScrollPane3.setViewportView(itemName);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        image.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        cartDelBtn.setBackground(new java.awt.Color(51, 51, 51));
        cartDelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cartDelBtn.setText("Delete");
        cartDelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartDelBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cart");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(cartDelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollReceipt)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(receiptCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(addToCartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(253, 253, 253)
                        .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemSearchBar)
                            .addComponent(codeSearchBar)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(22, 22, 22)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(codeSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(9, 9, 9)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(scrollReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receiptCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(cartDelBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))))
        );

        SpinnerNumberModel qtySpinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        qtySpinner.setModel(qtySpinnerModel);

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void invenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenBtnActionPerformed
        
            Inventory inven = new Inventory();
            jpload.jPanelLoader(panel_load, inven.getPanelLoad());            
        
        

    }//GEN-LAST:event_invenBtnActionPerformed

    private void transacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacBtnActionPerformed
        
    }//GEN-LAST:event_transacBtnActionPerformed

    private void acctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctBtnActionPerformed

        
        String userType = UserSession.getUserType();
        if (userType.equals("CASHIER")) {
            JOptionPane.showMessageDialog(this, "Only admin can access this section", "Access Denied", JOptionPane.WARNING_MESSAGE);
        } else {
            Accounts acct = new Accounts();
            jpload.jPanelLoader(panel_load, acct.getPanelLoad());         
        }
    }//GEN-LAST:event_acctBtnActionPerformed

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed

        String userType = UserSession.getUserType();
        if (userType.equals("CASHIER")) {
            JOptionPane.showMessageDialog(this, "Only admin can access this section", "Access Denied", JOptionPane.WARNING_MESSAGE);
        } else {
            Records rec = new Records();
            jpload.jPanelLoader(panel_load, rec.getPanelLoad());        
        }
    }//GEN-LAST:event_recBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed
    
    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
            String selectedCategory = (String) typeComboBox.getSelectedItem();
            filterTableByCategory(selectedCategory);
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void transacInvenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transacInvenMouseClicked
        int selectedRow = transacInven.getSelectedRow();
        if (selectedRow != -1) {
            String itemId = transacInven.getValueAt(selectedRow, 2).toString();
            fetchItemDetails(itemId);
            
            if ((Integer) qtySpinner.getValue() == 0) {
                qtySpinner.setValue(1);
            }
            
        }
    }//GEN-LAST:event_transacInvenMouseClicked

    private void transacInvenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transacInvenKeyPressed
        int selectedRow = transacInven.getSelectedRow();
        if (selectedRow != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                selectedRow = Math.max(0, selectedRow - 1);
            } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                selectedRow = Math.min(transacInven.getRowCount() - 1, selectedRow + 1);
            }
            transacInven.setRowSelectionInterval(selectedRow, selectedRow);
            fetchItemDetails(transacInven.getValueAt(selectedRow, 2).toString());
            
            if ((Integer) qtySpinner.getValue() == 0) {
                qtySpinner.setValue(1);
            }
        }
    }//GEN-LAST:event_transacInvenKeyPressed

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        
         
         
        int selectedRow = transacInven.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an item from the table.", "No item selected", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String itemNameText = itemName.getText();

        try {
            
            String itemPriceText = itemPrice.getText().replace("₱", "");
            float itemPriceValue = Float.parseFloat(itemPriceText);
            
            int availStock = Integer.parseInt(itemStock.getText());
            int qty = (Integer) qtySpinner.getValue();
            
            if (qty > availStock) {
                JOptionPane.showMessageDialog(this, "Insufficient stock available!", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            String itemID = transacInven.getValueAt(selectedRow, 2).toString();
            float totalPrice = itemPriceValue * qty;
            
            int cartSubtractedStock = 0;
            
            DefaultTableModel cartModel = (DefaultTableModel) cartTable.getModel();
            for (int i = 0; i < cartModel.getRowCount(); i++) {
                String cartItemID = cartModel.getValueAt(i, 2).toString();
                if (cartItemID.equals(itemID)) {
                    cartSubtractedStock += (int) cartModel.getValueAt(i, 3);
                }
            }
            
            
            
            if (qty + cartSubtractedStock > availStock) {
                JOptionPane.showMessageDialog(this, "Insufficient stock available!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.addRow(new Object[]{itemNameText, totalPrice, itemID, qty, itemPriceValue});
            
            cashInput.setEnabled(true);
            clearCashInput();
            clearReceipt();
            updateTotalCost();
            
            qtySpinner.setValue(1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Try Again!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void itemSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchBarActionPerformed

    }//GEN-LAST:event_itemSearchBarActionPerformed

    private void itemSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemSearchBarKeyReleased
        
        if (!"UNCATEGORIZED".equals(typeComboBox.getSelectedItem())) {
            typeComboBox.setSelectedItem("UNCATEGORIZED");
        }
        
        String searchText = itemSearchBar.getText();
        codeSearchBar.setText("");
        filterTableByName(searchText);
        
    }//GEN-LAST:event_itemSearchBarKeyReleased

    private void codeSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeSearchBarKeyReleased
        
        typeComboBox.setSelectedItem("UNCATEGORIZED");
        
        if ((typeComboBox.getSelectedItem()).equals("UNCATEGORIZED")) {
            typeComboBox.setSelectedItem("UNCATEGORIZED");
        }
        
        String searchText = codeSearchBar.getText();
        itemSearchBar.setText("");
        filterTableByCode(searchText);
    }//GEN-LAST:event_codeSearchBarKeyReleased

    private void cartDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartDelBtnActionPerformed
        int selectedRow = cartTable.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.removeRow(selectedRow);
            
            updateTotalCost();
            calculateChange();
            clearReceipt();
            if(Float.parseFloat(totalCost.getText().replace("₱", "")) == 0) {
                confirmTransactionBtn.setEnabled(false);
            }
            clearCashInput();
            validateCashInput();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cartDelBtnActionPerformed

    private void cashInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashInputKeyReleased
        calculateChange();

        validateCashInput();

    }//GEN-LAST:event_cashInputKeyReleased

    private void confirmTransactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTransactionBtnActionPerformed
 

        boolean printingCompleted = false; 

        try {
            db.connect();
            
            if (receiptCheckBox.isSelected()) {
                printingCompleted = printReceipt();
            }
            
            if (printingCompleted || !receiptCheckBox.isSelected()) {
                
                JOptionPane.showMessageDialog(this, "Transaction confirmed. Item stocks updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
                for (int i = 0; i < model.getRowCount(); i++) {
                    int itemID = Integer.parseInt(model.getValueAt(i, 2).toString());
                    int quantity = (int) model.getValueAt(i, 3);

                    updateItemStock(itemID, quantity);
                }
                addTransacHistory();
                model.setRowCount(0);
                populateTableFromDatabase();
                clearCashInput();
                clearReceipt();
                updateTotalCost();
                calculateChange();

                confirmTransactionBtn.setEnabled(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating item stock in database.", "Database Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_confirmTransactionBtnActionPerformed

    private void logoutBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseReleased

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

    }//GEN-LAST:event_logoutBtnMouseReleased

    private void backBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backBtnKeyReleased
    }//GEN-LAST:event_backBtnKeyReleased

    private void backBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseReleased
        Transac transac = new Transac(); 
        jpload.jPanelLoader(panel_load, transac.getPanelLoad());  
    }//GEN-LAST:event_backBtnMouseReleased
    
    
    
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JLabel accType;
    private javax.swing.JLabel accUser;
    private javax.swing.JButton acctBtn;
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cartDelBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField cashInput;
    private javax.swing.JLabel changeOutput;
    private javax.swing.JTextField codeSearchBar;
    private javax.swing.JButton confirmTransactionBtn;
    private javax.swing.JLabel image;
    private javax.swing.JButton invenBtn;
    private javax.swing.JTextArea itemName;
    private javax.swing.JLabel itemPrice;
    private javax.swing.JTextField itemSearchBar;
    private javax.swing.JLabel itemStock;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel panel_load;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton recBtn;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JCheckBox receiptCheckBox;
    private javax.swing.JScrollPane scrollReceipt;
    private javax.swing.JLabel totalCost;
    private javax.swing.JButton transacBtn;
    private javax.swing.JTable transacInven;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables


        private void populateTableFromDatabase() throws SQLException {
                db.connect();
                String query = "SELECT ITEM_NAME, ITEM_TYPE, ITEM_ID FROM ITEMS";
                ResultSet rs = db.executeQuery(query);
                DefaultTableModel model = (DefaultTableModel) transacInven.getModel();

                model.setRowCount(0);

                while (rs.next()) {
                    Object[] rowData = new Object[] { rs.getObject(1), rs.getObject(2), rs.getObject(3) };
                    model.addRow(rowData);
                }

                db.close();
            }
    
        private void filterTableByCategory(String category) {
            DefaultTableModel model = (DefaultTableModel) transacInven.getModel();

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            transacInven.setRowSorter(sorter);

            RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {

            @Override
            public boolean include(Entry<? extends Object, ? extends Object> entry) {
                String itemType = (String) entry.getValue(1); // Assuming category is in the 2nd column (index 1)
                if (category.equals("UNCATEGORIZED")) {
                    return true;
                } else {
                    return itemType != null && itemType.equals(category);
                }
            }

            };

            sorter.setRowFilter(filter);
        }
    
        private void fetchItemDetails(String itemId) {

            String query = "SELECT item_name, item_price, item_stock FROM items WHERE item_id = ?";

            try {

                db.connect();

                PreparedStatement stmt = db.con.prepareStatement(query);
                stmt.setString(1, itemId);

                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    itemName.setText(rs.getString("item_name"));
                    itemPrice.setText("₱" + rs.getString("item_price"));
                    itemStock.setText(rs.getString("item_stock"));
                }

                rs.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error in  fetching data", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                db.close();
            }

        }
    
        private void filterTableByName(String searchText) {
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) transacInven.getModel());
            transacInven.setRowSorter(sorter);
            
            if (searchText.trim().length() == 0) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 0));
            }

        }

        private void filterTableByCode(String searchText) {
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) transacInven.getModel());
            transacInven.setRowSorter(sorter);
            if (searchText.trim().length() == 0) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 2));
            }
        }

        private void updateTotalCost() {
            DefaultTableModel cartModel = (DefaultTableModel) cartTable.getModel();
            float totalCostValue = 0;

            for (int i = 0; i < cartModel.getRowCount(); i++) {
                totalCostValue += (float) cartModel.getValueAt(i, 1); // Assuming the price is in the 2nd column (index 1)
            }

            totalCost.setText("₱" + totalCostValue);
        }
        
        private void calculateChange() {
            try {
                String totalCostText = totalCost.getText().replace("₱", "");
                float totalCostValue = Float.parseFloat(totalCostText);
                                
                String cashInputText = cashInput.getText().trim();
                float cashInputValue = 0;
                
                if (!cashInputText.isEmpty()) {
                    cashInputValue = Float.parseFloat(cashInputText);
                }
                 
                float changeValue = cashInputValue - totalCostValue;

                changeOutput.setText("₱" + changeValue);
                
            } catch (NumberFormatException e) {
                confirmTransactionBtn.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        private void updateItemStock(int itemID, int quantity) throws SQLException {
            String updateQuery = "UPDATE items SET item_stock = item_stock - ? WHERE item_id = ?";
            
            try (PreparedStatement prep = db.con.prepareStatement(updateQuery)) {
                prep.setInt(1, quantity);
                prep.setInt(2, itemID);
                prep.executeUpdate();
            }
        }
        
        private void validateCashInput() {
            try {
                String input = cashInput.getText();
                
                float cash = Float.parseFloat(cashInput.getText());
                float total = Float.parseFloat(totalCost.getText().replaceAll("[^0-9.]", ""));
                float change = Float.parseFloat(changeOutput.getText().replaceAll("[^0-9.]", ""));
                
                
                
                if (cash >= total) {
                    confirmTransactionBtn.setEnabled(true);
                    generateReceipt(cash, total, change);
                } else {
                    confirmTransactionBtn.setEnabled(false);
                }
            } catch (NumberFormatException e) {
                confirmTransactionBtn.setEnabled(false);
            }
            
        }
        
        private void generateReceipt(float cash, float total, float change) {
            StringBuilder receiptBuilder = new StringBuilder();
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedDate = now.format(dateFormatter);
            String formattedTime = now.format(timeFormatter);
            
            String userNameReceipt = UserSession.getUserName();
            String userTypeReceipt = UserSession.getUserType();
            
            receiptBuilder.append("\n\t\tGifts Galore\n");
            receiptBuilder.append("\t\tKabatuhan Rd.\n");
            receiptBuilder.append("\t\tCaloocan City\n");
            receiptBuilder.append("\n______________________________________________________________\n");
            receiptBuilder.append(" Description\t\t\t\tAmount");
            receiptBuilder.append("\n______________________________________________________________\n");

            for (int row = 0; row < cartTable.getRowCount(); row++) {
                String itemNameReceipt = cartTable.getValueAt(row, 0).toString();
                float itemPriceReceipt = Float.parseFloat(cartTable.getValueAt(row, 1).toString());
                int quantityReceipt = Integer.parseInt(cartTable.getValueAt(row, 3).toString());
                
                receiptBuilder.append(String.format(" %-40s\n", itemNameReceipt));
                receiptBuilder.append(String.format(" %d pc(s)\t\t\t\t₱%.2f\n", quantityReceipt, itemPriceReceipt));

            }   
            receiptBuilder.append("______________________________________________________________\n");
            receiptBuilder.append(String.format(" %s\t\t\t\t ₱%.2f\n", "Total:", total));
            receiptBuilder.append(String.format(" %s\t\t\t\t ₱%.2f\n", "Cash:", cash));
            receiptBuilder.append(String.format(" %s\t\t\t\t ₱%.2f\n\n", "Change:", change));
            receiptBuilder.append(String.format(" %s\t\t\t\t ₱%.2f\n", "Vatable Sales", total - (total * 0.12)));
            receiptBuilder.append(String.format(" %s\t\t\t\t ₱%.2f\n", "VAT 12%", total * (0.12)));
            receiptBuilder.append("______________________________________________________________\n");
            receiptBuilder.append(String.format(" %s\t\t\t\t %s\n", "Date:", formattedDate));
            receiptBuilder.append(String.format(" %s\t\t\t\t %s\n", "Time:", formattedTime));
            receiptBuilder.append(String.format(" %s\t\t\t\t %s\n", "Processed By:", userNameReceipt));
            receiptBuilder.append(String.format(" %s\t\t\t\t %s\n", " ", userTypeReceipt));

            receiptBuilder.append("______________________________________________________________\n\n");
            receiptBuilder.append("\t**THIS SERVES AS YOUR OFFICIAL RECEIPT**\n");
            receiptBuilder.append("______________________________________________________________\n");

            receiptArea.setText(receiptBuilder.toString());
        }

        private void clearReceipt() {
            receiptArea.setText("");
        }
        
        private void clearCashInput() {
            cashInput.setText("");
        }
        
        private String getSpaces(int numSpaces) {
            StringBuilder spaces = new StringBuilder();
            for (int i = 0; i < numSpaces; i++) {
                spaces.append(" ");
            }
            return spaces.toString();
        }
        

        private void addTransacHistory() {
            String insertSQL = "INSERT INTO transactions (transac_date, transac_time, item_id, item_qty) VALUES (?, ?, ?, ?)";

            try {
                db.connect();

                db.prep = db.con.prepareStatement(insertSQL);

                for (int row = 0; row < cartTable.getRowCount(); row++) {
                    try {
                        int itemId = Integer.parseInt(cartTable.getValueAt(row, 2).toString());
                        int quantity = Integer.parseInt(cartTable.getValueAt(row, 3).toString());

                        java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
                        java.sql.Time currentTime = new java.sql.Time(System.currentTimeMillis());

                        db.prep.setDate(1, currentDate);
                        db.prep.setTime(2, currentTime);
                        db.prep.setInt(3, itemId);
                        db.prep.setInt(4, quantity);

                        db.prep.executeUpdate();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding transaction history: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            db.close();
        }
        }
        
    public void displayImage() {
        int selectedRow = transacInven.getSelectedRow();

        if (selectedRow == -1) {
            image.setIcon(null);
            return;
        }

        int itemId = (int) transacInven.getValueAt(selectedRow, 2);

        try {
            db.connect();
            String sql = "SELECT item_img FROM items WHERE item_id = ?";
            db.prep = db.con.prepareStatement(sql);
            db.prep.setInt(1, itemId);

            ResultSet rs = db.prep.executeQuery();

            if (rs.next()) {
                String imagePath = rs.getString("item_img");

                if (imagePath != null && !imagePath.isEmpty()) {
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    Image scaledImage = imageIcon.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                    image.setIcon(scaledImageIcon);
                } else {
                    image.setIcon(null);
                }
            } else {
                image.setIcon(null);
            }

            rs.close();
            db.prep.close();
        } catch (SQLException ex) {
            System.out.println("Error retrieving image: " + ex.getMessage());
        } finally {
            db.close();
        }
    }

    private boolean printReceipt() {
        PrinterJob job = PrinterJob.getPrinterJob();

        // 3x6 inch paper size
        Paper paper = new Paper();
        double width = 4 * 72;  // 3 inches
        double height = 6 * 72; // 6 inches
        paper.setSize(width, height);
        paper.setImageableArea(0, 0, width, height);

        PageFormat pf = job.defaultPage();
        pf.setPaper(paper);

        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) g;

                g2d.translate(pf.getImageableX(), pf.getImageableY());

                double scaleX = pf.getImageableWidth() / receiptArea.getWidth();
                double scaleY = pf.getImageableHeight() / receiptArea.getHeight();
                g2d.scale(scaleX, scaleY);

                boolean doubleBuffered = receiptArea.isDoubleBuffered();
                receiptArea.setDoubleBuffered(false);

                receiptArea.printAll(g2d);

                receiptArea.setDoubleBuffered(doubleBuffered);

                return PAGE_EXISTS;
            }
        }, pf);

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
                return true;
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(this, "Error printing receipt: " + ex.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return false;
    }

}
        

