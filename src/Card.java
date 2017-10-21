/**
 * Created by Ovidiu on 10/14/2017.
 */
public class Card {
    private int account;
    private int PIN;
    private String changePIN;

    public int getAccount()
    {
        return account;
    }

    public void setAccount(int account)
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

    public String getChangePIN()
    {
        return changePIN;
    }

    public void setChangePIN(String changePIN)
    {
        this.changePIN = changePIN;
    }

    public Card(int account, int PIN, String changePIN)
    {
        this.account = account;
        this.PIN = PIN;
        this.changePIN = changePIN;
    }
}
