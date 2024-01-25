import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            c= DriverManager.getConnection("jdbc:mysql:///travelSystem","root","mushahid@sql");
            s= c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


//create object, try catch block, c and s, insert jar file, create connection by passing url, import sql, create statement using c