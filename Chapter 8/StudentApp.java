import java.sql.*;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "your_password"
            );

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Statement st = con.createStatement();

            st.executeUpdate(
                "INSERT INTO student VALUES (" + id + ", '" + name + "', " + age + ")"
            );

            System.out.println("Student added");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}