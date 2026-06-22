// Objects can be passed as method arguments to share data between objects, and methods can also return objects to generate new objects based on computation.
class Box {
    int length;
    int width;

    // Method to set values
    void setData(int l, int w) {
        length = l;
        width = w;
    }

    // Method to display values
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width  : " + width);
    }

    // 1. Method that takes object as argument
    void compare(Box b) {
        if (this.length > b.length && this.width > b.width) {
            System.out.println("Current object is larger");
        } else {
            System.out.println("Passed object is larger or equal");
        }
    }

    // 2. Method that returns an object
    Box getDoubleSize() {
        Box temp = new Box();
        temp.length = this.length * 2;
        temp.width = this.width * 2;
        return temp;
    }
}

// Main class
public class Program3 {
    public static void main(String[] args) {

        // Creating objects
        Box b1 = new Box();
        Box b2 = new Box();

        // Setting values
        b1.setData(10, 5);
        b2.setData(7, 3);

        // Display objects
        System.out.println("Box 1:");
        b1.display();

        System.out.println("\nBox 2:");
        b2.display();

        // Passing object as argument
        System.out.println("\nComparison:");
        b1.compare(b2);

        // Returning object from method
        Box b3 = b1.getDoubleSize();

        System.out.println("\nDouble size of Box 1:");
        b3.display();
    }
}