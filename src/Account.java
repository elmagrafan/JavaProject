import java.util.ArrayList;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public class Account {
    private User user;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public Account(User user, double balance, ArrayList<Transaction> history)
    {
        this.user = user;
        this.balance = balance;
        this.transactionHistory = history;
    }

    public User getUser()
    {
        return user;
    }

    public double getBalance()
    {
        return balance;
    }

    public ArrayList<Transaction> getTransactionHistory()
    {
        return transactionHistory;
    }

    public void addToBalance(double sum)
    {
        // Check for balance under 0 ???
        this.balance += sum;
    }
}
