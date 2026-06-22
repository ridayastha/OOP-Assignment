// Class definition
class Student {
    // Fields (attributes)
    String name;
    int age;
    String course;

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("----------------------");
    }

    // Method to change course
    void changeCourse(String newCourse) {
        course = newCourse;
        System.out.println(name + " has changed course to " + course);
    }
}

// Main class
public class Program1 {
    public static void main(String[] args) {

        // Object creation
        Student student1 = new Student();
        Student student2 = new Student();

        // Assigning values to object 1
        student1.name = "Hridaya Shrestha";
        student1.age = 24;
        student1.course = "Computer Science";

        // Assigning values to object 2
        student2.name = "Sita";
        student2.name = "Sita";
        student2.age = 22;
        student2.course = "Business Studies";

        // Calling methods using objects
        student1.displayDetails();
        student2.displayDetails();

        // Changing course of student1
        student1.changeCourse("Software Engineering");
        student1.displayDetails();
    }
}