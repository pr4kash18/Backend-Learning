import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args) throws Exception{
        String name2="bhavesh";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "pr4kash18");
        PreparedStatement ps = connect.prepareStatement("DELETE FROM register WHERE name=?");
        ps.setString(1, name2);
        int i = ps.executeUpdate();
        if (i>0){
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Error!!!");
        }
    }
}
