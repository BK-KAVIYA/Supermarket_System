/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermarket.common;

import com.supermarket.system.DBConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KA VI YA
 */
public class UserImp implements UserDAO{
    
    PreparedStatement pst;
    PreparedStatement pst1;
    DBConnector obj=DBConnector.getObject();
    java.sql.Connection conn=obj.getConnection();

    @Override
    public void Add(User seller) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(User seller) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(User seller) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product Serch(User seller) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> list(String tableName) {
        List<User> list =new ArrayList<User>();
         try {
            
            String sql="Select * from "+tableName+";";
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                User seller = new User();
                seller.setSellerID(rs.getString(tableName+"ID"));
                seller.setSellerName(rs.getString(tableName+"Name"));
                seller.setSellerAddress(rs.getString(tableName+"Address"));
                seller.setContacatNo(rs.getInt("ContactNumber"));
                
                list.add(seller);
            
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return list;
    }

    
}
