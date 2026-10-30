package adapter;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(int amount) {
        payPalService.makePayment(amount);
    }
}