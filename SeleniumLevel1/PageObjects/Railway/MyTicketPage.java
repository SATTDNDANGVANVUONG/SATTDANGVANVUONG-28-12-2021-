package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class MyTicketPage extends GerneralPage{
    private final By btnCancelTicket = By.xpath("//td[text()='Nha Trang']/following-sibling::td[text()='Sài Gòn']/../td[count(//th[text()='Operation']/preceding-sibling::th)+1]/input");
    public WebElement getBtnCancelTicket(){
        return Constant.WEBDRIVER.findElement(btnCancelTicket);
    }
    public  void cancelTicket(){
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("window.scrollBy(0,500)");
        this.getBtnCancelTicket().click();
    }
    public void AcceptCancelAlert(){
        Constant.WEBDRIVER.switchTo().alert().accept();
    }
    public boolean isCancelTicketPresent() {
        try {
            this.getBtnCancelTicket();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


}
