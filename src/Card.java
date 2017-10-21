/**
 * Created by Ovidiu on 10/14/2017.
 */
public class Card {
    private Account account;
    private int PIN;

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public int getPIN()
    {
        return PIN;
    }

    public void setPIN(int PIN)
    {
        this.PIN = PIN;
    }

    public Card(Account account, int PIN, String changePIN)
    {
        this.account = account;
        this.PIN = PIN;
    }

    public boolean changePin(int newPin)
    {
        // TODO: validate PIN

        return false;
    }
}
