import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "root");
       PreparedStatement ps =  con.prepareStatement("SELECT * FROM register");
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("email"));
            System.out.println(rs.getString("password"));
            System.out.println(rs.getString("gender"));
            System.out.println(rs.getString("city"));
            System.out.println("-------------------------");
        }
    }
}
