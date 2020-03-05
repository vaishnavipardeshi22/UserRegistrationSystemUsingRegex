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
    public void givenEmail_WhenValid_ThenReturn()
    {
        for (int index=0;index<validEmail.length;index++)
        {
            boolean result = validate.validateEmail(validEmail[index]);
            System.out.println(validEmail[index]+" : "+result);
            Assert.assertTrue(result);
        }
    }
    //TEST CASE FOR INVALID EMAIL ID
    @Test
    public void givenEmail_WhenInvalid_ThenReturn()
    {
        for (int index=0;index<invalidEmail.length;index++)
        {
            boolean result = validate.validateEmail(invalidEmail[index]);
            System.out.println(invalidEmail[index]+" : "+result);
            Assert.assertFalse(result);
        }
    }
}
