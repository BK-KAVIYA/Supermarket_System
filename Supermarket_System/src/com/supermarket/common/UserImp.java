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
import javax.swing.JOptionPane;

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
    public void Add(User user) {
        String UserTable=null;
        int userType=0;
        try {
            if("Admin".equals(user.getUserType())){
                UserTable="admin";
                userType=1;
            }else if("Seller".equals(user.getUserType())){
                UserTable="seller";
                userType=2;
            }else{
                UserTable="Cheshire";
                userType=3;
            }
            String sql="Insert into "+UserTable+" Values(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,user.getSellerID());
            pst.setString(2,user.getSellerName());
            pst.setString(3,user.getSellerAddress());
            pst.setInt(4,user.getContacatNo());
            pst.executeUpdate();
            
            String sql1="Insert into user Values(?,?,?)";
            pst1=conn.prepareStatement(sql1);
            pst1.setString(1, user.getSellerID());
            pst1.setString(2, user.getPassword());
            pst1.setInt(3, userType);
            pst1.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"New User is added!!");
        } catch (SQLException ex) {
            Logger.getLogger(UserImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User Serch(String userID) {
        String TableName=null;
        User user = new User();
        char UserType=userID.charAt(0);
        switch(UserType){
            case 'A':
               TableName="Admin";
                break;
            case 'S':
               TableName="Seller";
                break;
            case 'C':
                TableName="Cheshire";
                break;
        }
        String sql="select * from "+TableName+" where "+TableName+"ID=?;";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,userID);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                user.setSellerID(userID);
                user.setSellerName(rs.getString(TableName+"Name"));
                user.setSellerAddress(rs.getString(TableName+"Address"));
                user.setContacatNo(rs.getInt("ContactNumber"));
            }
            
     
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
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

    @Override
    public List<User> Userlist() {
        List<User> list =new ArrayList<User>();
         try {
            
            String sql="Select * from userrolle;";
            pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                User seller = new User();
                seller.setUserRolle(rs.getInt("UserRolleID"));
                seller.setUserType(rs.getString("UserType"));              
                list.add(seller);
            
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return list;
    }


    
}
