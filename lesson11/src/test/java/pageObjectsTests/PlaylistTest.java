package pageObjectsTests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        MainPage mainPage = loginPage.loginToApp(username,password );

        String playlistId= mainPage.createPlaylist(playlistName);

//
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));


    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed() {
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(7);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId= mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newPlaylistName));






    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated1() {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed1() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated2() {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed2() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated3() {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed3() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated4() {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed4() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated5() {
        Faker faker = new Faker();
        String playlistName = TestDataGenerator.getString(7);
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renamePlaylist_playlistRenamed5() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);


        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
}

