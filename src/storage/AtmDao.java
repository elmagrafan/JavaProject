package storage;

import java.util.List;

/**
 * Created by Ovidiu on 10/21/2017.
 *
 * Used as interface for data storage
 * Strategy pattern (look up the docs)
 */
public interface AtmDao {

    boolean saveNewUser(UserStorageModel user);
    boolean removeUser(UserStorageModel user);
    UserStorageModel getUserByCnp(String cnp);
    List<UserStorageModel> getAllUsers();

    // TODO: do like for users
    boolean addNewAccount(AccountStorageModel account);
    boolean removeAccount(AccountStorageModel account);

}
