package pageObjectsTests;

import PageObjects.LoginPageFactory;
import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAppFactory extends BaseTest {


    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open("https://qa.koel.app/");
        MainPage mainPage=loginPageFactory.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open("https://qa.koel.app/");
        loginPageFactory.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPageFactory.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin1(){
        LoginPageFactory loginPage = new LoginPageFactory (driver);
        loginPage.open("https://qa.koel.app/");
        MainPage mainPage=loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin1(){
        LoginPageFactory loginPage = new  LoginPageFactory(driver);
        loginPage.open("https://qa.koel.app/");
        loginPage.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin2(){
        LoginPageFactory loginPage = new LoginPageFactory (driver);
        loginPage.open("https://qa.koel.app/");
        MainPage mainPage=loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin2(){
        LoginPageFactory loginPage = new  LoginPageFactory(driver);
        loginPage.open("https://qa.koel.app/");
        loginPage.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin3(){
        LoginPageFactory loginPage = new LoginPageFactory (driver);
        loginPage.open("https://qa.koel.app/");
        MainPage mainPage=loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin3(){
        LoginPageFactory loginPage = new  LoginPageFactory(driver);
        loginPage.open("https://qa.koel.app/");
        loginPage.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin4(){
        LoginPageFactory loginPage = new LoginPageFactory (driver);
        loginPage.open("https://qa.koel.app/");
        MainPage mainPage=loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin4(){
        LoginPageFactory loginPage = new  LoginPageFactory(driver);
        loginPage.open("https://qa.koel.app/");
        loginPage.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin5(){
        LoginPageFactory loginPage = new LoginPageFactory (driver);
        loginPage.open("https://qa.koel.app/");
        MainPage mainPage=loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin5(){
        LoginPageFactory loginPage = new  LoginPageFactory(driver);
        loginPage.open("https://qa.koel.app/");
        loginPage.loginToApp(username,wrongpassword);
        Assert.assertTrue(loginPage.isErrorFrame());
    }

}






