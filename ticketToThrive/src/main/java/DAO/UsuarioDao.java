/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.tickettothrive.models.Empresa;
import com.mycompany.tickettothrive.models.Usuario;
import database.ConnectionDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class UsuarioDao implements BasicDao<Usuario, Integer> {

    @Override
    public void insert(Usuario t) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionDataBase.getConnection();
        

        String sql = "INSERT INTO `ticket_to_thrive`.`usuario`\n"
                + "`nome`,\n"
                + "`login`,\n"
                + "`senha`,\n"
                + "`tipo`,\n"
                + "`departamento`)\n"
                + "VALUES\n"
                + "?,\n"
                + "?,\n"
                + "?,\n"
                + "?,\n"
                + "?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, t.getNome());
        pst.setString(2, t.getLogin());
        pst.setString(3, t.getPassword());
        pst.setObject(4, t.getUserType());
        pst.setString(5, t.getDepartamento());
        
        pst.executeUpdate();
        
    }

    @Override
    public void alter(Usuario t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario searchPerId(Integer id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
