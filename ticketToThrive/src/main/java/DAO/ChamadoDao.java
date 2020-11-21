/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.tickettothrive.models.Chamado;
import database.ConnectionDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class ChamadoDao implements BasicDao<Chamado, Integer> {

    @Override
    public void insert(Chamado t) throws ClassNotFoundException, SQLException {
        
        Connection c = ConnectionDataBase.getConnection();

        String sql = "INSERT INTO `ticket_to_thrive`.`chamado`\n"
                + "`id_usuario`,\n"
                + "`prioridade`,\n"
                + "`descricao`,\n"
                + "`tratamento`,\n"
                + "`nascimento`,\n"
                + "`obito`)\n"
                + "VALUES\n"
                + "?,\n"
                + "?,\n"
                + "}?,\n"
                + "}?,\n"
                + "?,\n"
                + "?,\n"
                + "?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setObject(1, t.getCriador().getId());
        pst.setObject(2, t.getPrioridade());
        pst.setString(3, t.getDescricao());
        pst.setString(4, t.getTratamento());
        pst.setObject(5, t.getNascimento());
        pst.setObject(5, t.getObito());
        
        pst.executeUpdate();
    }

    @Override
    public void alter(Chamado t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Chamado t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chamado searchPerId(Integer id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
