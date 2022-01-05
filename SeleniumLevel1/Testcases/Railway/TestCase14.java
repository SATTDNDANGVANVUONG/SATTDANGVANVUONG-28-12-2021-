package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.DataUtils;
import Constant.NewAccount;
import Constant.Utilities;



public class TestCase14 extends TestBase{
    @Test(dataProviderClass = DataUtils.class,dataProvider = "dataProvider")
    public void TC14(  String depart , String arrive, String seatType,String amount)  {

        System.out.println("TC14- User can book many tickets at a time");
        HomePage homePage = new HomePage();
        NewAccount newAccount= new NewAccount();
        BookTicketPage bookTicketPage = new BookTicketPage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println(" 2. Login with a valid account(new account)");
        homePage.gotoResgisterPage();
        newAccount.LoginWithNewAccount(Utilities.generateRandomEmail(),Constant.PASSWORD,Constant.PASSWORD,Utilities.generateRandomPasspost(8));
        System.out.println("3. Click on Book ticket  tab");
        homePage.gotoBookTicketPage();

        System.out.println("4. Select a Depart date from the list");
        System.out.println("5. Select Nha Trang for Depart from  and Sài Gòn  for Arrive at .");
        System.out.println("6. Select Soft seat with air conditioner or Seat type");
        System.out.println("7. Select 5 for Ticket amount");
        bookTicketPage.BookTicket( depart, arrive, seatType, amount);
        String actualMsg = bookTicketPage.getBookSuccessMessage();
        String actualDepartStationInfor = bookTicketPage.getDepartStationInfor();
        String actualArriveStationInfor = bookTicketPage.getArriveStationInfor();
        String actualSeatTypeInfor = bookTicketPage.getSeatTypeInfor();
        String actualTicketAmountInfor = bookTicketPage.getTicketAmountInfor();
        String expectedDepartStationInfor = "Nha Trang";
        String expectedArriveStationInfor = "Sài Gòn";
        String expectedSeatTypeInfor = "Soft seat with air conditioner";
        String expectedTicketAmountInfor = "5";
        String expectedMsg = "Ticket Booked Successfully!";
        Assert.assertEquals(actualMsg, expectedMsg);
        Assert.assertEquals(actualDepartStationInfor, expectedDepartStationInfor);
        Assert.assertEquals(actualArriveStationInfor, expectedArriveStationInfor);
        Assert.assertEquals(actualSeatTypeInfor, expectedSeatTypeInfor);
        Assert.assertEquals(actualTicketAmountInfor, expectedTicketAmountInfor);

    }
}
