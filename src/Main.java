import javax.lang.model.type.NullType;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        UserManager userManager = new UserManagerImpl();

        for (int i = 0; i < 3; i++)
        {
            insertSomeUser(reader, userManager);
        }

        List<User> users = userManager.getAllUsers();
        System.out.println("");
        System.out.println("All users:");
        System.out.println("");

        for (User user : users)
        {
            System.out.println(user.toString());
        }
    }

    private static void insertSomeUser(BufferedReader reader, UserManager userManager)
    {
        System.out.println("Please enter user name: ");
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Please insert the age for your user: ");
        String consoleAge = null;
        try {
            consoleAge = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int age = Integer.parseInt(consoleAge);

        System.out.print("Please insert the CNP for your user: ");
        String CNP = null;
        try {
            CNP = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = new User(name, age, CNP);
        boolean saveSuccessful = userManager.addNewUser(user);

        if (saveSuccessful) {
            System.out.print("Successfully saved user");
        }
        else {
            System.out.print("User saving failed somewhere.");
        }
    }

}


