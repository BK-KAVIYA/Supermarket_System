
package com.supermarket.common;

/**
 *
 * @author KA VI YA
 */
public class User {
    private String SellerID;
    private String SellerName;
    private String SellerAddress;
    private String password;
    private String UserType;
    private int ContacatNo;
    private int UserRolle;

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserRolle() {
        return UserRolle;
    }

    public void setUserRolle(int UserRolle) {
        this.UserRolle = UserRolle;
    }

    public String getSellerID() {
        return SellerID;
    }

    public void setSellerID(String SellerID) {
        this.SellerID = SellerID;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    public String getSellerAddress() {
        return SellerAddress;
    }

    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    public int getContacatNo() {
        return ContacatNo;
    }

    public void setContacatNo(int ContacatNo) {
        this.ContacatNo = ContacatNo;
    }
    
    
    
}
