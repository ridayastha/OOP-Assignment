import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextFileDemo {
    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter fw = new FileWriter("textfile.txt");
            fw.write("Hello, this is file handling in Java.");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("textfile.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}