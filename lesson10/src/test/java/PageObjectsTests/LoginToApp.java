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
    @Test
    public void loginToApp_correctCredentials_successfulLogin1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin4(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin4(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin5(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage=loginPage.loginToApp(usermame,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin5(){
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPage.isError());
    }
}





}
