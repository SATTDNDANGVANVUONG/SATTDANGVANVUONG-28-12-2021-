package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase04 extends TestBase {
    @Test
    public void TCO4() {
        System.out.println("TCO4-User is redirected to Book ticket page after logging in");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Book ticket  tab");
        homePage.gotoBookTicketPage();

        System.out.println("3. Login with valid account");

        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg = "Welcome" + " " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "User is not redirected to Book ticket page after logging in");
    }
}
