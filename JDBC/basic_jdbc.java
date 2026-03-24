import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/learning";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);


        PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES ('prakash', 'prakash123@gmail.com', 'prakash123', 'male', 'udaipur')");
        int i = ps.executeUpdate();
        if (i>0){
            System.out.println("Successfully Executed! ");
        } else {
            System.out.println("Failed");
        }

        }

}

