package factory;

public class GamingKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Gaming keyboard is typing");
    }
}