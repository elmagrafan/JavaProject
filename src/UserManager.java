import java.util.List;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public interface UserManager {

    boolean addNewUser(User userToAdd);
    boolean removeUser(User userToRemove);
    List<User> getAllUsers();

}
