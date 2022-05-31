package searchmodule.pages;

import com.tests.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideosPage {

    private final By videosLink = By.xpath("//a[text()='Videos']");
    private final By allVideos = By.xpath("//div[@class='tile  tile--c--w  tile--vid  has-detail  opt--t-xxs']");

    public VideosPage goToVideos() {

        new WebDriverWait(DriverManager.getDriver(), 50).until(ExpectedConditions.presenceOfElementLocated(videosLink));
        DriverManager.getDriver().findElement(videosLink).click();
        return this;

    }

    public VideosPage printResult(){

        new WebDriverWait(DriverManager.getDriver(), 50).until(ExpectedConditions.numberOfElementsToBeMoreThan(allVideos,1));
        System.out.println(DriverManager.getDriver().findElements(allVideos).size());
        return this;
    }
}
