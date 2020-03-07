import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    UserRegistration validate=new UserRegistration();
    String [] validEmail={"abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"};

    String [] invalidEmail={"abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"};

    //TEST CASE FOR VALID FIRST NAME WITH FIRST LETTER CAPITAL
    @Test
    public void givenFirstName_WhenValidUpperCase_ThenReturnTrue()
    {
        String firstName="Vaishnavi";
        boolean result=validate.validateFirstName(firstName);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LOWER CASE
    @Test
    public void givenFirstName_WhenInvalidUpperCase_ThenReturnFalse()
    {
        String firstName="vaishnavi";
        boolean result = validate.validateFirstName(firstName);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID FIRST NAME WITH MINIMUM THREE LETTERS
    @Test
    public void givenFirstName_WhenValidGreaterThanThree_ThenReturnTrue()
    {
        String firstName="Vaish";
        boolean result = validate.validateFirstName(firstName);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenFirstName_WhenInvalidGreaterThanThree_ThenReturnFalse()
    {
        String firstName="Va";
        boolean result = validate.validateFirstName(firstName);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH FIRST LETTER CAPTIAL
    @Test
    public void givenLastName_WhenValidUpperCase_ThenReturnTrue()
    {
        String lastName="Pardeshi";
        boolean result=validate.validateLastName(lastName);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID LAST NAME WITH FIRST LETTER CAPITAL
    @Test
    public void givenLastName_WhenInvalidUpperCase_ThenReturnFalse()
    {
        String lastName="pardeshi";
        boolean result=validate.validateLastName(lastName);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH MINIMUM THREE CHARACTERS
    @Test
    public void givenLastName_WhenValidGreaterThanThree_ThenReturnTrue()
    {
        String lastName="Pardeshi";
        boolean result=validate.validateLastName(lastName);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID LAST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenLastName_WhenInvalidGreaterThanThree_ThenReturnFalse()
    {
        String lastName="xy";
        boolean result=validate.validateLastName(lastName);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID EMAIL ADDRESS
    @Test
    public void givenEmail_WhenValid_ThenReturnTrue()
    {
        for (int index=0;index<validEmail.length;index++)
        {
            boolean result=validate.validateEmail(validEmail[index]);
            System.out.println(validEmail[index]+" : "+result);
            Assert.assertTrue(result);
        }
    }

    //TEST CASE FOR INVALID EMAIL ADDRESS
    @Test
    public void givenEmail_WhenInvalid_ThenReturnFalse()
    {
        for (int index=0;index<invalidEmail.length;index++)
        {
            boolean result=validate.validateEmail(invalidEmail[index]);
            System.out.println(invalidEmail[index]+" : "+result);
            Assert.assertFalse(result);
        }
    }

    //TEST CASE FOR VALID MOBILE NUMBER
    @Test
    public void givenMobileNumber_WhenValid_ThenReturnTrue()
    {
        String mobileNumber="91 7083503989";
        boolean result=validate.validateMobileNumber(mobileNumber);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID MOBILE NUMBER
    @Test
    public void givenMobileNumber_WhenInvalid_ThenReturnFalse()
    {
        String mobileNumber="917083503989";
        boolean result=validate.validateMobileNumber(mobileNumber);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR MINIMUM 8 CHARACTERS
    @Test
    public void givenPassword_WhenValidMinimum8Characters_ThenReturnTrue()
    {
        String password="@Password1";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR LESS THAN 8 CHARACTERS
    @Test
    public void givenPassword_WhenInvalidMinimum8Characters_ThenReturnFalse()
    {
        String password="@Pas1";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPassword_WhenValidAtLeast1UpperCase_ThenReturnTrue()
    {
        String password="Password@123";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPassword_WhenInvalidAtLeast1UpperCase_ThenReturnFalse()
    {
        String password="password@123";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC NUMBER
    @Test
    public void givenPassword_WhenValidAtLeastOneNumeric_ThenReturnTrue()
    {
        String password="Password123@";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR AT LEAST ONE NUMERIC NUMBER
    @Test
    public void givenPassword_WhenInvalidAtLeastOneNumeric_ThenReturnFalse()
    {
        String password="Password@";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR EXACTLY ONE SPECIAL CHARACTER
    @Test
    public void givenPassword_WhenValidExactlyOneSpecialCharacter_ThenReturnTrue()
    {
        String password="Password@123";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR NO SPECIAL CHARACTER
    @Test
    public void givenPassword_WhenInvalidExactlyOneSpecialCharacter_ThenReturnFalse()
    {
        String password="Password123";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }
}
