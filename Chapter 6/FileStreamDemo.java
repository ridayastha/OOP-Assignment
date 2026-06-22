import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using streams");

        } catch (IOException e) {
            System.out.println("Error handling streams");
        }
    }
}