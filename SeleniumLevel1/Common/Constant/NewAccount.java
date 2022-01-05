package Constant;

import Railway.HomePage;
import Railway.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class  NewAccount extends RegisterPage {
    HomePage homePage = new HomePage();
    //Locators
    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By btbLogin = By.xpath("//*[@id=\"content\"]/form/fieldset/p/input");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

    //Elements
    public WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(txtUsername);
    }
    public WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    public WebElement getBtnLogin() {
        return Constant.WEBDRIVER.findElement(btbLogin);
    }
    public void LoginWithNewAccount(String email,String password,String confirmpassword,String passport){
        this.getFrmEmail().sendKeys(email);
        this.getFrmPassword().sendKeys(password);
        this.getFrmConfirmPassWord().sendKeys(confirmpassword);
        this.getFrmPassPort().sendKeys(passport);
        this.getBtnRegister().submit();
        homePage.gotoLoginPage();
        this.getTxtUsername().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();

    }
}
