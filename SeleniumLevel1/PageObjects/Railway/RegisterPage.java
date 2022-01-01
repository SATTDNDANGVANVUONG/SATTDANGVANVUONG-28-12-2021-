package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GerneralPage{
    //Locators
    private final By frmEmail= By.id("email");
    private final By frmPassWord= By.id("password");
    private final By frmConfirmPassWord= By.id("confirmPassword");
    private final By frmPassPort= By.id("pid");
    private final By btnRegister=By.xpath("//input[@title='Register']");
    private final By frmErrorEmailMessage=By.xpath("//p[@class='message error']");
    private final By frmErrorPassWordMessage=By.xpath("//li[@class='password']/label[@class='validation-error']");
    private final By frmErrorPassport=By.xpath("//li[@class='pid-number']/label[@class='validation-error']");
    private final By lblWelcomeMessage=By.xpath("//div[@id='content']/p");

    //Elements
    public WebElement getFrmEmail(){
        return Constant.WEBDRIVER.findElement(frmEmail);
    }
    public WebElement getFrmPassword(){
        return Constant.WEBDRIVER.findElement(frmPassWord);
    }
    public WebElement getFrmConfirmPassWord(){
        return Constant.WEBDRIVER.findElement(frmConfirmPassWord);
    }
    public WebElement getFrmPassPort(){
        return Constant.WEBDRIVER.findElement(frmPassPort);
    }
    public WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }
    public WebElement getfrmErrorEmailMessage(){
        return Constant.WEBDRIVER.findElement(frmErrorEmailMessage);
    }
    public WebElement getLblRegisterMessage(){return Constant.WEBDRIVER.findElement(lblWelcomeMessage);}
    public WebElement getfrmErrorPassWordMessage(){return Constant.WEBDRIVER.findElement(frmErrorPassWordMessage);}
    public WebElement getfrmErrorPassportMessage(){return Constant.WEBDRIVER.findElement(frmErrorPassport);}


    //Methods
    public String getRegisterMessage() {
        return this.getLblRegisterMessage().getText();
    }
    public String getErrorEmailMessage() {
        return this.getfrmErrorEmailMessage().getText();
    }
    public String getErrorPassWordMessage() {
        return this.getfrmErrorPassWordMessage().getText();
    }
    public String getErrorPassportMessage() {
        return this.getfrmErrorPassportMessage().getText();
    }
    public String getErrorConfirmMessage() {
        return this.getlblErrorMessage().getText();
    }
    public void register(String email,String password,String confirmpassword,String passport){
        this.getFrmEmail().sendKeys(email);
        this.getFrmPassword().sendKeys(password);
        this.getFrmConfirmPassWord().sendKeys(confirmpassword);
        this.getFrmPassPort().sendKeys(passport);
        this.getBtnRegister().submit();
    }

}
