package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(200));

    }

    public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    public String createPlaylist(String playlistName) {
        String playlistId = "";
//        getPlusButton().click();
//        getNewPlayListItem().click();
//        getEditPlaylistField().sendKeys(playlistName);
//        getEditPlaylistField().sendKeys(Keys.ENTER);
//        By successBy = By.xpath("//*[@class='success show']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
//        System.out.println(driver.getCurrentUrl());
//        /**
//         * Получение ID
//         *
//         */
//
//
//        String url = driver.getCurrentUrl();
//        playlistId=url.split("/")[5];
//        System.out.println(playlistId);
//        System.out.println(playlistName);
////
        return playlistId;

    }
}
