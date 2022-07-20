
package com.supermarket.common;

import com.supermarket.seller.SellerInterface;
import com.supermarket.system.DBConnector;
import com.supermarket.system.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KA VI YA
 */
public class CategoryImp implements CategoryDAO{
    
    PreparedStatement pst;
    DBConnector obj=DBConnector.getObject();
    Connection conn=obj.getConnection();
    
    @Override
    public void Add(Category category) {
       String sql="Insert into productcategory Values(?,?,?);";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,category.getCategoryID());
            pst.setString(2,category.getCategoryName());
            pst.setString(3,category.getProductSellerID());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data recode is added!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data Insertion Error!!");
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }

    @Override
    public void Update(Category category) {
       String sql="update productcategory set categoryID=?, CategoryName=? where categoryID=?;";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,category.getCategoryID());
            pst.setString(2,category.getCategoryName());
            pst.setString(3,category.getCategoryID());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data recode is updated!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data updation Error!!");
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Delete(Category category) {
        try {
            String sql="Delete from productcategory where categoryID=?;";
            pst=conn.prepareStatement(sql);
            pst.setString(1,category.getCategoryID());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Recode Deleted!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Recode Deletion Error!!");
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Category Serch(String sellerID,String CategoryID) {
        Category category = new Category();
        String sql="select * from productcategory where CategoryID=? and ProductSellerID=?;";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,CategoryID);
            pst.setString(2,sellerID);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                category.setCategoryID(rs.getString("CategoryID"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setProductSellerID(rs.getString("ProductSellerID"));
            
            }
            
     
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return category;
    }

    @Override
    public List<Category> list(String ID) {
            List<Category> list =new ArrayList<Category>();
        try {
            
            String sql="Select * from productcategory where ProductSellerID='"+ID+"'";
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                Category category = new Category();
                category.setCategoryID(rs.getString("CategoryID"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setProductSellerID(rs.getString("ProductSellerID"));
                
                list.add(category);
            
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return list;
    }
    
}
