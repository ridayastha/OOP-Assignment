import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {

        try {
            // IMPORTANT LINE (fixes your error)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "your_password"
            );

            System.out.println("Connected to Database");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}