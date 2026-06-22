interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using PayPal");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay(5000);

        p = new PayPal();
        p.pay(2500);
    }
}