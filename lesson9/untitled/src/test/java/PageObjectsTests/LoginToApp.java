package PageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToApp {
    private WebDriver driver;
    @BeforeMethod
    public void  starUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp("academic198405@gmail.com", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_successfulLogin(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp("academic198405@gmail.com","Te$t$tude9nt");
        Assert.assertTrue(loginPage.isError());
    }




}
