import java.sql.*;

public class CRUD {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "your_password"
            );

            Statement st = con.createStatement();

            // INSERT
            st.executeUpdate("INSERT INTO student VALUES (1, 'Ram', 20)");

            // UPDATE
            st.executeUpdate("UPDATE student SET age=22 WHERE id=1");

            // DELETE (optional)
            // st.executeUpdate("DELETE FROM student WHERE id=1");

            System.out.println("Query executed");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}