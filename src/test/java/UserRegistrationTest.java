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
    public void givenFirstName_whenValidUpperCase_thenReturn()
    {
        String fname="Vaishnavi";
        boolean result=validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LOWER CASE
    @Test
    public void givenFirstName_whenInvalidUpperCase_thenReturn()
    {
        String fname="vaishnavi";
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID FIRST NAME WITH MINIMUM THREE LETTERS
    @Test
    public void givenFirstName_whenValidGreaterThanThree_thenReturn()
    {
        String fname="Vaish";
        boolean result = validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenFirstName_whenInvalidGreaterThanThree_thenReturn()
    {
        String fname="Va";
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH FIRST LETTER CAPTIAL
    @Test
    public void givenLastName_whenValidUpperCase_thenReturn()
    {
        String lname="Pardeshi";
        boolean result=validate.validateLastName(lname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID LAST NAME WITH FIRST LETTER CAPITAL
    @Test
    public void givenLastName_whenInvalidUpperCase_thenReturn()
    {
        String lname="pardeshi";
        boolean result=validate.validateLastName(lname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH MINIMUM THREE CHARACTERS
    @Test
    public void givenLastName_whenValidGreaterThanThree_thenReturn()
    {
        String lname="Pardeshi";
        boolean result=validate.validateLastName(lname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID LAST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenLastName_whenInvalidGreaterThanThree_thenReturn()
    {
        String lname="xy";
        boolean result=validate.validateLastName(lname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID EMAIL ADDRESS
    @Test
    public void givenEmail_whenValid_thenReturn()
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
    public void givenEmail_whenInvalid_thenReturn()
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
    public void givenMobileNumber_whenValid_thenReturn()
    {
        String mobileNumber="91 7083503989";
        boolean result=validate.validateMobileNumber(mobileNumber);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID MOBILE NUMBER
    @Test
    public void givenMobileNumber_whenInvalid_thenReturn()
    {
        String mobileNumber="917083503989";
        boolean result=validate.validateMobileNumber(mobileNumber);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR MINIMUM 8 CHARACTERS
    @Test
    public void givenPassword_whenValidMinimum8Characters_thenReturn()
    {
        String password="Password1";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR LESS THAN 8 CHARACTERS
    @Test
    public void givenPassword_whenInvalidMinimum8Characters_thenReturn()
    {
        String password="Pas1";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPassword_whenValidAtLeast1UpperCase_thenReturn()
    {
        String password="Password123";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPassword_whenInvalidAtLeast1UpperCase_thenReturn()
    {
        String password="password123";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC NUMBER
    @Test
    public void givenPassword_whenValidAtLeastOneNumeric_thenReturn()
    {
        String password="Password123";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }
}
