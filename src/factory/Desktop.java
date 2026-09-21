package factory;

public class Desktop implements Product {

    @Override
    public void create() {
        System.out.println("Desktop created");
    }
}