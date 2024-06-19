package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {
    private static Logger logger = LogManager.getLogger(MainPage.class);


    public MainPage(WebDriver driver) {
        super(driver);


    }

    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    private WebElement getNewPlayListItem() {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getCreateEditPlaylistField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
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
        logger.info("Create Playlist with name -> "+ playlistName);

        String playlistId = "";
        getPlusButton().click();
        getNewPlayListItem().click();
        getCreateEditPlaylistField().sendKeys(playlistName);
        getCreateEditPlaylistField().sendKeys(Keys.ENTER);
        By successBy = By.xpath("//*[@class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        System.out.println(driver.getCurrentUrl());
        /**
         * Получение ID
         *
         */


        String url = driver.getCurrentUrl();
        playlistId = url.split("/")[5];
        System.out.println(playlistId);
        System.out.println(playlistName);

        return playlistId;


    }

    private By getPlaylistBy(String playlistId) {
        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }


    public boolean checkPlaylist(String playlistId, String playlistName) {
//        By playlistBy = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        By playlistBy = getPlaylistBy(playlistId);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            System.out.println("Name = " + name);
            return name.equals(playlistName);
        } catch (TimeoutException c) {
            return false;
        }
    }


    public void renamePlaylist(String playlistId, String newPlaylistName) {
        logger.fatal("Updating playlist id " +playlistId);
        logger.fatal("New playlist name = " + newPlaylistName);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playlist = driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlaylistField();
        editingField.sendKeys(Keys.CONTROL + "A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.ENTER);
    }

    private WebElement getEditPlaylistField() {
        By editBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return driver.findElement(editBy);
    }
    public void getDeleteButtonClick()  {
        WebElement element = driver.findElement(By.xpath("//li[text()='Delete']"));
        element.click();



    }


    public void listOfElements() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']//li/a")));

        // Поиск списка элементов
        List<WebElement> playlistsSection = driver.findElements(By.xpath("//section[@id='playlists']//a"));


        System.out.println(playlistsSection.size());
        Actions actions = new Actions(driver);

        // Прокрутить до последнего элемента списка
        WebElement lastElement = playlistsSection.get(playlistsSection.size() - 1);
        actions.moveToElement(lastElement).perform();

        // Начать клик правой кнопкой мыши с последнего элемента и продолжать до третьего элемента
        for (int i = playlistsSection.size() - 1; i >= 2; i--) {
            WebElement element = playlistsSection.get(i);
            actions.contextClick(element).perform();
            getDeleteButtonClick();

        }






    }


}

//



