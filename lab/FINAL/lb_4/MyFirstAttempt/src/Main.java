
import com.mysql.jdbc.Connection;
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
        con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","");
        
        st = (Statement)con.createStatement();
        System.out.println("Successfull Connected !!");
        
        String sql3 = "delete from user1 where name = 'Khan' and Id='17-27899'";    //delete
        st.executeUpdate(sql3);
        
       // String sql2 = "INSERT INTO user1 (Id, name, age, contact) VALUES ('14-27599','Khan',10,'25')";             
        //st.executeUpdate(sql2);
                                          //delete
        String sql = "Select * from user1";
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
            System.out.println(rs.getString("Id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("age"));
            System.out.println(rs.getString("contact"));
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

