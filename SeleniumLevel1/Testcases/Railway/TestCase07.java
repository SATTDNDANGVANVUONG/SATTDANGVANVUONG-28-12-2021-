package Railway;

import Constant.Constant;
import Constant.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase07 extends TestBase {
    @Test
    public void TCO7() {

        System.out.println("TCO7-User can create new account");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Register tab");
        homePage.gotoResgisterPage();

        System.out.println("3. Enter valid information into all fields");
        System.out.println("4. Click on Register button");
        registerPage.register(
                Utilities.generateRandomEmail(), Constant.PASSWORD, Constant.PASSWORD, Utilities.generateRandomPasspost(9));

        String actualMsg = registerPage.getRegisterMessage();
        String expectedMsg = "You're here";
        Assert.assertEquals(actualMsg, expectedMsg, "User can not create new account ");
    }
}
