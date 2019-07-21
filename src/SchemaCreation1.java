import java.sql.*;

public class SchemaCreation1 {
    public static void main(String[] args) throws SQLException{
        
        ConnectionFile c = new ConnectionFile();
        
     
        try{
            c.con =c.createconnection();
            System.out.println("Database connected");
            
            c.st=(c.con).createStatement();
            String sql = "CREATE TABLE demo.17IT093 (\r\n" + 
				" SemId INT NOT NULL AUTO_INCREMENT primary key,\r\n" + 
				" SGPA DECIMAL(10,2) not null,\r\n" + 
				" CGPA DECIMAL(10,2) DEFAULT NULL,\r\n" + 
				"class varchar(10) not null)";
            
            boolean tablecreated = (c.st).execute(sql); //if this statement return false then table is created
            if(!tablecreated)
                System.out.println("Table Created"); 
            
        }catch(Exception e){
            System.out.println("Got Exception");
            System.out.println(e.getMessage());
        }finally{
            if(c.con != null)
                (c.con).close();
            if(c.st != null)
                (c.st).close();
        }
    }
}
