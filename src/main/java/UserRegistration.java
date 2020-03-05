import java.util.regex.Pattern;

public class UserRegistration
{
    public String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    public String lastNamePattern="^[A-Z][a-zA-Z]{2,}$";

    //MATCHES PATTERN FOR FIRST NAME
    public boolean validateFirstName(String firstName)
    {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //MATCHES PATTERN FOR LAST NAME
    public boolean validateLastName(String lastName)
    {
        return (Pattern.matches(lastNamePattern,lastName));
    }

    public static void main(String[] args)
    {
        System.out.println("********** WELCOME TO USER REGISTRATION SYSTEM **********");
    }
}
