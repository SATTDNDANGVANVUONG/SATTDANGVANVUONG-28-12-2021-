package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase16 extends TestBase{
    @Test
    public void TC16()  {
        System.out.println("TC16- User can cancel a ticket");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        MyTicketPage myTicketPage= new MyTicketPage();

        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" 2. Login with a valid account");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        System.out.println("3. Book a ticket");
        homePage.gotoBookTicketPage();
        bookTicketPage.BookTicket("1/10/2022","Nha Trang","Sài Gòn","Soft seat with air conditioner","1");
        System.out.println("4.Click on My Ticket Tab");
        homePage.gotoMyticketPage();

        System.out.println("5. Click on Cancel button of ticket which user want to cancel.");
        myTicketPage.cancelTicket();
        myTicketPage.AcceptCancelAlert();

        Assert.assertFalse(myTicketPage.isCancelTicketPresent());


    }
}
