
import java.sql.*;

public class ConnectionFile {
        Statement st = null;
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pst = null;
    public static void main(String[] args) {
        
    }
    
    public static Connection createconnection() throws SQLException{
        ConnectionFile c = new ConnectionFile();
         c.con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
        return c.con;
    }
}
