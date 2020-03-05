import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    //TEST CASE FOR VALID FIRST NAME WITH FIRST LETTER CAPITAL
    @Test
    public void givenFirstName_whenValidUpperCase_thenReturn()
    {
        String fname="Vaishnavi";
        UserRegistration validate=new UserRegistration();
        boolean result=validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LOWER CASE
    @Test
    public void givenFirstName_whenInvalidUpperCase_thenReturn()
    {
        String fname="vaishnavi";
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID FIRST NAME WITH MINIMUM THREE LETTERS
    @Test
    public void givenFirstName_whenValidGreaterThanThree_thenReturn()
    {
        String fname="Vaish";
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateFirstName(fname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID FIRST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenFirstName_whenInvalidGreaterThanThree_thenReturn()
    {
        String fname="Va";
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateFirstName(fname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH FIRST LETTER CAPTIAL
    @Test
    public void givenLastName_whenValidUpperCase_thenReturn()
    {
        String lname="Pardeshi";
        UserRegistration validate=new UserRegistration();
        boolean result=validate.validateLastName(lname);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID LAST NAME WITH FIRST LETTER CAPITAL
    @Test
    public void givenLastName_whenInvalidUpperCase_thenReturn()
    {
        String lname="pardeshi";
        UserRegistration validate=new UserRegistration();
        boolean result=validate.validateLastName(lname);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME WITH MINIMUM THREE CHARACTERS
    @Test
    public void givenLastName_whenValidGreaterThanThree_thenReturn()
    {
        String lname="Pardeshi";
        UserRegistration validate=new UserRegistration();
        boolean result=validate.validateLastName(lname);
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID LAST NAME WITH LESS THAN THREE CHARACTERS
    @Test
    public void givenLastName_whenInvalidGreaterThanThree_thenReturn()
    {
        String lname="xy";
        UserRegistration validate=new UserRegistration();
        boolean result=validate.validateLastName(lname);
        Assert.assertFalse(result);
    }
}
