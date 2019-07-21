import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class InsertMarksheet1 {
    public static void main(String[] args) throws IOException,SQLException{
        ConnectionFile c = new ConnectionFile();
        FileInputStream image = null;
        try{
            
            c.con = c.createconnection();
            System.out.println("Connection Successful");
            
            for(int i=1; i<=4; i++){
                c.pst = c.con.prepareStatement("UPDATE `17IT093` set marksheet=? where SemId = "+i);
                File result = new File("sem"+i+".png");
                image = new FileInputStream(result);
                c.pst.setBinaryStream(1, image);
                System.out.println("Reading input file: " + result.getAbsolutePath());
                c.pst.executeUpdate();
            }
            
            System.out.println("Marksheet Images Inserted ");
            
        }catch(Exception e){
            System.out.println("Exception Occur");
            System.out.println(e.getMessage());
        }finally{
            if(image != null){
                image.close();
            }
            
            if(c.con != null){
                c.con.close();
            }
            
            if(c.pst != null){
                c.pst.close();
            }
        }
    }
}
