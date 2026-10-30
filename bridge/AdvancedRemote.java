package bridge;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}