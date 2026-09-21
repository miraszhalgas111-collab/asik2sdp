package factory;

public class OfficeMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Office mouse clicked");
    }
}