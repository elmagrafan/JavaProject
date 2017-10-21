/**
 * Created by Ovidiu on 10/14/2017.
 */
public class Account {
    private User user;
    private int balance;
    private String history;
    private String accountManager;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public String getHistory()
    {
        return history;
    }

    public void setHistory(String history)
    {
        this.history = history;
    }

    public String getAccountManager()
    {
        return accountManager;
    }

    public void setAccountManager(String accountManager)
    {
        this.accountManager = accountManager;
    }

    public Account(User user, int balance, String history, String accountManager)
    {
        this.user = user;
        this.balance = balance;
        this.history = history;
        this.accountManager = accountManager;
    }
}
