package sqliteDataBaseDependencies;
import java.sql.*;
import java.lang.*;


public class Database {
    public static void main (String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");//now dirver is available
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ll\\IdeaProjects\\projetjava\\Project\\src\\sqliteDataBaseDependencies\\carRental.db");
        Statement stm= con.createStatement();
        ResultSet rs=stm.executeQuery("select password from users");
        //int id;
        //String login;
        String password;
        while (rs.next()){
            //id=rs.getInt("id");
            //login=rs.getString("login");
            password=rs.getString("password");
            System.out.println(password);
        }
    }
}
