package factory;

public class DesktopCreator extends ComputerCreator {

    @Override
    public Product createProduct() {
        return new Desktop();
    }
}