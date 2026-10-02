package bridge;

public class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Light brightness: " + volume);
    }
}