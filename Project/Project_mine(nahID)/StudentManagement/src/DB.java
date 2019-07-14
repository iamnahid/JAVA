
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DB {
    Connection conn=null;
    Statement st=null;
   // ResultSet rs;
    DB(){
        try{
        
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            st = conn.createStatement();
          /* */
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ResultSet getTableData(String sql) throws SQLException{
        ResultSet rs=null;
        try{
            rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Operation Successful");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
    public void theQuery(String query){
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Operation uccessful");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
