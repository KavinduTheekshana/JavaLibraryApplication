/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.model;

import java.sql.ResultSet;
import java.sql.Statement;
import javalibraryapplication.database.DbConnection;

/**
 *
 * @author Kavindu Theekshana
 */
public class DbSearch {
    
     Statement stmt;
     ResultSet rs = null;
    
    public ResultSet searchLogin(String txtAccount){
        
        
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE Account_Number = '"+txtAccount+"'");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;  
    }
    
}
