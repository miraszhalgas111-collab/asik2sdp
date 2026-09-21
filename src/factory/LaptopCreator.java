package factory;

public class LaptopCreator extends ComputerCreator {

    @Override
    public Product createProduct() {
        return new Laptop();
    }
}