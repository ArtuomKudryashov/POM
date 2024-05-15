package pageObjectsTests;

import enums.BrowserType;
import helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected  String username;
    protected  String password;
    protected  String wrongpassword;
    @Parameters({"username","password","wrongpassword","browser"})
    @BeforeMethod
    public void  starUp(String email, String password, String wrongpassword, String browser) {
        username =email;
        this.password = password;
        this.wrongpassword = wrongpassword;
        BrowserType browserType = browser.equals("chrome")? BrowserType.CHROME:BrowserType.FIREFOX;
        driver = BrowserFactory.getDriver(browserType);

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



    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
