import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Ram"));
        list.add(new Student(101, "Sita"));
        list.add(new Student(102, "Hari"));

        Collections.sort(list);

        System.out.println("Students after sorting by ID:");

        for (Student s : list) {
            System.out.println(s);
        }
    }
}