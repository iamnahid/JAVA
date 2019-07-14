
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Main {
    Main(){
        Connection con = null;
        Statement st = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/myDatabase", "root", "");
            st = (Statement)con.createStatement();
            System.out.println("Successfully Connected!!");
            //Insert
            String sql = "INSERT INTO user (Id, Name, Contact ) VALUES (4, 'pXYZ', '25141456156')";
            System.out.println(sql);
            //delete
            sql = "delete from user where Id=10";
            System.out.println(sql);
            //Insert delete update
            st.executeUpdate(sql);
            
            //Fetching data from database
            sql = "Select * from user";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("Id"));
                System.out.println(rs.getString("Name"));
                System.out.println(rs.getString("Contact"));
            }
            
        }
        catch(Exception e){
            System.out.println("Custom: "+e.getMessage());
        }
    } 
    public static void main(String arg[])
    {
        new Main();
    }
}
