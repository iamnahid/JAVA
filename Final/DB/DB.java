/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisample;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Sabbir
 */
public class DB {
    Connection conn=null;
    Statement st=null;
    DB(){
        try{
        
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            st = conn.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private ResultSet getTableData(String sql){
        ResultSet rs=null;
        try{
            rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
    public void theQuery(String query){
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}