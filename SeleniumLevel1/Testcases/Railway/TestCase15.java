package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase15 extends TestBase{
    @Test
    public void TC15 (){
        System.out.println("TC15-Ticket price page displays with ticket details after clicking on check price link in Train timetable page");
        HomePage homePage = new HomePage();
        LoginPage loginPage= new LoginPage();
        TimeTablePage timeTablePage= new TimeTablePage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with a valid account");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on Timetable  tab");
        homePage.gotoTimetablePage();
        Constant.WEBDRIVER.navigate().refresh();

        System.out.println("4. Click on check price link of the route from Đà Nẵng to Sài Gòn ");
        timeTablePage.CheckPriceDaNangtoSaiGon();

        String actualTicketInfor=timeTablePage.getTicKetInfor();
        String expectedTicketInfor="HS:90000,SS:115000,SSC:140000,HB:190000,SB:240000,SBC:290000,";
        String actualTicketMessage=timeTablePage.getTicketMessage();
        String expectedTicketMessage="Ticket price from Đà Nẵng to Sài Gòn";
        Assert.assertEquals(actualTicketMessage,expectedTicketMessage);
        Assert.assertEquals(actualTicketInfor,expectedTicketInfor);

    }

}
