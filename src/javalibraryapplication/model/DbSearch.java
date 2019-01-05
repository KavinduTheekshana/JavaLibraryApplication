/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javalibraryapplication.database.DbConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Theekshana
 */
public class DbSearch {
    
     Statement stmt;
     ResultSet rs = null;
    
    public ResultSet searchLogin(String Membership_No){
 
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE Membership_No = '"+Membership_No+"'");
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return rs;  
    }
    
    public ResultSet searchMembers(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchBooks(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
