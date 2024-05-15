package PageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.LoginPageFactory;
import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAppFactory extends BaseTest {


    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open("https://qa.koel.app/");
        MainPage mainPage=loginPageFactory.loginToApp(usermame, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_successfulLogin(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open("https://qa.koel.app/");
        loginPageFactory.loginToApp(usermame,wrongpassword);
        Assert.assertTrue(loginPageFactory.isErrorFrame());
    }




}
