class PayPalPayment implements PaymentMethod {
    private String status;
    private final PayPalAdapter adapter = new PayPalAdapter();

    public boolean processPayment(double amount) {
        boolean success = adapter.makePayment(amount);
        status = success ? "Successful" : "Failed";
        return success;
    }
    public String getStatus() {
        return status;
    }
}