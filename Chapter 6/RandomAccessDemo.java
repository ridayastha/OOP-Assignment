import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("random.txt", "rw");

            file.writeUTF("Hello Java");
            file.writeInt(100);

            file.seek(0);

            System.out.println(file.readUTF());
            System.out.println(file.readInt());

            file.close();

        } catch (Exception e) {
            System.out.println("Random access error");
        }
    }
}