import java.util.Scanner;
public class InserRecord1 {
    public static void main(String[] args) {
        ConnectionFile c = new ConnectionFile();
        Scanner s = new Scanner(System.in);
        try{
            c.con = c.createconnection();
            System.out.println("Connection Successful");
            
           c.con.setAutoCommit(false);
           c.pst = c.con.prepareStatement("INSERT INTO `17IT093`(`SGPA`, `CGPA`, `class`) VALUES (?,?,?)");

               for(int i=1; i<=4; i++){
                   double sgpa,cgpa;
                   System.out.println("Enter SGPA And CGPA of Sem-"+i);
                   sgpa=s.nextDouble();
                   cgpa=s.nextDouble();
                   
                   c.pst.setDouble(1,sgpa);
                   c.pst.setDouble(2,cgpa);
                   c.pst.setString(3,"DIST");
                   c.pst.execute();    
                   c.con.commit();    
               }
            
        }catch(Exception e){
            System.out.println("Exception Occur");
            System.out.println(e.getMessage());
        }
    }
}
