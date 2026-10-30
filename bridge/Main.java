package bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);
        remote.powerOn();
        remote.setVolume(20);
        remote.powerOff();

        Device radio = new Radio();
        Remote radioRemote = new Remote(radio);
        radioRemote.powerOn();
        radioRemote.powerOff();
    }
}