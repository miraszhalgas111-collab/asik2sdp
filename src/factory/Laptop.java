package factory;

public class Laptop implements Product {

    @Override
    public void create() {
        System.out.println("Laptop created");
    }
}