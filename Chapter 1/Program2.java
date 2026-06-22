// Implement a class with static variables and static methods and demonstrate their use.
// Static members belong to the class rather than objects. A static variable is shared among all objects, and a static method can be called without creating an object.

class Counter {
    // Static variable (shared by all objects)
    static int count = 0;

    // Constructor
    Counter() {
        count++;  // increments every time an object is created
    }

    // Static method
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

// Main class
public class Program2 {
    public static void main(String[] args) {

        // Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Calling static method using class name
        Counter.displayCount();
    }
}