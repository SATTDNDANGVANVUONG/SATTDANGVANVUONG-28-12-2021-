package Railway;

import Constant.Constant;
import Constant.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase11 extends TestBase {
    @Test
    public void TC11 (){

        System.out.println("TC11-User can't create account while password and PID fields are empty");
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Register tab");
        homePage.gotoResgisterPage();

        System.out.println("3. Enter valid email address and leave other fields empty");
        System.out.println("4. Click on Register button");
        registerPage.register(Utilities.generateRandomEmail(), Constant.EMPTY,Constant.EMPTY,Constant.EMPTY);

        String actualFormMsg=registerPage.getErrorEmailMessage();
        String actualErrorPasswordMsg=registerPage.getErrorPassWordMessage();
        String actualErrorPassportMsg=registerPage.getErrorPassportMessage();
        String expectedFormMsg="There're errors in the form. Please correct the errors and try again.";
        String expectedErrorPasswordMsg="Invalid password length";
        String expectedErrorPassportMsg="Invalid ID length";
        Assert.assertEquals(actualFormMsg ,expectedFormMsg);
        Assert.assertEquals(actualErrorPasswordMsg ,expectedErrorPasswordMsg);
        Assert.assertEquals(expectedErrorPassportMsg ,actualErrorPassportMsg);
    }
}
