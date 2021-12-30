package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;


public class TimeTablePage extends GerneralPage{
    private final By ddlCheckPriceDaNangtoSaiGon=By.xpath("//td[text()='Đà Nẵng']/following-sibling::td[text()='Sài Gòn']/following-sibling::td[3]/a[contains(text(),'check price')]");
    private final By ddlTicketMessage=By.xpath("//tr[@class='TableSmallHeader']/th");
    public WebElement getCheckPriceDaNangtoSaiGon() {return Constant.WEBDRIVER.findElement(ddlCheckPriceDaNangtoSaiGon);}
    public WebElement getDdlTicketMessage() {
        return Constant.WEBDRIVER.findElement(ddlTicketMessage);
    }
    public String getTicketMessage(){
        return  this.getDdlTicketMessage().getText();
    }
    public void CheckPriceDaNangtoSaiGon(){
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("window.scrollBy(0,500)");
      this.getCheckPriceDaNangtoSaiGon().click();
        js.executeScript("window.scrollBy(0,200)");}
    public String getTicKetInfor(){ List<WebElement> priceinfor = Constant.WEBDRIVER.findElements(
            By.xpath("//th[normalize-space()='Price (VND)']/parent::tr/td"));
        List<WebElement> seattypeinfor = Constant.WEBDRIVER.findElements(
                By.xpath("//th[normalize-space()='Seat type']/parent::tr/td"));
        String actual = "";
        for(int i = 0 ; i<priceinfor.size();i++){
            String price= priceinfor.get(i).getText();
        String seattype=seattypeinfor.get(i).getText();
        actual=actual+seattype+":"+price +",";
        }
        return actual;
    }


}
