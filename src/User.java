/**
 * Created by Ovidiu on 10/14/2017.
 */
public class User {
    private String name;
    private int age;
    private String CNP;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getCNP()
    {
        return CNP;
    }

    public void setCNP(String CNP)
    {
        this.CNP = CNP;
    }

    public User(String name, int age, String CNP)
    {
        this.name = name;
        this.age = age;
        this.CNP = CNP;
    }
}
