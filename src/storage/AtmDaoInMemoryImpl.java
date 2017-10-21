package storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ovidiu on 10/21/2017.
 *
 * Data access object implementation
 * Does saving and loading in memory only (using local process memory)
 *
 * NEEDS TO BE A SINGLETON
 */
public class AtmDaoInMemoryImpl implements AtmDao {

    private List<UserStorageModel> users;
    private List<AccountStorageModel> accounts;

    private static AtmDaoInMemoryImpl instanceOfThisClass;

    private AtmDaoInMemoryImpl() {
        this.users = new ArrayList<UserStorageModel>();
        this.accounts = new ArrayList<AccountStorageModel>();
    }

    public static AtmDaoInMemoryImpl getInstanceOfThisClass()
    {
        if (AtmDaoInMemoryImpl.instanceOfThisClass == null)
        {
            instanceOfThisClass = new AtmDaoInMemoryImpl();
        }

        return AtmDaoInMemoryImpl.instanceOfThisClass;
    }

    @Override
    public boolean saveNewUser(UserStorageModel user) {

        if (user == null)
        {
            return false;
        }

        if (user.cnp == null || user.cnp.equals("") || !Utils.hasOnlyNumbersInIt(user.cnp))
        {
            return false;
        }

        if (user.age < 14)
        {
            return false;
        }

        // TODO: some other validation

        try {
            users.add(user);
            return true;
        }
        catch (Exception e)
        {
            // TODO: log some error in console
            return false;
        }
    }

    @Override
    public boolean removeUser(UserStorageModel user) {
        return false;
    }

    @Override
    public UserStorageModel getUserByCnp(String cnp) {
        return null;
    }

    @Override
    public List<UserStorageModel> getAllUsers() {
        return this.users;
    }

    @Override
    public boolean addNewAccount(AccountStorageModel account) {
        return false;
    }

    @Override
    public boolean removeAccount(AccountStorageModel account) {
        return false;
    }
}
