import storage.AtmDao;
import storage.AtmDaoFactory;
import storage.StorageType;
import storage.UserStorageModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public class UserManagerImpl implements UserManager {

    private AtmDao inMemoryDao = AtmDaoFactory.getStorageModel(StorageType.IN_MEMORY_STORAGE);

    public boolean addNewUser(User userToAdd) {

        if (userToAdd == null) {
            return false;
        }

        try {
            UserStorageModel userStorageModel = new UserStorageModel();
            userStorageModel.name = userToAdd.getName();
            userStorageModel.age = userToAdd.getAge();
            userStorageModel.cnp = userToAdd.getCNP();

            return inMemoryDao.saveNewUser(userStorageModel);
        }
        catch (Exception e)
        {

            return false;
        }
    }

    public boolean removeUser(User userToRemove) {
        if (userToRemove == null) {
            return false;
        }

        try {

            // TODO: remove existing user from somewhere

            return true;
        }
        catch (Exception e)
        {

            return false;
        }
    }

    @Override
    public List<User> getAllUsers() {
        List<UserStorageModel> userStorageModels = inMemoryDao.getAllUsers();
        List<User> users = new ArrayList<User>();

        for (UserStorageModel userStorageModel : userStorageModels)
        {
            users.add(new User(userStorageModel.name, userStorageModel.age, userStorageModel.cnp));
        }

        return users;
    }

}
