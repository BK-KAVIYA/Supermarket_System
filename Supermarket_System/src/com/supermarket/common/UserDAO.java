
package com.supermarket.common;

import java.util.List;

/**
 *
 * @author KA VI YA
 */
public interface UserDAO {
    public void Add(User user);
    public void Update(User user);
    public void Delete(User user);
    public User Serch(String userID);
    public List<User> list(String tableName);
    public List<User> Userlist();
}
