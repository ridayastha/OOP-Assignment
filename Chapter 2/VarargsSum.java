public class VarargsSum {

    static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(10, 20, 30));
        System.out.println("Sum = " + sum(5, 15, 25, 35));
    }
}