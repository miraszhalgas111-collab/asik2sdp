package bridge;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void controlLevel(int level) {
        System.out.println("Advanced control:");
        device.setVolume(level);
    }

    public void quickOff() {
        System.out.println("Quick shutdown");
        device.turnOff();
    }
}