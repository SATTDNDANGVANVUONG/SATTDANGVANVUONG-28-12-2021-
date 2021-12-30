package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends GerneralPage {

    //Locators
    private final By ddlDepartDate = By.name("Date");
    private final By ddlDepartFrom = By.name("DepartStation");
    private final By ddlArriveAt = By.name("ArriveStation");
    private final By ddlSeatType = By.name("SeatType");
    private final By ddlTicketAmount = By.name("TicketAmount");
    private final By ddlBookSucessMessage = By.xpath("//div[@id='content']/h1");
    private final By dglDepartStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr/td[count(//th[normalize-space()='Depart Station'])]");
    private final By dglArriveStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr/td[count(//th[normalize-space()='Arrive Station'])+1]");
    private  final By dglSeatType= By.xpath("//table[@class='MyTable WideTable']/tbody/tr/td[count(//th[normalize-space()='Seat Type'])+2]");
    private final By dglTicketAmount=By.xpath("//table[@class='MyTable WideTable']/tbody/tr/td[count(//th[normalize-space()='Amount'])+6]");

    //Elements
    public WebElement getDdlDepartDate() {
        return Constant.WEBDRIVER.findElement(ddlDepartDate);
    }
    public WebElement getDdlDepartFrom() {
        return Constant.WEBDRIVER.findElement(ddlDepartFrom);
    }
    public WebElement getDdlArriveAt() {
        return Constant.WEBDRIVER.findElement(ddlArriveAt);
    }
    public WebElement getDdlSeatType() {
        return Constant.WEBDRIVER.findElement(ddlSeatType);
    }
    public WebElement getDdlBookSucessMessage() {
        return Constant.WEBDRIVER.findElement(ddlBookSucessMessage);
    }
    public WebElement getDdlTicketAmount() {
        return Constant.WEBDRIVER.findElement(ddlTicketAmount);
    }
    public WebElement getDglDepartStation(){return Constant.WEBDRIVER.findElement(dglDepartStation);}
    public WebElement getDglArriveStationBookedTicket(){return Constant.WEBDRIVER.findElement(dglArriveStation);}
    public WebElement getDglSeatTypeBookedTicket(){return Constant.WEBDRIVER.findElement( dglSeatType);}
    public WebElement getDglTicketAmountBookedTicket(){return Constant.WEBDRIVER.findElement( dglTicketAmount);}
    //Methods
    public String getBookSuccessMessage() {return this.getDdlBookSucessMessage().getText();}
    public String getDepartStationInfor() {
        return this.getDglDepartStation().getText();
    }
    public String getArriveStationInfor() {
        return this.getDglArriveStationBookedTicket().getText();
    }
    public String getSeatTypeInfor() {
        return this.getDglSeatTypeBookedTicket().getText();
    }
    public String getTicketAmountInfor() {return this.getDglTicketAmountBookedTicket().getText();}
    private Select getDropDownDepartDate() {
        Select select = new Select(this.getDdlDepartDate());
        return select;}

    private Select getDropDownDepartFrom() {
        Select select = new Select(this.getDdlDepartFrom());
        return select;
    }
    private Select getDropDownArriveAt() {
        Select select = new Select(this.getDdlArriveAt());
        return select;
    }
    private Select getDropDownTicketAmount() {
        Select select = new Select(this.getDdlTicketAmount());
        return select;}
    private Select getDropDownSeatType() {
        Select select = new Select(this.getDdlSeatType());
        return select;}
    public void selectArriveStation(int t) {this.getDropDownArriveAt().selectByIndex(t);}
    public void selectDepartDate() {this.getDropDownDepartDate().getFirstSelectedOption();}
    public void selectDepartStation(String departstation) {this.getDropDownDepartFrom().selectByVisibleText(departstation);}
    public void selectSeatType(int t ) {
        this.getDropDownSeatType().selectByIndex(t);
    }
    public void selectTicketAmount(String amount) {this.getDropDownTicketAmount().selectByValue(amount);this.getDdlDepartFrom().submit();}

}
