/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Theekshana
 */
public class DbConnection {
    
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/javalibrary_db";
            conn = DriverManager.getConnection(url,"root","");
            
            stat = conn.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return stat;
    }
    
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
}
