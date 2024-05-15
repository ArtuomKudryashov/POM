package PageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToApp extends BaseTest {


    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_successfulLogin(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }




}
