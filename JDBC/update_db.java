import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args) throws Exception{

        String pass1 = "bhavesh123";
        String city1 = "Udaipur";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "root");
        PreparedStatement ps = conn.prepareStatement("UPDATE register SET city=? WHERE password=?");
        ps.setString(1, city1);
        ps.setString(2, pass1);
        int i = ps.executeUpdate();

        if (i>0){
            System.out.println("Database Updated!");
        }else {
            System.out.println("Error!!!!");
        }

    }
}
