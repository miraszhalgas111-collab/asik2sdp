package bridge;

public class Main {

    public static void main(String[] args) {

        Device light = new Light();
        RemoteControl basicRemote = new BasicRemote(light);

        System.out.println("=== LIGHT ===");
        basicRemote.powerOn();
        basicRemote.controlLevel(70);
        basicRemote.powerOff();

        System.out.println();

        Device fan = new Fan();
        AdvancedRemote advancedRemote = new AdvancedRemote(fan);

        System.out.println("=== FAN ===");
        advancedRemote.powerOn();
        advancedRemote.controlLevel(50);
        advancedRemote.quickOff();
    }
}
