import javax.lang.model.type.NullType;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // ====
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name: ");
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ====
        System.out.print("Please insert the age for your user: ");
        String consoleAge = null;
        try {
            consoleAge = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int age = Integer.parseInt(consoleAge);

        // ====
        System.out.print("Please insert the CNP for your user: ");
        String CNP = null;
        try {
            CNP = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = new User(name, age, CNP);

        // ====
        System.out.print("Please insert the balance for your account: ");
        String consoleBalance = null;
        try {
            consoleBalance = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int balance = Integer.parseInt(consoleBalance);

        // ====
        System.out.print("Please insert the history for your account: ");
        String history = null;
        try {
            history = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ====
        System.out.print("Please insert the name of the account manager ");
        String accountManagerName = null;
        try {
            accountManagerName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Account account = new Account(user, balance, history, accountManagerName);

        System.out.print("Please insert a certain sum into your account: ");
        String consoleSum = null;
        try {
            consoleSum = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int insertSum = Integer.parseInt(consoleSum);

        System.out.print("\nDo you want to withdraw something from your account? Press Y or N ");
        String option = null;
        try {
            option = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int withdrawSum = 0;
        if (option.equals("N"))
            out.println("Ok, to next step");
        else if (option.equals("Y")) {
            out.println("\nPlease insert a certain sum to withdraw from your account ");

             consoleSum = null;
            try {
                consoleSum = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            withdrawSum = Integer.parseInt(consoleSum);
        }
        out.println("\nDo you want your account to be emptied? Press Y or N ");

        option = null;
        try {
            option = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Array> arrayAccountManagerTransactionHistory = null;
        if (option.equals("N"))
            out.println("\nOk, now to the next step");
        else if (option.equals("Y")) {
            out.println("\nYour account will be emptied");
            user.setName("Not defined");
            user.setAge(0);
            user.setCNP("Not defined");
            account.setUser(user);
            account.setAccountManager("Not defined");
            account.setBalance(0);
            account.setHistory("Not defined");
            arrayAccountManagerTransactionHistory = new ArrayList<Array>(0);
            AccountManager accountManagerImpl = new AccountManagerImpl(0, 0, account, arrayAccountManagerTransactionHistory, "Not defined", "Not defined");
        }
        out.println("\nYour transaction history is:" + arrayAccountManagerTransactionHistory);

        out.println("\nPlease insert a name for your created account ");

        String createAccount = null;
        try {
            createAccount = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.println("Do you want your account to be deleted? Press Y or N");

        option = null;
        try {
            option = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String deleteAccount = "Account";
        if (option.equals("N"))
            out.println("Ok, now to next step!");
        else if (option.equals("Y")) {
            out.println("\nYour account will be deleted! Please enter 'delete'!");
            deleteAccount = null;
            try {
                deleteAccount = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        AccountManager accountManager = new AccountManagerImpl(insertSum, withdrawSum, account, arrayAccountManagerTransactionHistory, createAccount, deleteAccount);
    }
    }


