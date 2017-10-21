package storage;

/**
 * Created by Ovidiu on 10/21/2017.
 */
public class Utils {

    public static boolean hasOnlyNumbersInIt(String someString)
    {
        for (char c : someString.toCharArray())
        {
            // if current character IS NOT a number, then return false
            if (!(c >= '0' && c <= '9'))
            {
                return false;
            }
        }

        return true;
    }

}
