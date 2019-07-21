import java.sql.SQLException;

public class Metadata1 {
    public static void main(String[] args) throws SQLException{
        ConnectionFile c = new ConnectionFile();
        
        try{
            
            c.con = c.createconnection();
            System.out.println("Connection Successful");
            
            System.out.println("Vendor: " + c.con.getMetaData().getDatabaseProductName());
            
            String sql = "SELECT COUNT(`SemId`)  FROM `17IT093`";
            c.st = c.con.createStatement();
            c.rs = c.st.executeQuery(sql);
            c.rs.next();
            
            System.out.println("Number Of Rows :"+c.rs.getString(1));
            
            
        }catch(Exception e){
            System.out.println("Exception Occur");
            System.out.println(e.getMessage());
        }finally{
            if(c.con != null)
                c.con.close();
            if(c.rs != null)
                c.rs.close();
            if(c.st != null)
                c.st.close();
        }
    }
}
