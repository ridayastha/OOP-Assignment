import java.sql.*;

public class PreparedDemo {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "your_password"
            );

            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 2);
            ps.setString(2, "Sita");
            ps.setInt(3, 21);

            ps.executeUpdate();

            System.out.println("Inserted using PreparedStatement");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}