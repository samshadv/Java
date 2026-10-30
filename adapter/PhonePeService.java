package adapter;

public class PhonePeService {
    public void doPayment(int amount, String clientId) {
        System.out.println("Processing PhonePe payment for " + clientId + ": " + amount);
    }
}