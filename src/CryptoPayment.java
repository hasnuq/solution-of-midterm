class CryptoPayment implements PaymentMethod {
    private String status;

    public boolean processPayment(double amount) {
        status = "Successful";
        return true;
    }
    public String getStatus() {
        return status;
    }
}
