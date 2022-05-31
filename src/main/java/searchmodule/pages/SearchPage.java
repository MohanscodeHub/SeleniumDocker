package searchmodule.pages;

import com.tests.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private final By searchForm = By.xpath("//form[@id='search_form_homepage']");
    private final By searchButton = By.xpath("//input[@id='search_button_homepage']");
    public SearchPage goTo(){
        DriverManager.getDriver().get("https://duckduckgo.com/");
        return this;
    }


    public VideosPage search(){

        //new WebDriverWait(DriverManager.getDriver(), 50).until(ExpectedConditions.elementToBeClickable(searchForm));
        JavascriptExecutor js = (JavascriptExecutor)  DriverManager.getDriver();
        js.executeScript("arguments[0].value='key'", DriverManager.getDriver().findElement(searchForm));
      //  DriverManager.getDriver().findElement(searchForm).sendKeys("QA");
        DriverManager.getDriver().findElement(searchButton).click();
        return new VideosPage();
    }


}
