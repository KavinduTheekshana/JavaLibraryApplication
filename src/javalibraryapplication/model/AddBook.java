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
 * @author Dulanjali
 */
public class AddBook 
    {

    
    public boolean bookForm(String isbn,String bookid,String bookname,String category,String author,String copyno,String price){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT into books (`isbn`, `bookid`, `bookname`, `category`, `author`, `copyno`, `price`)"
                    + " VALUES('" +isbn+ "','" +bookid+ "','" +bookname+ "','" +category+ "','" +author+ "','" +copyno+ "','" +price+ "')");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    public boolean bookUpdateForm(String isbn,String bookid,String bookname,String category,String author,String copyno,String price,String listId){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE `books` SET `isbn`='"+isbn+"',`bookid`='"+bookid+"',"
                    + "`bookname`='"+bookname+"',`category`='"+category+"',`author`='"+author+"',"
                            + "`copyno`='"+copyno+"',`price`='"+price+"' WHERE `id`='"+listId+"'");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
     public boolean deleteForm(String listid){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM `books` WHERE `id`='"+listid+"'");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    }
