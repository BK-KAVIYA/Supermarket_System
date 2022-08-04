
package com.supermarket.common;

/**
 *
 * @author KA VI YA
 */
public class Product {
    private String ProductID;
    private String ProductName;
    private int Quantity;
    private String ProductCategoryID;
    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getProductCategoryID() {
        return ProductCategoryID;
    }

    public void setProductCategoryID(String ProductCategoryID) {
        this.ProductCategoryID = ProductCategoryID;
    }
    
}
