package factory;

public class GamingFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new GamingKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new GamingMouse();
    }
}