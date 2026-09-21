package factory;

public class GamingMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Gaming mouse clicked");
    }
}