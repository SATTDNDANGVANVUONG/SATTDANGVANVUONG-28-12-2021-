package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Utilities;

public class TestCase03 extends TestBase {
    @Test
    public void TCO3 (){
        System.out.println("TCO3-User can't login with invalid password");
        HomePage homePage = new HomePage();
        LoginPage loginPage= new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Login tab");
        homePage.gotoLoginPage();

        System.out.println("3. Enter valid Email and invalid Password");
        System.out.println("4. Click on Login  button");

        String actualMsg=loginPage.login(Constant.USERNAME,Utilities.generateRandomPassword(9)).getErrorMessage();
        String expectedMsg="Invalid username or password. Please try again.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can log in with invalid password");
    }
}
