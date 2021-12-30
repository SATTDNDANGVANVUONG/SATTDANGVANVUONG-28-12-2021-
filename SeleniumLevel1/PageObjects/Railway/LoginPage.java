package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GerneralPage {
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
    public WebElement getlbLoginErrorMsg() {
        return Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    //Methods
    public HomePage login(String username, String password) {
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        return new HomePage();
    }

    public void loginMultipleTime(int n) {
        for (int i = 0; i < n; i++) {
            this.login(Constant.USERNAME, "sairoidomay");
        }


    }


}