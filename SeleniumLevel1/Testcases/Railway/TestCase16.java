package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import  Constant.NewAccount;
import Constant.Utilities;
import Constant.DataUtils;


public class TestCase16 extends TestBase{
    @Test(dataProviderClass = DataUtils.class,dataProvider = "dataProvider1")
    public void TC16( String depart , String arrive, String seatType,String amount)  {
        System.out.println("TC16- User can cancel a ticket");
        HomePage homePage = new HomePage();
        NewAccount  newAccount= new NewAccount();
        BookTicketPage bookTicketPage = new BookTicketPage();
        MyTicketPage myTicketPage= new MyTicketPage();

        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" 2. Login with a valid account(new account)");
        homePage.gotoResgisterPage();
        newAccount.LoginWithNewAccount(Utilities.generateRandomEmail(),Constant.PASSWORD,Constant.PASSWORD, Utilities.generateRandomPasspost(8));

        System.out.println("3. Book a ticket");
        homePage.gotoBookTicketPage();
        bookTicketPage.BookTicket( depart, arrive, seatType, amount);
        System.out.println("4.Click on My Ticket Tab");
        homePage.gotoMyticketPage();

        System.out.println("5. Click on Cancel button of ticket which user want to cancel.");
        myTicketPage.cancelTicket("Nha Trang","Sài Gòn");
        myTicketPage.AcceptCancelAlert();

        Assert.assertFalse(myTicketPage.isCancelTicketPresent());


    }
}
