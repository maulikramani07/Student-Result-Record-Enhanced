import java.sql.SQLException;
import java.util.Scanner;

public class DisplaySGPA1 {
    public static void main(String[] args) throws SQLException{
       ConnectionFile c = new ConnectionFile();
       Scanner s = new Scanner(System.in);
       int sem;
        while(true){
            System.out.println("Enter Semester b/w 1 to 4");
            sem=s.nextInt();
            if(sem >=1 && sem<=4)
                break;
        }
        
        try{
            
            c.con = c.createconnection();
            System.out.println("Connection Successful");
            String sql = "SELECT SGPA from `17IT093` where SemId = "+sem;
            
            c.st = c.con.createStatement();
            c.rs = c.st.executeQuery(sql);
            c.rs.next();
            System.out.println(c.rs.getString("SGPA"));
            
        }catch(Exception e){
            System.out.println("Exception Ocuur");
            System.out.println(e.getMessage());
        }finally {
			if (c.rs != null) {
				c.rs.close();
			}

			if (c.st != null) {
				c.st.close();
			}

			if (c.con != null) {
				c.con.close();
			}
		}
    }
}
