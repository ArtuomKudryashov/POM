package PageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlaylistTest extends  BaseTest{

    @Test
    public void playlistTests_createPlaylist_playlistCreated() {
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);
//
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(usermame,password );

        String playlistId= mainPage.createPlaylist(playlistName);

//
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));


    }
    @Test
    public void playlistTests_renamePlaylist_playlistCreated() {
        Faker faker = new Faker();

        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(usermame,password );
        String playlistId= mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));


    }
}
