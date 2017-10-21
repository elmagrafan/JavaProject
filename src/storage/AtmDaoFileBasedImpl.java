package storage;

import java.util.List;

/**
 * Created by Ovidiu on 10/21/2017.
 * File based storage (save to text files)
 */
public class AtmDaoFileBasedImpl implements AtmDao {
    @Override
    public boolean saveNewUser(UserStorageModel user) {
        return false;
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
        return null;
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
