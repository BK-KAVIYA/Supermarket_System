
package com.supermarket.common;

import com.supermarket.system.DBConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductImp implements ProductDAO{
    
    PreparedStatement pst;
    PreparedStatement pst1;
    DBConnector obj=DBConnector.getObject();
    java.sql.Connection conn=obj.getConnection();
    
    @Override
    public void Add(Product product) {
        String CategoryID=null;
        String sql="Insert into product Values(?,?,?,?);";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,product.getProductID());
            pst.setString(2,product.getProductName());
            pst.setInt(3,product.getQuantity());
            String sql1="Select * from productcategory where CategoryName='"+product.getProductCategoryID()+"'";
            pst1=conn.prepareStatement(sql1);
            ResultSet rs=pst1.executeQuery();
            while(rs.next()){
                CategoryID=rs.getString("CategoryID");
            }
            pst.setString(4,CategoryID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data recode is added!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data Insertion Error!!");
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product Serch(String productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<Product> list() {
        List<Product> list =new ArrayList<Product>();
        try {
            
            String sql="Select * from product;";
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                Product product = new Product();
                product.setProductID(rs.getString("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setQuantity(rs.getInt("Quantity"));
                product.setProductCategoryID(rs.getString("ProductCategoryID"));
                
                list.add(product);
            
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return list;
    }

    @Override
    public List<Category> Plist() {
        List<Category> list =new ArrayList<Category>();
         try {
            
            String sql="Select * from productcategory;";
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
