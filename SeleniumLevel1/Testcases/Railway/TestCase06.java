package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase06 extends TestBase {
    @Test
    public void TCO6() {
        System.out.println("TC06-User is redirected to Home page after logging out");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with valid Email and Password");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        System.out.println("3. Click on Contact tab");
        homePage.gotoContactPage();

        System.out.println("4. Click on Log out tab");
        homePage.gotoLogoutPage();

        String actualMsg = homePage.getHomePageMessage();
        String expectedMsg = "Welcome to Safe Railway";
        Assert.assertEquals(actualMsg, expectedMsg, "User is not redirected to Home page after logging out");
    }
}
