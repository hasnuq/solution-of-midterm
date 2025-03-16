import java.util.ArrayList;

class TransactionLogger {
    private static final ArrayList<Transaction> transactions = new ArrayList<>();
    public static void transactionLog(Transaction transaction) {
        transactions.add(transaction);
    }
    public static void displayTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
