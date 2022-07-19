
package com.supermarket.common;

/**
 *
 * @author KA VI YA
 */
public interface CategoryDAO {
    public void Add(Category category);
    public void Update(Category category);
    public void Delete(Category category);
    public void Serch(String CategoryID);
}
