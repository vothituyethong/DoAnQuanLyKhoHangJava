package UTILS;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class ConnectionUtils {
    private static String hostName = "localhost";
    private static String dbName = "khohangdb";
    private static String userName = "root";
    private static String password = "";
    private static String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName+"?useUnicode=yes&characterEncoding=UTF-8";
    static Connection conn ;
    public static Connection getMyConnection(){      
        try{
            conn = DriverManager.getConnection(connectionURL, userName,password);        
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Kết nối thất bại");
        }      
        return conn;           
    }    

}
