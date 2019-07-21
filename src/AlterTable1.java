
public class AlterTable1 {
    public static void main(String[] args) {
        ConnectionFile c = new ConnectionFile();
        
        try{
            c.con = c.createconnection();
            System.out.println("Connection Successful");
            
            c.con.setAutoCommit(false);
            c.pst = c.con.prepareStatement("ALTER TABLE `17IT093` ADD COLUMN `marksheet` blob");
            
            c.pst.execute();
            c.con.commit();
            
        }catch(Exception e){
            System.out.println("Exception Occur");
            System.out.println(e.getMessage());
        }
    }
}
