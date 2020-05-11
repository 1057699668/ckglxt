package Entity;

// 事务信息类
public class Transaction {
    private int transaction_number;
    private String transaction_type;
    private int transaction_amount;
    private String transaction_time;

    public Transaction() {
    }

    public Transaction(int number, String type, int amount, String time) {
        this.transaction_number = number;
        this.transaction_type = type;
        this.transaction_amount = amount;
        this.transaction_time = time;
    }

    public int getTransaction_number() {
        return transaction_number;
    }

    public void setTransaction_number(int transaction_number) {
        this.transaction_number = transaction_number;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(int transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public String getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(String transaction_time) {
        this.transaction_time = transaction_time;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction_number=" + transaction_number +
                ", transaction_type='" + transaction_type + '\'' +
                ", transaction_amount=" + transaction_amount +
                ", transaction_time='" + transaction_time + '\'' +
                '}';
    }
}
