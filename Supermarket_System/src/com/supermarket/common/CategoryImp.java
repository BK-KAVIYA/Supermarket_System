
package com.supermarket.common;

import com.supermarket.system.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author KA VI YA
 */
public class CategoryImp implements CategoryDAO{
    
    PreparedStatement pst;
    DBConnector obj=DBConnector.getObject();
    Connection conn=obj.getConnection();
    
    @Override
    public void Add(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Serch(String CategoryID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
