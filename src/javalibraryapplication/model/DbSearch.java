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
    
    public ResultSet searchMembers2(String ListId){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE id='"+ListId+"'");
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
    
    public ResultSet searchReturnwhenuser(String userid){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE membership_no='"+userid+"' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet bookCount(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT COUNT(id) from books");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }  


   public ResultSet memberCount(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT COUNT(id) from user");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
   
   public ResultSet borrowCount(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT COUNT(id) from borrow WHERE return_ststus='False'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
   
   
   public ResultSet ReturnCount(){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT COUNT(id) from borrow WHERE return_ststus='Done'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
   
      public ResultSet searchMemberName(String fulName){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE Full_Name LIKE '%"+fulName+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
      
      public ResultSet searchMemberEmail(String email){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE 	Email LIKE '%"+email+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
      
       public ResultSet searchMemberID(String id){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE id LIKE '%"+id+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
       
       public ResultSet searchMemberMembershipNo(String MembershipNo){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from user WHERE Membership_No LIKE '%"+MembershipNo+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
      
        public ResultSet searchBookName(String bookname){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE bookname LIKE '%"+bookname+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchBookAuthor(String Author){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE 	author LIKE '%"+Author+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
  
           
        public ResultSet searchBookID(String ID){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE bookid LIKE '%"+ID+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
              
        public ResultSet searchBookISBN(String ISBN){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE isbn LIKE '%"+ISBN+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
                 
        public ResultSet searchBookCategory(String Category){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from books WHERE 	category LIKE '%"+Category+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchBorrowId(String id){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='False' AND id LIKE '%"+id+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchBorrowMemberName(String memberName){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='False' AND member_name LIKE '%"+memberName+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
         
        public ResultSet searchBorrowBookName(String bookName){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='False' AND bookname LIKE '%"+bookName+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchReturnID(String id){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='Done' AND id LIKE '%"+id+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchReturnMemberName(String MemberName){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='Done' AND member_name LIKE '%"+MemberName+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
        
        public ResultSet searchReturnBookName(String bookName){
        try{
            stmt = DbConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * from borrow WHERE return_ststus='Done' AND bookname LIKE '%"+bookName+"%' ORDER BY id DESC");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
   
}
