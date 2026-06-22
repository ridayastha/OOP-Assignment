// A constructor is a special method used to initialize objects. Constructors can be default, parameterized, or copy constructors depending on the way they initialize object data.
class Student {
    String name;
    int age;

    // 1. Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    // 2. Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    // 3. Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy constructor called");
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("----------------");
    }
}

// Main class
public class Program4 {
    public static void main(String[] args) {

        // Default constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized constructor
        Student s2 = new Student("Aarav", 20);
        s2.display();

        // Copy constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}