class Transaction {
    private final double amount;
    private final String paymentMethod;
    private final String status;

    public Transaction(double amount, String paymentMethod, String status) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }
    public String toString() {
        return "Amount: " + amount + ", Method: " + paymentMethod + ", Status: " + status;
    }
}
