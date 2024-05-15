package PageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistTest {
    private WebDriver driver;

    protected  String usermame;
    protected  String password;
    protected  String wrongpassword;
    @BeforeMethod
    public void  starUp() {
        usermame = "academic198405@gmail.com" ;
        password = "te$t$tudent" ;
        wrongpassword = "Wrong";

        WebDriverManager.chromedriver().browserVersion(" 125.0.6422.0").setup();
        driver= new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(usermame,password );
        mainPage.createPlaylist("1111");

    }
}

