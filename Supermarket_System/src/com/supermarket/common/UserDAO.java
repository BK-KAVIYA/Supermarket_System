
package com.supermarket.common;

import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface UserDAO {
    public void Add(User seller);
    public void Update(User seller);
    public void Delete(User seller);
    public Product Serch(User seller);
    public List<User> list(String tableName);
}
