/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.tickettothrive.models.Empresa;
import java.sql.SQLException;
/**
 *
 * @author mathe
 */
public interface BasicDao<C, K> {
    
    public void insert(C t)throws ClassNotFoundException, SQLException ;
    public void alter(C t) throws ClassNotFoundException, SQLException;
    public void delete(C t) throws ClassNotFoundException, SQLException; 
    public C searchPerId(K id) throws ClassNotFoundException, SQLException;
    public int count() throws ClassNotFoundException, SQLException; 
    
}
