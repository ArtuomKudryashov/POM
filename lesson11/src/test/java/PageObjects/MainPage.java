package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);


    }
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
    private  WebElement getNewPlayListItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private  WebElement getCreateEditPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    public  boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }
    public String createPlaylist(String playlistName){
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
        playlistId=url.split("/")[5];
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
            System.out.println("Name = "+name);
            return  name.equals(playlistName);
        } catch (TimeoutException c){
            return false;
        }
    }



    public void renamePlaylist(String playlistId, String newPlaylistName) {
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
        By editBy= By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return driver.findElement(editBy);
    }
    public  void deletePlayList_PlaylistDeleted(){
        List<WebElement> elements = driver.findElements(By.xpath("//section[@current-view='Playlist']/ul//li"));

        if (elements.size() > 0) {
            WebElement lastElement = elements.get(elements.size() - 1);

            // Добавляем ожидание видимости последнего элемента в списке плейлистов
            wait.until(ExpectedConditions.visibilityOf(lastElement));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastElement);
            // Другие действия, например, удаление элемента
        } else {
            System.out.println("Список плейлистов пуст.");
        }
    }

    }

//



