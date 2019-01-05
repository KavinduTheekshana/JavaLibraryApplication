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
import javalibraryapplication.model.Members;


/**
 *
 * @author Kavindu Theekshana
 */
public class usercontroller {
    
    Statement stmt;
    ResultSet rs = null;
    private final String table = "`user`";
    protected PreparedStatement pstmt;
    
      public static int login(String txtMembershipNo,String txtPassword) {
        try{
            String username = null;
            String password = null;
            String role = null;
            
            
            ResultSet rs = new DbSearch().searchLogin(txtMembershipNo);
            while(rs.next()){
                username = rs.getString("Membership_No");
                password = rs.getString("Password");
                role = rs.getString("user_role");
            }
            if(username != null && password != null){
                if(password.equals(txtPassword)){
                    if(role.equals("admin")){
                        return 1;
                    }else if(role.equals("user")){
                        return 2;
                    }
                }
                else{
                    return 0;
                }
            }
            
            DbConnection.closeCon();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
          return 0;
    }
      
         public static boolean addMember(String membershipNo,String fullname,String address,String contact,
                String email,String nic,String sex,String dob,String psw){

              
                boolean returnValue = new Members().form(membershipNo,fullname,address,contact,email,nic,sex,dob,psw);
                
                if(returnValue==true){
                    return true;
                }

                return false;

            } 
         

          
          
          

        
    }


    

