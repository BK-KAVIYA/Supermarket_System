
package com.supermarket.common;

import com.supermarket.system.Login;
import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface CategoryDAO {
    public void Add(Category category);
    public void Update(Category category);
    public void Serch(String CategoryID);
    public List<Category> list(String ID);
}
