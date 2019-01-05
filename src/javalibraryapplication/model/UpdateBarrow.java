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
public class UpdateBarrow 
    {
    
    public boolean borrowForm(String membershipNo,String borrowid,String returnedDate,
                        String condetion,String payment1,String payment2,String total){
        Statement stmt;
        try{
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE `borrow` SET `returned_date`='"+returnedDate+"',`condetion`='"+condetion+"',"
                    + "`condetion_Payment`='"+payment1+"',`aditionl_payment`='"+payment2+"',`total_Payment`='"+total+"' WHERE `id`='"+borrowid+"'");
            DbConnection.closeCon();
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    }
