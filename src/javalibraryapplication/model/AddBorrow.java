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
public class AddBorrow 
    {
    
    public boolean borrowForm(String membershipNo,String memberName,String bookid,String bookname,String category,String author,String browingDate,String returningDate){
        Statement stmt;
        Statement stmt2;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT into borrow (`membership_no`, `member_name`, `book_id`, `bookname`, `category`, `author`, `borrowing_date`, `returning_date`)"
                    + " VALUES('" +membershipNo+ "','" +memberName+ "','" +bookid+ "','" +bookname+ "','" +category+ "','" +author+ "','" +browingDate+ "','" +returningDate+ "')");
            
            stmt2 = DbConnection.getStatementConnection();
            stmt2.executeUpdate("UPDATE `books` SET `copyno`=(`copyno`-1) WHERE `bookid`='" +bookid+ "'");
            DbConnection.closeCon();
            
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    public boolean UpdateborrowForm(String membershipNo,String memberName,String bookid,String bookname,
            String category,String author,String browingDate,String returningDate,String listId){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE `borrow` SET `membership_no`='"+membershipNo+"',`member_name`='"+memberName+"',"
                    + "`book_id`='"+bookid+"',`bookname`='"+bookname+"',`category`='"+category+"',`author`='"+author+"',"
                    + "`borrowing_date`='"+browingDate+"',`returning_date`='"+returningDate+"' WHERE `id`='"+listId+"'");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
     public boolean DeleteborrowForm(String listid){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM `borrow` WHERE id='"+listid+"'");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    }
