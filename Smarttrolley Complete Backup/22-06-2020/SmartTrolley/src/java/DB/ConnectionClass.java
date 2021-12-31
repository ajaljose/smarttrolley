/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Lenovo
 */
public class ConnectionClass {
    
    Connection con=null;
    Statement smt=null;
    public ResultSet rs=null;
    
    public ConnectionClass() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_smarttrolley", "root", "root");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public boolean execute(String str){
        boolean f=false;
         try {
            smt=con.createStatement();
            smt.executeUpdate(str);
            f=true;
            
         }catch (Exception ex) {
            System.out.println(ex);
        }
         return f;
    }
    
    public ResultSet readData(String str){
  
         try {
            smt=con.createStatement();
            rs=smt.executeQuery(str);
           
         }catch (Exception ex) {
            System.out.println(ex);
        }
         return rs;
    }
    
    
}