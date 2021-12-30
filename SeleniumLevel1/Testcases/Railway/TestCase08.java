package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase08 extends TestBase {
    @Test
    public void TCO8 (){
        System.out.println("TCO8-User can't login with an account hasn't been activated");
        HomePage homePage = new HomePage();
        LoginPage loginPage= new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Login tab");
        homePage.gotoLoginPage();

        System.out.println("3. Enter username and password of account hasn't been activated.");
        System.out.println("4. Click on Login  button");
        String actualMsg=loginPage.login(Constant.UnactivatedUsername,Constant.PASSWORD).getErrorMessage();
        String expectedMsg="Invalid username or password. Please try again.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can login with an account hasn't been activated");
}
}
