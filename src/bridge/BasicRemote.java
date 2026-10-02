package bridge;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void controlLevel(int level) {
        device.setVolume(level);
    }
}