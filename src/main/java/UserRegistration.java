import java.util.regex.Pattern;

public class UserRegistration
{
    public String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    public String lastNamePattern="^[A-Z][a-zA-Z]{2,}$";
    public String emailPattern="^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$";
    public String mobileNumberPattern="^[0-9]{2}[ ][0-9]{10}$"
            ;
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

    //MATCHES PATTERN FOR EMAIL ADDRESS
    public boolean validateEmail(String email)
    {
        return (Pattern.matches(emailPattern,email));
    }

    //MATCHES PATTERN FOR MOBILE NUMBER
    public boolean validateMobileNumber(String mobileNumber)
    {
        return (Pattern.matches(mobileNumberPattern,mobileNumber));
    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        System.out.println("********** WELCOME TO USER REGISTRATION SYSTEM **********");
    }
}
