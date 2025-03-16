public class Demo {
    public static void main(String[] args) {
        processTransaction("creditcard", 590);
        processTransaction("paypal", 1267);
        processTransaction("crypto", 540);
        processTransaction("paypal", 829);
        processTransaction("creditcard", 100);
        System.out.println("Transaction history:");
        TransactionLogger.displayTransactions();
    }
    private static void processTransaction(String method, double amount) {
        try {
            PaymentMethod payment = PaymentFactory.createPaymentMethod(method);
            boolean success = payment.processPayment(amount);
            Transaction transaction = new Transaction(amount, method, payment.getStatus());
            TransactionLogger.transactionLog(transaction);
            System.out.println("Payment using " + method + " for $" + amount + " was " + (success ? "successful!" : "failed!"));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid payment method: " + method);
        }
    }
}
