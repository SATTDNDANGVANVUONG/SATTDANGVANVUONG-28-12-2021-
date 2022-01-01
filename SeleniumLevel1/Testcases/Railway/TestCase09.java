package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Utilities;

public class TestCase09 extends TestBase {
    @Test
    public void TC09() {
        System.out.println("TC09- User can't change password when New Password and  Confirm Password  are different.");
        HomePage homePage = new HomePage();
        LoginPage loginPage= new LoginPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with a valid account ");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        System.out.println("3. Click on Change Password tab");
        homePage.gotoChangePasswordPage();

        System.out.println("4. Enter valid information into Current Password  textbox but enter New Password and Confirm Password different");
        changePasswordPage.changepassword(Constant.PASSWORD,Utilities.generateRandomPassword(7) ,Utilities.generateRandomPassword(8));

        String actualMsg = changePasswordPage.getErrorConfirmMessage();
        String expectedMsg = "The password confirmation does not match the new password.";
        Assert.assertEquals(actualMsg, expectedMsg, "User can't change password when New Password and  Confirm Password  are different.");
    }
}
