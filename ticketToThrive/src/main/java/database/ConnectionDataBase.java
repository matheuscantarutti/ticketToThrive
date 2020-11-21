/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionDataBase {
    
    private ConnectionDataBase() {
    }
    
    private static Connection connection;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
                
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/julobras", "root", "senha");
            
        }
        
        return connection;
    }
}
