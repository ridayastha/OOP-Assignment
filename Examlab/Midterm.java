class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student("Ram", 20);
        Student s2 = new Student("Sita", 21);

        // Calling methods
        s1.display();
        s2.display();
    }
}

class Demo {
    static void display() {
        System.out.println("Static Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo.display();
    }
}


class Student {
    static String college = "ABC College"; // Static field
    String name;                           // Instance variable

    Student(String name) {
        this.name = name;
    }

    static void showCollege() {            // Static method
        System.out.println("College: " + college);
    }

    void display() {                       // Instance method
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

    public static void main(String[] args) {

        Student.showCollege(); // Calling static method

        Student s1 = new Student("Ram");
        Student s2 = new Student("Sita");

        s1.display(); // Calling instance method
        s2.display();
    }
}

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Sita");
        names.add("Hari");

        for (String name : names) {
            System.out.println(name);
        }
    }
}


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}


public class TryExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // causes exception
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}

try {
    int arr[] = {1, 2, 3};
    System.out.println(arr[5]);
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid array index.");
}

try {
    int result = 10 / 2;
    System.out.println(result);
}
catch (ArithmeticException e) {
    System.out.println("Error occurred.");
}
finally {
    System.out.println("Finally block executed.");
}


public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}

import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}