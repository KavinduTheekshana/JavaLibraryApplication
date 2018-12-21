/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabankapplication.model.DbSearch;
import javalibraryapplication.database.DbConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Theekshana
 */
public class usercontroller {
    
      public static boolean login(String txtAccount,String txtPassword) {
        try{
            String username = null;
            String password = null;
            
            
            ResultSet rs = new DbSearch().searchLogin(txtAccount);
            while(rs.next()){
                username = rs.getString("Account_Number");
                password = rs.getString("Password");
            }
            if(username != null && password != null){
                if(password.equals(txtPassword)){
                    return true;
                }
                else{
                    return false;
                }
            }
            
            DbConnection.closeCon();
        }
        catch(SQLException ex){
            Logger.getLogger(usercontroller.class.getName()).log(Level.SEVERE,null,ex);
        }
          return false;
    }
    
}
