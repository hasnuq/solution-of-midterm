class CreditCardPayment implements PaymentMethod {
    private String status;
    private final CreditCardAdapter adapter = new CreditCardAdapter();

    public boolean processPayment(double amount) {
        boolean isValid = adapter.validateCard();
        status = isValid ? "Successful" : "Failed";
        return isValid;
    }
    public String getStatus() {
        return status;
    }
}
