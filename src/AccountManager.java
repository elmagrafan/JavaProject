import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public interface AccountManager {

     boolean addNewAccount(Account newAccountToAdd);
     boolean removeAccount(Account accountToRemove);
     boolean addTransactionForAccount(Account accountToAddTransactionFor, Transaction newTransaction);

}
