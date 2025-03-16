interface PaymentMethod {
    boolean processPayment(double amount);
    String getStatus();
}
