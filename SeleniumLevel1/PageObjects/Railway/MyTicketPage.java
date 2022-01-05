package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class MyTicketPage extends GerneralPage{
    String btnCancelTicket = "//td[text()='%s']/following-sibling::td[text()='%s']/../td[count(//th[text()='Operation']/preceding-sibling::th)+1]/input";
    //private final By btnCancelTicket = By.xpath("//td[text()='Nha Trang']/following-sibling::td[text()='Sài Gòn']/../td[count(//th[text()='Operation']/preceding-sibling::th)+1]/input");
    public WebElement getBtnCancelTicket(String depart , String arrive){
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(btnCancelTicket, depart, arrive)));
    }
    public  void cancelTicket(String depart ,String arrive){
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("window.scrollBy(0,500)");
        this.getBtnCancelTicket(depart,arrive).click();
    }
    public void AcceptCancelAlert(){
        Constant.WEBDRIVER.switchTo().alert().accept();
    }
    public boolean isCancelTicketPresent() {
        try {
            this.getBtnCancelTicket("Nha Trang","Sài Gòn");
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


}
