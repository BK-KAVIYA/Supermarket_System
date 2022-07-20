/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermarket.seller;

import com.supermarket.common.Category;
import com.supermarket.common.CategoryImp;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KA VI YA
 */
public class SellerInterface extends javax.swing.JFrame {

    CardLayout cardLayout1;
    
   private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
   
   
    public SellerInterface() { 
        initComponents();
        cardLayout1 = (CardLayout)(SellerPnnel.getLayout());
        
    }

    
    public void Load(String ID){
        CategoryImp catImp = new CategoryImp();
        List<Category> list=catImp.list(ID);
        DefaultTableModel DFT=(DefaultTableModel) CTable.getModel();
        DFT.setRowCount(0);
        for (Category ct:list){
            String PID=ct.getCategoryID();
            String PName=ct.getCategoryName();
            DFT.addRow(new Object[]{PID,PName});
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SellerPnnel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CID = new javax.swing.JTextField();
        CName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(979, 700));
        setMinimumSize(new java.awt.Dimension(979, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/man-with-beard-avatar-character-isolated-icon-free-vector-removebg-preview-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 144, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargo Supermarket ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kekanadura, Matara");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 68, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Saman Kumara");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 278, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Product");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 318, 263, 33));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add category");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 369, 263, 35));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/exit.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 329, -1));

        SellerPnnel.setBackground(new java.awt.Color(255, 255, 255));
        SellerPnnel.setMaximumSize(new java.awt.Dimension(650, 500));
        SellerPnnel.setMinimumSize(new java.awt.Dimension(650, 500));
        SellerPnnel.setName(""); // NOI18N
        SellerPnnel.setPreferredSize(new java.awt.Dimension(650, 500));
        SellerPnnel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Seller Dashboard-> Category->");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 267, 41));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Category ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Add New Category");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel3.add(CID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 250, 30));

        CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameActionPerformed(evt);
            }
        });
        jPanel3.add(CName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Category Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Delete");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Clear");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Add New Category");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category ID", "Category Name"
            }
        ));
        jScrollPane1.setViewportView(CTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 394, 91));

        jButton7.setBackground(new java.awt.Color(255, 0, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Serch");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/close.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 20, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/minimize.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, -1));

        SellerPnnel.add(jPanel3, "card1");
        jPanel3.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        SellerPnnel.add(jPanel4, "card2");

        getContentPane().add(SellerPnnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, 650, 700));
        SellerPnnel.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String CategoryID=(JOptionPane.showInputDialog("Enter the category ID"));
        
        CategoryImp categoryImp = new CategoryImp();
        Category category = new Category();
        
        category=categoryImp.Serch(getUserID(),CategoryID);
        CID.setText(category.getCategoryID());
        CName.setText(category.getCategoryName());
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Category category = new Category();
        if(!CName.equals("")&&!CID.equals("")){
                category.setCategoryID(CID.getText());
                category.setCategoryName(CName.getText());
                category.setProductSellerID(getUserID());
                
                CategoryImp categoryImp = new CategoryImp();
                categoryImp.Add(category);
                Load(getUserID());
                
                CID.setText("");
                CName.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Please Fill theall the fields!!");
        }
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Category category = new Category();
        if(!(CName.getText().equals("")&&CID.getText().equals(""))){
                category.setCategoryID(CID.getText());
                category.setCategoryName(CName.getText());
                category.setProductSellerID(getUserID());
                
                CategoryImp categoryImp = new CategoryImp();
                categoryImp.Update(category);
                Load(getUserID());
                
                CID.setText("");
                CName.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Please Fill theall the fields!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        cardLayout1.show(SellerPnnel,"card1");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       cardLayout1.show(SellerPnnel,"card2");
    }//GEN-LAST:event_jButton2MouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CID;
    private javax.swing.JTextField CName;
    private javax.swing.JTable CTable;
    private javax.swing.JPanel SellerPnnel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
