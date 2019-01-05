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
    public ResultSet searchBooks2(String ListId){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE id='"+ListId+"'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchMembersBorrow(String MembershipNo){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user where Membership_No='" +MembershipNo+ "'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchborrow2(String ListId){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM `borrow` WHERE id='"+ListId+"'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchBookIDBorrowForm(String BookID){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books where bookid = '" +BookID+ "'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchBorrow(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='False' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchBorrowReturn(String MembershipNo){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE membership_no='"+MembershipNo+"' AND return_ststus ='False'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchReturn(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='Done' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
