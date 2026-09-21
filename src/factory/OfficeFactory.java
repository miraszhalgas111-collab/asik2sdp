package factory;

public class OfficeFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new OfficeKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new OfficeMouse();
    }
}
