import java.util.Date;

/**
 * Created by Ovidiu on 10/14/2017.
 */
public class Transaction {
    private int sum;
    private Date date;

    public int getSum()
    {
        return sum;
    }

    public void setSum(int sum)
    {
        this.sum = sum;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Transaction(int sum, Date date)
    {
        this.sum = sum;
        this.date = date;
    }
}
