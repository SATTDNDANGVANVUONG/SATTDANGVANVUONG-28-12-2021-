package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GerneralPage {
    //Locators
    private final By frmCurrentPassword = By.id("currentPassword");
    private final By frmNewPassword = By.id("newPassword");
    private final By frmConfirmPassWord = By.id("confirmPassword");
    private final By btbChangePassword = By.xpath("//p[@class='form-actions']/input[@type='submit']");
    private final By lblErrorConfirmMessage = By.xpath("//li[@class='confirm-password']/label[@class='validation-error']");

    //Elements
    public WebElement getFrmCurrentPassword() {
        return Constant.WEBDRIVER.findElement(frmCurrentPassword);
    }
    public WebElement getFrmNewPassword() {
        return Constant.WEBDRIVER.findElement(frmNewPassword);
    }
    public WebElement getFrmConfirmPassWord() {
        return Constant.WEBDRIVER.findElement(frmConfirmPassWord);
    }
    public WebElement getbtnChangePassword() {return Constant.WEBDRIVER.findElement(btbChangePassword);}
    public WebElement getlblErrorConfirmMessage() {return Constant.WEBDRIVER.findElement(lblErrorConfirmMessage);
    }

    //Methods
    public String getErrorConfirmMessage() {
        return this.getlblErrorConfirmMessage().getText();
    }
    public void changepassword(String currentpassword, String newpassword, String confirmpassword) {
        this.getFrmCurrentPassword().sendKeys(currentpassword);
        this.getFrmNewPassword().sendKeys(newpassword);
        this.getFrmConfirmPassWord().sendKeys(confirmpassword);
        this.getbtnChangePassword().submit();
    }
}
