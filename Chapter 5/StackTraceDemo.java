public class StackTraceDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");
            e.printStackTrace(); // shows full stack trace
        }

        System.out.println("Program continues...");
    }
}