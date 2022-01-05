package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GerneralPage {
    //locators
    private final By tagLogin = By.xpath("//span[normalize-space()='Login']");
    public final By tagLogout = By.xpath("//span[normalize-space()='Log out']");
    private final By tabRegister = By.xpath("//span[normalize-space()='Register']");
    private final By tabChangePassWord = By.xpath("//span[normalize-space()='Change password']");
    private final By tagBookTicket = By.xpath("//span[normalize-space()='Book ticket']");
    private final By tagContact = By.xpath("//span[normalize-space()='Contact']");
    private final By lblWelcomeMessage = By.xpath("//*[@id=\"banner\"]/div/strong");
    private final By lnlErrorMessage = By.xpath("//*[@id=\"content\"]/p");
    private final By lblHomePageMessage = By.xpath("//div[@id='content']/h1");
    private final By tabTimeTable = By.xpath("//span[normalize-space()='Timetable']");
    private final By tabMyTicket = By.xpath("//span[normalize-space()='My ticket']");

    //Elements
    protected WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(tagLogin);
    }

    protected WebElement getTabLogOut() {
        return Constant.WEBDRIVER.findElement(tagLogout);
    }

    protected WebElement getTabBookTicket() {
        return Constant.WEBDRIVER.findElement(tagBookTicket);
    }

    public WebElement getTabRegister() {
        return Constant.WEBDRIVER.findElement(tabRegister);
    }

    public WebElement getTabChangePassword() {
        return Constant.WEBDRIVER.findElement(tabChangePassWord);
    }

    public WebElement getTabContact() {
        return Constant.WEBDRIVER.findElement(tagContact);
    }

    public WebElement getTabTimetable() {
        return Constant.WEBDRIVER.findElement(tabTimeTable);
    }

    public WebElement getTabMyticket() {
        return Constant.WEBDRIVER.findElement(tabMyTicket);
    }

    protected WebElement getlblWelcomeMessage() {
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    protected WebElement getlblErrorMessage() {
        return Constant.WEBDRIVER.findElement(lnlErrorMessage);
    }

    protected WebElement getlblHomePageMessage() {
        return Constant.WEBDRIVER.findElement(lblHomePageMessage);
    }


    //Methods

    public String getWelcomeMessage() {
        return this.getlblWelcomeMessage().getText();
    }
    public String getErrorMessage() {
        return this.getlblErrorMessage().getText();
    }
    public String getHomePageMessage() {
        return this.getlblHomePageMessage().getText();
    }
    public void gotoLoginPage() {this.getTabLogin().click();}
    public void gotoBookTicketPage() {
        this.getTabBookTicket().click();
    }
    public void gotoLogoutPage() {this.getTabLogOut().click();}
    public void gotoTimetablePage() {this.getTabTimetable().click();}
    public void gotoMyticketPage() {this.getTabMyticket().click();}
    public void gotoResgisterPage() {
        this.getTabRegister().click();
    }
    public void gotoChangePasswordPage() {
        this.getTabChangePassword().click();
    }
    public void gotoContactPage() {
        this.getTabContact().click();
    }


}
