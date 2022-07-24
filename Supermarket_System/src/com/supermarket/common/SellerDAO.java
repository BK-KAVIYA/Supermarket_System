
package com.supermarket.common;

import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface SellerDAO {
    public void Add(Seller seller);
    public void Update(Seller seller);
    public void Delete(Seller seller);
    public Product Serch(Seller seller);
    public List<Seller> list();
}
