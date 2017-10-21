/**
 * Created by Ovidiu on 10/14/2017.
 */
public class UserManagerImpl implements UserManager {
    private String linkAccountToCard;

    public String getLinkAccountToCard()
    {
        return linkAccountToCard;
    }

    public void setLinkAccountToCard(String linkAccountToCard)
    {
        this.linkAccountToCard = linkAccountToCard;
    }

    public UserManagerImpl(String linkAccountToCard)
    {
        this.linkAccountToCard = linkAccountToCard;
    }
}
