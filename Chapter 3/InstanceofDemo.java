class Animal {
}

class Dog extends Animal {
}

public class InstanceofDemo {
    public static void main(String[] args) {

        Animal a = new Dog();

        if (a instanceof Dog) {
            System.out.println("a is an instance of Dog");
        }

        if (a instanceof Animal) {
            System.out.println("a is an instance of Animal");
        }
    }
}