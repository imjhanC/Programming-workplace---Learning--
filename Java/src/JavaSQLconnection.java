import java.sql.*;
public class JavaSQLconnection {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:????:orcl","login1","pwd1");

            if(con!= null)
                System.out.println("Connected");
            else    
                System.out.println("Not Connected");

            con.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
