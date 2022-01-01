package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Utilities;

public class TestCase05 extends TestBase {
    @Test
    public void TCO5() {
        System.out.println("TCO5-System show message when user enters wrong password several times");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Login tab");
        homePage.gotoLoginPage();

        System.out.println("3. Enter valid information into Username textbox except Password textbox.");
        System.out.println("4. Click on Login button");
        System.out.println("5. Repeat step 3 three more times.");
        loginPage.loginMultipleTime(3, Constant.USERNAME,Utilities.generateRandomPassword(9)) ;
        String actualMsg = loginPage.getErrorMessage();

        String expectedMsg = "You have used 4 out of 5 login attempts";
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expexed");
    }
}
