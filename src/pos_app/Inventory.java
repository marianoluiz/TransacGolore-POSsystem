/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;

import com.mysql.cj.jdbc.Blob;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.Time;
import javax.lang.model.util.Types;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import log_in.Login;

public class Inventory extends javax.swing.JFrame {
    Transac transac = new Transac();
    JpanelLoader jpload = new JpanelLoader();
    
    public Inventory() {
        initComponents();
        accUser.setText(UserSession.getUserName());
        accType.setText(UserSession.getUserType());
        try {
            populateTableFromDatabase();
        } catch (SQLException e) {
            System.err.println("Error populating table: " + e.getMessage());
        }
        updateCombo();
        updateCombo2();
        populateInventoryData();
        displayImage();
        inventory.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                inventoryValueChanged(evt);
                displayImage();
            }
        });
        
    }
    
    public JPanel getPanelLoad() {
        return panel_load;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        transacBtn = new javax.swing.JButton();
        invenBtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panel_load = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        recBtn = new javax.swing.JButton();
        transacBtn1 = new javax.swing.JButton();
        invenBtn1 = new javax.swing.JButton();
        acctBtn = new javax.swing.JButton();
        logoutBtn1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accUser = new javax.swing.JLabel();
        accType = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        del_product = new javax.swing.JButton();
        update_product = new javax.swing.JButton();
        add_image = new javax.swing.JButton();
        add_stock_button = new javax.swing.JButton();
        add_product_button = new javax.swing.JButton();
        add_stock = new javax.swing.JTextField();
        item_stock = new javax.swing.JTextField();
        item_price = new javax.swing.JTextField();
        item_id = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        item_type = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imagePreview = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventory = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        typeComboBox = new javax.swing.JComboBox<>();

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/placeholder-fb.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Admin");

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Records");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        transacBtn.setBackground(new java.awt.Color(255, 153, 153));
        transacBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transacBtn.setText("Transaction");
        transacBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transacBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacBtnActionPerformed(evt);
            }
        });

        invenBtn.setBackground(new java.awt.Color(255, 204, 204));
        invenBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invenBtn.setText("Inventory");
        invenBtn.setBorder(null);
        invenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenBtnActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("Accounts");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addComponent(transacBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(invenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addComponent(transacBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_load.setBackground(new java.awt.Color(225, 225, 225));
        panel_load.setPreferredSize(new java.awt.Dimension(1200, 650));

        Sidebar.setBackground(new java.awt.Color(51, 51, 51));
        Sidebar.setForeground(new java.awt.Color(255, 255, 255));
        Sidebar.setPreferredSize(new java.awt.Dimension(250, 744));

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

        transacBtn1.setBackground(new java.awt.Color(51, 51, 51));
        transacBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transacBtn1.setForeground(new java.awt.Color(255, 255, 255));
        transacBtn1.setText("Transaction");
        transacBtn1.setBorder(null);
        transacBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transacBtn1.setFocusable(false);
        transacBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transacBtn1ActionPerformed(evt);
            }
        });

        invenBtn1.setBackground(new java.awt.Color(0, 0, 0));
        invenBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invenBtn1.setForeground(new java.awt.Color(255, 255, 255));
        invenBtn1.setText("Inventory");
        invenBtn1.setBorder(null);
        invenBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invenBtn1.setFocusable(false);
        invenBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invenBtn1ActionPerformed(evt);
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

        logoutBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-right-from-bracket-solid (1).png"))); // NOI18N
        logoutBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseReleased(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/placeholder-fb.png"))); // NOI18N

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
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accUser)
                    .addComponent(accType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(invenBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acctBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transacBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addComponent(accUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accType)))
                .addGap(39, 39, 39)
                .addComponent(transacBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(invenBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(acctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(recBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 363, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setPreferredSize(new java.awt.Dimension(948, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        del_product.setBackground(new java.awt.Color(51, 51, 51));
        del_product.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        del_product.setForeground(new java.awt.Color(255, 255, 255));
        del_product.setText("Delete Product");
        del_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_productActionPerformed(evt);
            }
        });

        update_product.setBackground(new java.awt.Color(51, 51, 51));
        update_product.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_product.setForeground(new java.awt.Color(255, 255, 255));
        update_product.setText("Update Product");
        update_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_productActionPerformed(evt);
            }
        });

        add_image.setBackground(new java.awt.Color(51, 51, 51));
        add_image.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_image.setForeground(new java.awt.Color(255, 255, 255));
        add_image.setText("Add Image ");
        add_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_imageActionPerformed(evt);
            }
        });

        add_stock_button.setBackground(new java.awt.Color(51, 51, 51));
        add_stock_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_stock_button.setForeground(new java.awt.Color(255, 255, 255));
        add_stock_button.setText("Add Stock");
        add_stock_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stock_buttonActionPerformed(evt);
            }
        });

        add_product_button.setBackground(new java.awt.Color(51, 51, 51));
        add_product_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_product_button.setForeground(new java.awt.Color(255, 255, 255));
        add_product_button.setText("Add Product");
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });

        add_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stockActionPerformed(evt);
            }
        });

        item_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_nameActionPerformed(evt);
            }
        });

        jLabel10.setText("Add Stock:");

        jLabel11.setText("Current Stock:");

        jLabel12.setText("Price:");

        item_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_typeMouseClicked(evt);
            }
        });
        item_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_typeActionPerformed(evt);
            }
        });

        jLabel13.setText("Category:");

        jLabel14.setText("Product ID:");

        jLabel15.setText("Product Name:");

        jLabel16.setText("Image:");

        jPanel3.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imagePreview.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePreview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item_id)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_price)
                    .addComponent(item_stock)
                    .addComponent(add_stock)
                    .addComponent(add_stock_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_product, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(add_product_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item_name)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(item_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(0, 0, 0)
                .addComponent(item_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(item_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(item_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(item_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(item_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(add_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(del_product)
                .addGap(12, 12, 12)
                .addComponent(add_product_button)
                .addGap(12, 12, 12)
                .addComponent(add_stock_button)
                .addGap(12, 12, 12)
                .addComponent(add_image)
                .addGap(12, 12, 12)
                .addComponent(update_product)
                .addGap(20, 20, 20))
        );

        jLabel4.setBackground(new java.awt.Color(225, 225, 225));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Inventory Database");

        inventory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Product ID", "Category", "Price", "Current Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventory);

        refresh.setBackground(new java.awt.Color(51, 51, 51));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(refresh)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1555, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.PREFERRED_SIZE, 1528, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void transacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacBtnActionPerformed

    }//GEN-LAST:event_transacBtnActionPerformed

    private void invenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenBtnActionPerformed
       

    }//GEN-LAST:event_invenBtnActionPerformed

    private void transacBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transacBtn1ActionPerformed
        Transac transac = new Transac();
        jpload.jPanelLoader(panel_load, transac.getPanelLoad());
    }//GEN-LAST:event_transacBtn1ActionPerformed

    private void invenBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invenBtn1ActionPerformed
        
    }//GEN-LAST:event_invenBtn1ActionPerformed

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

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        try {
            db.connect();
            String query = "SELECT ITEM_NAME, ITEM_ID, ITEM_TYPE, ITEM_PRICE, ITEM_STOCK FROM ITEMS";
            ResultSet rs = db.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) inventory.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                Object[] rowData = new Object[] { rs.getObject(1), rs.getObject(2), rs.getObject(3), rs.getObject(4), rs.getObject(5) };
                model.addRow(rowData);
            }

            db.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed

        String selectedCategory = (String) typeComboBox.getSelectedItem();
        filterTableByCategory(selectedCategory);
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void logoutBtn1MouseReleased(java.awt.event.MouseEvent evt) {                                         

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
    
    }                                 
    private void item_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_typeActionPerformed
    }//GEN-LAST:event_item_typeActionPerformed

    private void item_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_typeMouseClicked

    }//GEN-LAST:event_item_typeMouseClicked

    private void item_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_nameActionPerformed
    }//GEN-LAST:event_item_nameActionPerformed

    private void add_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stockActionPerformed
    }//GEN-LAST:event_add_stockActionPerformed

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        String itemIdText = item_id.getText();
    boolean isItemIdEmpty = itemIdText == null || itemIdText.trim().isEmpty();

    String itemName = item_name.getText();
    String itemType = (String) item_type.getSelectedItem();
    float itemPrice = Float.parseFloat(item_price.getText());
    int itemStock = Integer.parseInt(item_stock.getText());

    java.util.Date now = new java.util.Date();
    java.sql.Date currentDate = new java.sql.Date(now.getTime());
    java.sql.Time currentTime = new java.sql.Time(now.getTime());

    boolean itemExists = false;
    try {
        db.connect();
        Connection conn = db.con;

        String checkItemSql = "SELECT COUNT(*) AS count FROM items WHERE item_name = ?";
        java.sql.PreparedStatement checkItemStmt = conn.prepareStatement(checkItemSql);
        checkItemStmt.setString(1, itemName);
        ResultSet checkItemResult = checkItemStmt.executeQuery();
        if (checkItemResult.next()) {
            int count = checkItemResult.getInt("count");
            itemExists = count > 0;
        }

        checkItemResult.close();
        checkItemStmt.close();
    } catch (SQLException ex) {
        System.out.println("An error occurred while checking if item exists: " + ex.getMessage());
    }

    if (itemExists) {
        JOptionPane.showMessageDialog(this, "Item with the same name already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String itemInsertSql;
    if (isItemIdEmpty) {
        itemInsertSql = "INSERT INTO items (item_name, item_type, item_price, item_stock, item_img) VALUES (?, ?, ?, ?, ?)";
    } else {
        itemInsertSql = "INSERT INTO items (item_id, item_name, item_type, item_price, item_stock, item_img) VALUES (?, ?, ?, ?, ?, ?)";
    }

    try {
        db.connect();
        Connection conn = db.con;

        java.sql.PreparedStatement pstmt = conn.prepareStatement(itemInsertSql, Statement.RETURN_GENERATED_KEYS);

        int parameterIndex = 1;
        if (!isItemIdEmpty) {
            pstmt.setInt(parameterIndex++, Integer.parseInt(itemIdText));
        }
        pstmt.setString(parameterIndex++, itemName);
        pstmt.setString(parameterIndex++, itemType);
        pstmt.setFloat(parameterIndex++, itemPrice);
        pstmt.setInt(parameterIndex++, itemStock);
        if (selectedImagePath != null && !selectedImagePath.isEmpty()) {
            pstmt.setString(parameterIndex, selectedImagePath);
        } else {
            pstmt.setNull(parameterIndex, java.sql.Types.VARCHAR);
        }

        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("A new product was inserted successfully!");

            if (isItemIdEmpty) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int generatedItemId = rs.getInt(1);
                    itemIdText = String.valueOf(generatedItemId);
                    System.out.println("Generated item_id: " + generatedItemId);
                }
            }

            int finalItemId = Integer.parseInt(itemIdText);
            String inventoryHistoryInsertSql = "INSERT INTO `inventory history` (inven_date, inven_time, inven_status, item_id, inven_qty) VALUES (?, ?, ?, ?, ?)";
            java.sql.PreparedStatement inventoryStmt = conn.prepareStatement(inventoryHistoryInsertSql);
            inventoryStmt.setDate(1, currentDate);
            inventoryStmt.setTime(2, currentTime);
            inventoryStmt.setString(3, "ADDED");
            inventoryStmt.setInt(4, finalItemId);
            inventoryStmt.setInt(5, itemStock);
            inventoryStmt.executeUpdate();
        }

        pstmt.close();
        db.close();
    } catch (SQLException ex) {
        System.out.println("An error occurred while inserting the product: " + ex.getMessage());
    }
    selectedImagePath = null;
    }//GEN-LAST:event_add_product_buttonActionPerformed

    private void add_stock_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stock_buttonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) inventory.getModel();

    int[] selectedRows = inventory.getSelectedRows();
    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(this, "Please select row(s) to add stock.");
        return;
    }

    for (int selectedRow : selectedRows) {
        int originalRow = inventory.convertRowIndexToModel(selectedRow); // Convert selected row index to model index

        int currentStock = (int) tblModel.getValueAt(originalRow, 4);

        String addStockText = add_stock.getText();
        int addStockValue;
        try {
            addStockValue = Integer.parseInt(addStockText);
            if (addStockValue < 0) {
                JOptionPane.showMessageDialog(this, "Please enter a non-negative integer value.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer value.");
            return;
        }

        int updatedStock = currentStock + addStockValue;

        int itemId = (int) tblModel.getValueAt(originalRow, 1);

        String updateQuery = "UPDATE items SET item_stock = " + updatedStock + " WHERE item_id = " + itemId;

        try {
            db.connect();
            Connection conn = db.con;
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(updateQuery);

            String currentDate = java.time.LocalDate.now().toString();
            String currentTime = java.time.LocalTime.now().toString();
            String inventoryHistoryInsertSql = "INSERT INTO `inventory history` (inven_date, inven_time, inven_status, item_id, inven_qty) VALUES ('"
                + currentDate + "', '"
                + currentTime + "', 'ADDED', "
                + itemId + ", "
                + addStockValue + ")";
            stmt.executeUpdate(inventoryHistoryInsertSql);

            stmt.close();
            db.close();

            tblModel.setValueAt(updatedStock, originalRow, 4);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update stock: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        JOptionPane.showMessageDialog(this, "Stock updated successfully.");
    }//GEN-LAST:event_add_stock_buttonActionPerformed

    String selectedImagePath; 
    boolean isForPreview = true;
    private void add_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_imageActionPerformed
        if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        FileDialog fileDialog = new FileDialog((Frame) null, "Select Image File");
        fileDialog.setVisible(true);
        String selectedImagePath = fileDialog.getFile();

        if (selectedImagePath != null) {
            String sourcePackagePath = "src/item_images/"; 
            this.selectedImagePath = sourcePackagePath + selectedImagePath; 
            updateImagePreview(this.selectedImagePath);
        }
    } else {
        System.out.println("Desktop not supported. Cannot open file dialog.");
    }
    }//GEN-LAST:event_add_imageActionPerformed
    private void updateImagePreview(String filePath) {
    imagePreview.setIcon(null);
    
    if (filePath != null && !filePath.isEmpty()) {
        ImageIcon icon = new ImageIcon(filePath);
        
        if (icon.getImage() != null) {
            Image scaledImage = icon.getImage().getScaledInstance(imagePreview.getWidth(), imagePreview.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            
            imagePreview.setIcon(scaledIcon);
        } else {
            System.out.println("Error: Unable to load image from file path: " + filePath);
        }
    } else {
        System.out.println("Error: Invalid file path.");
    }
}
    
    private void update_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_productActionPerformed
        int itemId = Integer.parseInt(item_id.getText());
    String itemName = item_name.getText().toUpperCase();
    String itemType = (String) item_type.getSelectedItem();
    float itemPrice = Float.parseFloat(item_price.getText());
    int itemStock = Integer.parseInt(item_stock.getText());

    try {
        db.connect();
        Connection conn = db.con;
        Statement stmt = conn.createStatement();

        String query = "SELECT item_stock FROM items WHERE item_id = " + itemId;
        ResultSet rs = stmt.executeQuery(query);
        int previousStock = 0;
        if (rs.next()) {
            previousStock = rs.getInt("item_stock");
        }

        String updateQuery = "UPDATE items SET item_name = ?, item_type = ?, item_price = ?, item_stock = ? WHERE item_id = ?";
        java.sql.PreparedStatement pstmt = conn.prepareStatement(updateQuery);

        pstmt.setString(1, itemName);
        pstmt.setString(2, itemType);
        pstmt.setFloat(3, itemPrice);
        pstmt.setInt(4, itemStock);
        pstmt.setInt(5, itemId);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Product updated successfully!");

            if (itemStock < previousStock) {
                String currentDate = java.time.LocalDate.now().toString();
                String currentTime = java.time.LocalTime.now().toString();
                String inventoryHistoryInsertSql = "INSERT INTO `inventory history` (inven_date, inven_time, inven_status, item_id, inven_qty) VALUES (?, ?, ?, ?, ?)";
                java.sql.PreparedStatement inventoryStmt = conn.prepareStatement(inventoryHistoryInsertSql);
                inventoryStmt.setString(1, currentDate);
                inventoryStmt.setString(2, currentTime);
                inventoryStmt.setString(3, "REMOVED");
                inventoryStmt.setInt(4, itemId);
                inventoryStmt.setInt(5, (previousStock - itemStock));
                inventoryStmt.executeUpdate();
            }
            else if (itemStock > previousStock) {
                String currentDate = java.time.LocalDate.now().toString();
                String currentTime = java.time.LocalTime.now().toString();
                String inventoryHistoryInsertSql = "INSERT INTO `inventory history` (inven_date, inven_time, inven_status, item_id, inven_qty) VALUES (?, ?, ?, ?, ?)";
                java.sql.PreparedStatement inventoryStmt = conn.prepareStatement(inventoryHistoryInsertSql);
                inventoryStmt.setString(1, currentDate);
                inventoryStmt.setString(2, currentTime);
                inventoryStmt.setString(3, "ADDED");
                inventoryStmt.setInt(4, itemId);
                inventoryStmt.setInt(5, (itemStock - previousStock));
                inventoryStmt.executeUpdate();
            }

if (selectedImagePath != null && !selectedImagePath.isEmpty()) {
    try {
        String updateImagePathQuery = "UPDATE items SET item_img = ? WHERE item_id = ?";
        java.sql.PreparedStatement imagePathPstmt = conn.prepareStatement(updateImagePathQuery);

        imagePathPstmt.setString(1, selectedImagePath);
        imagePathPstmt.setInt(2, itemId);

        imagePathPstmt.executeUpdate();

        imagePathPstmt.close();
    } catch (SQLException ex) {
        System.out.println("Error updating image path: " + ex.getMessage());
    }
}
        } else {
            System.out.println("No product found with ID: " + itemId);
        }

        rs.close();
        pstmt.close();
        stmt.close();
        db.close();
    } catch (SQLException ex) {
        System.out.println("An error occurred while updating the product: " + ex.getMessage());
    }

    try {
        populateTableFromDatabase();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
    selectedImagePath = null;
    }//GEN-LAST:event_update_productActionPerformed

    private void del_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_productActionPerformed

        String userType = UserSession.getUserType();
        if (userType.equals("CASHIER")) {
            JOptionPane.showMessageDialog(this, "Only admin can delete a Product", "Access Denied", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel tblModel = (DefaultTableModel) inventory.getModel();

        if (inventory.getSelectedRowCount() == 1) {
            try {
                int selectedRow = inventory.getSelectedRow();
                int modelRow = inventory.convertRowIndexToModel(selectedRow);

                String itemIdString = tblModel.getValueAt(modelRow, 1).toString();
                int itemId = Integer.parseInt(itemIdString);

                // Delete the item from the items table
                String deleteItemSql = "DELETE FROM items WHERE item_id = " + itemId;
                db.connect();
                db.executeUpdate(deleteItemSql);
                db.close();

                tblModel.removeRow(modelRow);
                JOptionPane.showMessageDialog(this, "Product deleted successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to delete product,\nPlease delete all transaction history of this item", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error parsing number: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (inventory.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a single row.");
            }
        }
    }//GEN-LAST:event_del_productActionPerformed

  private void updateCombo() {
        String sql = "SELECT item_type FROM `item types`";
        try {
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                item_type.addItem(rs.getString("item_type"));
            }
            db.close(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
  private void updateCombo2() {
        try {
        typeComboBox.removeAllItems();
        
        typeComboBox.addItem("UNCATEGORIZED");
        
        String sql = "SELECT item_type FROM `item types`";
        
        ResultSet rs = db.executeQuery(sql);
        
        while (rs.next()) {
            typeComboBox.addItem(rs.getString("item_type"));
        }
        
        db.close(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }
  
  public void filterTableByCategory(String category) {
        DefaultTableModel model = (DefaultTableModel) inventory.getModel();
    
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    inventory.setRowSorter(sorter);
    
    RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
        @Override
        public boolean include(RowFilter.Entry<? extends Object, ? extends Object> entry) {
            String itemType = (String) entry.getValue(2);
            if (category.equals("UNCATEGORIZED")) {
                return true;
            } else {
                return itemType != null && itemType.equals(category);
            }
        }
    };
    
    sorter.setRowFilter(filter);
    }
  
  private void populateTableFromDatabase() throws SQLException {
    try {
        db.connect();
        String query = "SELECT ITEM_NAME, ITEM_ID, ITEM_TYPE, ITEM_PRICE, ITEM_STOCK, ITEM_IMG FROM ITEMS";
        ResultSet rs = db.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) inventory.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String itemName = rs.getString("ITEM_NAME");
            int itemId = rs.getInt("ITEM_ID");
            String itemType = rs.getString("ITEM_TYPE");
            float itemPrice = rs.getFloat("ITEM_PRICE");
            int itemStock = rs.getInt("ITEM_STOCK");

            byte[] imageData = rs.getBytes("ITEM_IMG");

            ImageIcon imageIcon = null;
            if (imageData != null) {
                imageIcon = new ImageIcon(imageData);
                Image scaledImage = imageIcon.getImage().getScaledInstance(imagePreview.getWidth(), imagePreview.getHeight(), Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(scaledImage);
            }

            imagePreview.setIcon(imageIcon);

            Object[] rowData = new Object[]{itemName, itemId, itemType, itemPrice, itemStock};
            model.addRow(rowData);
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        inventory.setRowSorter(sorter);
    } finally {
        db.close();
    }
}
  
  private void populateInventoryData() {
    int selectedRow = inventory.getSelectedRow();
    
    if (selectedRow == -1) {
        return;
    }
    
    item_name.setText(inventory.getValueAt(selectedRow, 0).toString());
    item_id.setText(inventory.getValueAt(selectedRow, 1).toString());
    item_type.setSelectedItem(inventory.getValueAt(selectedRow, 2).toString());
    item_price.setText(inventory.getValueAt(selectedRow, 3).toString());
    item_stock.setText(inventory.getValueAt(selectedRow, 4).toString());
}
  

    public void displayImage() {
    int selectedRow = inventory.getSelectedRow();

    if (selectedRow == -1) {
        imagePreview.setIcon(null);
        return;
    }

    int itemId = (int) inventory.getValueAt(selectedRow, 1);

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
                Image scaledImage = imageIcon.getImage().getScaledInstance(imagePreview.getWidth(), imagePreview.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                imagePreview.setIcon(scaledImageIcon);
            } else {
                imagePreview.setIcon(null);
            }
        } else {
            imagePreview.setIcon(null);
        }

        rs.close();
        db.prep.close();
    } catch (SQLException ex) {
        System.out.println("Error retrieving image: " + ex.getMessage());
    } finally {
        db.close();
    }
}

  private void populateInventoryData(int selectedRow) {
        item_name.setText(inventory.getValueAt(selectedRow, 0).toString());
        item_id.setText(inventory.getValueAt(selectedRow, 1).toString());
        item_type.setSelectedItem(inventory.getValueAt(selectedRow, 2).toString());
        item_price.setText(inventory.getValueAt(selectedRow, 3).toString());
        item_stock.setText(inventory.getValueAt(selectedRow, 4).toString());
    }

  private void inventoryValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
            int selectedRow = inventory.getSelectedRow();
            if (selectedRow != -1) {
                populateInventoryData(selectedRow);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JLabel accType;
    private javax.swing.JLabel accUser;
    private javax.swing.JButton acctBtn;
    private javax.swing.JButton add_image;
    private javax.swing.JButton add_product_button;
    private javax.swing.JTextField add_stock;
    private javax.swing.JButton add_stock_button;
    private javax.swing.JButton del_product;
    private javax.swing.JLabel imagePreview;
    private javax.swing.JButton invenBtn;
    private javax.swing.JButton invenBtn1;
    private javax.swing.JTable inventory;
    private javax.swing.JTextField item_id;
    private javax.swing.JTextField item_name;
    private javax.swing.JTextField item_price;
    private javax.swing.JTextField item_stock;
    private javax.swing.JComboBox<String> item_type;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn1;
    private javax.swing.JPanel panel_load;
    private javax.swing.JButton recBtn;
    private javax.swing.JButton refresh;
    private javax.swing.JButton transacBtn;
    private javax.swing.JButton transacBtn1;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton update_product;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void setString(int i, String itemName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setFloat(int i, float itemPrice) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setInt(int i, int itemStock) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setBytes(int i, byte[] imageBytes) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private ResultSet getGeneratedKeys() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setDate(int i, Date currentDate) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setTime(int i, Time currentTime) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
