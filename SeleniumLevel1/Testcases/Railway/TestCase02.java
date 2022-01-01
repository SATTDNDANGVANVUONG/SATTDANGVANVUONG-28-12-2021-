package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 extends TestBase {
    @Test
    public void TCO2() {
        System.out.println("TCO2-User can't login with blank Username textbox");
        HomePage homePage = new HomePage();
        LoginPage loginPage=new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Login tab");
        homePage.gotoLoginPage();

        System.out.println("3. User doesn't type any words into Username  textbox but enter valid information into Password textbox");
        System.out.println("4. Click on Login  button");

        String actualMsg = loginPage.login("", Constant.PASSWORD).getErrorMessage();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
        Assert.assertEquals(actualMsg, expectedMsg, "User can log in with blank Username");
    }

}
