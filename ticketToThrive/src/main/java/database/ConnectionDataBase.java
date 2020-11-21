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
    
    public static Connection getConnection(){
        if(connection == null){
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
               System.out.println("Driver não encontrado");
            }
            
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/julobras", "root", "Matheus19Planswolf25@#$");
            } catch (SQLException ex) {
                System.out.println("Não consegui conectar no banco");
            }
        }
        
        return connection;
    }
}
