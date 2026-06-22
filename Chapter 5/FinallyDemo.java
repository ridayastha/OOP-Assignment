public class FinallyDemo {
    public static void main(String[] args) {

        try {
            int num = 10 / 0;
            System.out.println(num);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught");

        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("End of program");
    }
}