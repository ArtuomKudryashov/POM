package PageObjectsTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
