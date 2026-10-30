package bridge;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}