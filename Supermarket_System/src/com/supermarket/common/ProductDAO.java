
package com.supermarket.common;

import java.util.List;


public interface ProductDAO {
    public void Add(Product product);
    public void Update(Product product);
    public Product Serch(String productID);
    public List<Product> list(String ID);
    public List<Category> Plist();
}
