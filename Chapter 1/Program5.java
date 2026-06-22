// An enum in Java is a special data type used to define a collection of constant values. It improves code readability and prevents invalid values.
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

// Main class
public class Program5 {
    public static void main(String[] args) {

        // Assign enum values
        Day today = Day.WEDNESDAY;

        // Display value
        System.out.println("Today is: " + today);

        // Using switch with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;

            case WEDNESDAY:
                System.out.println("Midweek day");
                break;

            case FRIDAY:
                System.out.println("Almost weekend");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend holiday");
                break;

            default:
                System.out.println("Regular working day");
        }
    }
}