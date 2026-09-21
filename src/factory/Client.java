package factory;

public class Client {

    public static void useComputer(ComputerFactory factory) {
        Keyboard keyboard = factory.createKeyboard();
        Mouse mouse = factory.createMouse();

        keyboard.type();
        mouse.click();
    }

    public static void main(String[] args) {

        ComputerFactory gamingFactory = new GamingFactory();
        useComputer(gamingFactory);

        System.out.println();

        ComputerFactory officeFactory = new OfficeFactory();
        useComputer(officeFactory);
    }
}