import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public interface AccountManager {

     int getInsertSum();
     void setInsertSum(int insertSum);
     int getWithdrawSum();
     void setWithdrawSum(int withdrawSum);
     Account getEmptyAcc();
     void setEmptyAcc(Account emptyAcc);
     ArrayList getTransactionHistory();
     void setTransactionHistory(ArrayList<Array> transactionHistory);
     String getCreateAccount();
     void setCreateAccount(String createAccount);
     String getDeleteAccount();
     void setDeleteAccount(String deleteAccount);

}
