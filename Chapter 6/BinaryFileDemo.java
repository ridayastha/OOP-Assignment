import java.io.*;

public class BinaryFileDemo {
    public static void main(String[] args) {

        try {
            // Write binary data
            FileOutputStream fos = new FileOutputStream("data.bin");
            fos.write(65); // ASCII 'A'
            fos.write(66); // ASCII 'B'
            fos.close();

            // Read binary data
            FileInputStream fis = new FileInputStream("data.bin");

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error in binary file handling");
        }
    }
}