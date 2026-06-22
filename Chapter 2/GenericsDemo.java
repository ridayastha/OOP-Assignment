class GenericBox<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

        GenericBox<String> strBox = new GenericBox<>();
        strBox.setValue("Hello Java");

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setValue(100);

        System.out.println("String Value: " + strBox.getValue());
        System.out.println("Integer Value: " + intBox.getValue());
    }
}