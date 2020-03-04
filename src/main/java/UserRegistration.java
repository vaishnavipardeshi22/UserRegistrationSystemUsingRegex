import java.util.regex.Pattern;

public class UserRegistration
{
    public String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    public boolean validateFirstName(String firstName)
    {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    public static void main(String[] args)
    {
        System.out.println("********** WELCOME TO USER REGISTRATION SYSTEM **********");
    }
}
