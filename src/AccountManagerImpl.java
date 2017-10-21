import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public class AccountManagerImpl implements AccountManager {
    private int insertSum;
    private int withdrawSum;
    private Account emptyAcc;
    private ArrayList<Array> transactionHistory;
    private String createAccount;
    private String deleteAccount;

    public int getInsertSum()
    {
        return insertSum;
    }

    public void setInsertSum(int insertSum)
    {
        this.insertSum = insertSum;
    }

    public int getWithdrawSum()
    {
        return withdrawSum;
    }

    public void setWithdrawSum(int withdrawSum)
    {
        this.withdrawSum = withdrawSum;
    }

    public Account getEmptyAcc()
    {
        return emptyAcc;
    }

    public void setEmptyAcc(Account emptyAcc)
    {
        this.emptyAcc = emptyAcc;
    }

    public ArrayList getTransactionHistory()
    {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Array> transactionHistory)
    {
        this.transactionHistory = transactionHistory;
    }

    public String getCreateAccount()
    {
        return createAccount;
    }

    public void setCreateAccount(String createAccount)
    {
        this.createAccount = createAccount;
    }

    public String getDeleteAccount()
    {
        return deleteAccount;
    }

    public void setDeleteAccount(String deleteAccount)
    {
        this.deleteAccount = deleteAccount;
    }

    public AccountManagerImpl(int insertSum, int withdrawSum, Account emptyAcc, ArrayList<Array> transactionHistory, String createAccount, String deleteAccount)
    {
        this.insertSum = insertSum;
        this.withdrawSum = withdrawSum;
        this.emptyAcc = emptyAcc;
        this.transactionHistory = transactionHistory;
        this.createAccount = createAccount;
        this.deleteAccount = deleteAccount;
    }
}
