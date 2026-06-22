abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

interface Electric {
    void charge();
}

class ElectricCar extends Vehicle implements Electric {

    void start() {
        System.out.println("Electric Car Started");
    }

    public void charge() {
        System.out.println("Charging Battery");
    }
}

public class CompareDemo {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        car.start();
        car.charge();
        car.stop();
    }
}