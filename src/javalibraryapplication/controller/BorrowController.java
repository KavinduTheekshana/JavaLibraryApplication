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
import javalibraryapplication.model.AddBorrow;
import javalibraryapplication.model.UpdateBarrow;

/**
 *
 * @author Dulanjali
 */
public class BorrowController 
    {

         
         public static boolean addBorrow(String membershipNo,String memberName,String bookid,String bookname,
                String category,String author,String browingDate,String returningDate){

              
                boolean returnValue = new AddBorrow().borrowForm(membershipNo,memberName,bookid,bookname,
                        category,author,browingDate,returningDate);
                
                if(returnValue==true){
                    return true;
                }

                return false;

            } 

        public static boolean updateReturn(String borrowid,String returnedDate,
                        String condetion,String payment1,String payment2,String total,String return_ststus){

              
                boolean returnValue = new UpdateBarrow().borrowForm(borrowid,returnedDate,condetion,payment1,payment2,total,return_ststus);
                
                if(returnValue==true){
                    return true;
                }

                return false;

            }
}
