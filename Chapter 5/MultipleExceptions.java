public class MultipleExceptions {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Array error

            int x = 10 / 0; // Arithmetic error

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }

        System.out.println("Done");
    }
}