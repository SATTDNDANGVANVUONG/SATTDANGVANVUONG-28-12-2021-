package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase01 extends TestBase {
    @Test
    public void TCO1 (){
        System.out.println("TCO1- User can log into Railway with valid username and password");
        HomePage homePage = new HomePage();
        LoginPage loginPage= new LoginPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Login tab");
        homePage.gotoLoginPage();

        System.out.println("3. Enter valid Email and Password");
        System.out.println("4. Click on Login button");

        String actualMsg=loginPage.login(Constant.USERNAME,Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg="Welcome"+" "+Constant.USERNAME;
        Assert.assertEquals(actualMsg ,expectedMsg, "Welcome message is not displayed as expexed");
    }



}
