import storage.AtmDao;
import storage.AtmDaoFactory;
import storage.StorageType;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public class AccountManagerImpl implements AccountManager {

    @Override
    public boolean addNewAccount(Account newAccount)
    {
        if (newAccount == null)
        {
            return false;
        }

        try {

            // TODO: add an account somewhere

            return true;
        }
        catch (Exception e)
        {

            return false;
        }
    }

    @Override
    public boolean removeAccount(Account existingAccount) {

        if (existingAccount == null)
        {
            return false;
        }

        try {

            // TODO: remove an account somewhere


            return true;
        }
        catch (Exception e)
        {

            return false;
        }
    }

    @Override
    public boolean addTransactionForAccount(Account accountToAddTransactionFor, Transaction newTransaction) {
        return false;
    }
}
