import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/learning";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);


        PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);
        ps.setString(4, gender);
        ps.setString(5, city);

        int i = ps.executeUpdate();
        if (i>0){
            System.out.println("Successfully Executed! ");
        } else {
            System.out.println("Failed");
        }

        }

}
