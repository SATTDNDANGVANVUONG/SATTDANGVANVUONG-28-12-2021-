package Railway;

import Constant.Constant;
import Constant.Utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class TestBase {
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Pre-condition");
            System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath()+"/Executables/chromedriver.exe");
            Constant.WEBDRIVER= new ChromeDriver();
            Constant.WEBDRIVER.manage().window().maximize();
            Constant.WEBDRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        @AfterMethod
        public void afterMethod(){
            System.out.println("Post-condition");
             Constant.WEBDRIVER.quit();
        }
}
