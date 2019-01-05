/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javalibraryapplication.model.DbSearch;
import javalibraryapplication.database.DbConnection;
import javax.swing.JOptionPane;
import javalibraryapplication.model.AddBook;
import javalibraryapplication.model.Members;

/**
 *
 * @author Dulanjali
 */
public class BookController
    {
//         public static void addBook(String isbn,String bookid,String bookname,String category,String author,String copyno,String price){
//             try{
//            
//            if("".equals(isbn) || "".equals(bookid) || "".equals(bookname) || "".equals(category) || "".equals(author) || "".equals(copyno)){
//                JOptionPane.showMessageDialog(null, "Fields cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
//            }
//            else{
//                new AddBook().bookForm(isbn,bookid,bookname,category,author,copyno,price);
//                JOptionPane.showMessageDialog(null,"New Book Record has been inserted","Successful !",JOptionPane.INFORMATION_MESSAGE);
//                DbConnection.closeCon();
//            }
//        }
//        catch(Exception ex){
//            
//        }
//
//    }
         
         public static boolean addBook(String isbn,String bookid,String bookname,String category,String author,String copyno,String price){

              
                boolean returnValue = new AddBook().bookForm(isbn,bookid,bookname,category,author,copyno,price);
                
                if(returnValue==true){
                    return true;
                }

                return false;

            } 
}
