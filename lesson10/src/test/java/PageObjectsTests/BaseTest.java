package PageObjectsTests;

import enums.BrowserType;
import helpers.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=1920,1080");
//        driver = new ChromeDriver(options);

//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver(options);

//        WebDriverManager.firefoxdriver().setup();
//        driver= new FirefoxDriver();

//        WebDriverManager.operadriver().setup();
//        WebDriver driver = new OperaDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();

        driver = BrowserFactory.getDriver(BrowserType.CHROME);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
