/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.model;

import java.sql.Statement;
import javalibraryapplication.database.DbConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu Theekshana
 */
public class Members {
    public boolean form(String membershipNo,String fullname,String address,String contact,
                String email,String nic,String sex,String dob,String psw){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT into user (`Membership_No`, `Password`, `Full_Name`, `Address`, `Contact_No`, `Email`, `Nic`, `DOB`, `Gender`)"
                    + " VALUES('" +membershipNo+ "','" +psw+ "','" +fullname+ "','" +address+ "','" +contact+ "','" +email+ "','" +nic+ "','" +dob+ "','" +sex+ "')");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    
}
