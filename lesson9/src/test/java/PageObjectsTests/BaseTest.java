package PageObjectsTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected  String usermame;
    protected  String password;
    protected  String wrongpassword;
    @BeforeMethod
    public void  starUp() {
        usermame = "academic198405@gmail.com" ;
        password = "te$t$tudent" ;
        wrongpassword = "Wrong";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(options);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
