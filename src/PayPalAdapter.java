class PayPalAPI {
    public boolean sendPayment(double amount) {
        return amount < 1000; // Успешно, если сумма < 1000
    }
}
class PayPalAdapter {
    private final PayPalAPI api = new PayPalAPI();
    public boolean makePayment(double amount) {
        return api.sendPayment(amount);
    }
}