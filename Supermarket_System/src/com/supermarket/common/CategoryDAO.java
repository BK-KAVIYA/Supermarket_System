
package com.supermarket.common;

import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface CategoryDAO {
    public void Add(Category category);
    public void Update(Category category);
    public void Delete(Category category);
    public Category Serch(String sellerID,String CategoryID);
    public List<Category> list(String ID);
}
