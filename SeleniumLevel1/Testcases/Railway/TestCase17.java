package Railway;

import Constant.Constant;
import Constant.DataUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestCase17 extends TestBase{
    @Test(dataProviderClass = DataUtils.class,dataProvider = "dataProvider2")
    public void TC17(HashMap<String,String> hashMap)  {
        System.out.println("TC17- User can't book more than 10 tickets");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" 2. Login with a valid account");
        homePage.gotoLoginPage();

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        System.out.println("3. Click on Book ticket  tab");
        homePage.gotoBookTicketPage();

        System.out.println("4. Book 10 tickets");
        bookTicketPage.BookTicket(hashMap.get("date"),hashMap.get("departStation"),hashMap.get("arriveStation"),hashMap.get("seatType"),hashMap.get("amount"));
        System.out.println("5. Click on the Book ticket again");
        homePage.gotoBookTicketPage();
        System.out.println("6. Book one more ticket");
        bookTicketPage.BookTicket(hashMap.get("date"),hashMap.get("departStation"),hashMap.get("arriveStation"),hashMap.get("seatType"),"1");

        String actualErrorMsg = bookTicketPage.getFormErrorMessage();
        String actualTicketAmountErrorMsg = bookTicketPage.getTicketAmountErrorMessage();
        String expectedErrorMsg = "There're errors in the form. Please correct the errors and try again.";
        String expectedTicketAmountErrorMsg = "You have booked 10 tickets. You can book no more.";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
        Assert.assertEquals(actualTicketAmountErrorMsg, expectedTicketAmountErrorMsg);


    }
}
