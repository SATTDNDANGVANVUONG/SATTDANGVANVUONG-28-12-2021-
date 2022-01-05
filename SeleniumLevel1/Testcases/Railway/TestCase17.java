package Railway;

import Constant.Constant;
import Constant.DataUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import  Constant.NewAccount;
import Constant.Utilities;

public class TestCase17 extends TestBase{
    @Test(dataProviderClass = DataUtils.class,dataProvider = "dataProvider2")
    public void TC17( String depart , String arrive, String seatType,String amount1,String amount2)  {
        System.out.println("TC17- User can't book more than 10 tickets");
        HomePage homePage = new HomePage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        NewAccount  newAccount= new NewAccount();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" 2. Login with a valid account(new account)");
        homePage.gotoResgisterPage();
        newAccount.LoginWithNewAccount(Utilities.generateRandomEmail(),Constant.PASSWORD,Constant.PASSWORD, Utilities.generateRandomPasspost(8));
        System.out.println("3. Click on Book ticket  tab");
        homePage.gotoBookTicketPage();

        System.out.println("4. Book 10 tickets");
        bookTicketPage.BookTicket( depart, arrive, seatType, amount1);
        System.out.println("5. Click on the Book ticket again");
        homePage.gotoBookTicketPage();
        System.out.println("6. Book one more ticket");
        bookTicketPage.BookTicket( depart, arrive, seatType, amount2);

        String actualErrorMsg = bookTicketPage.getFormErrorMessage();
        String actualTicketAmountErrorMsg = bookTicketPage.getTicketAmountErrorMessage();
        String expectedErrorMsg = "There're errors in the form. Please correct the errors and try again.";
        String expectedTicketAmountErrorMsg = "You have booked 10 tickets. You can book no more.";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
        Assert.assertEquals(actualTicketAmountErrorMsg, expectedTicketAmountErrorMsg);


    }
}
