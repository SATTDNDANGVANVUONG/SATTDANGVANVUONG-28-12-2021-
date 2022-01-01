package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Utilities;

public class TestCase10 extends TestBase {
    @Test
    public void TC10 (){

        System.out.println("TC10-User can't create account with an already In-UseEmail");
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Click on Register tab");
        homePage.gotoResgisterPage();

        System.out.println("3. Enter information of the created account in Pre-condition");
        System.out.println("4. Click on Register button");
        registerPage.register(Constant.InuseEmail,Constant.PASSWORD,Constant.PASSWORD,Utilities.generateRandomPasspost(9));

        String actualMsg=registerPage.getErrorEmailMessage();
        String expectedMsg="This email address is already in use.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can crete account with an already in-use email");
    }
}
