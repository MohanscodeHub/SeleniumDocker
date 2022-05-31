package flightmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private final By passCount = By.xpath("//Select[@name='passCount']");
    private final By continuebtn = By.xpath("//input[@name='findFlights']");

    public  FlightDetailsPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
    }

    public  void selectPassengers(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(passCount)));
        Select select = new Select(driver.findElement(passCount));
    }

    public  void gotoFindFlightsPage(){

        driver.findElement(continuebtn);
    }

}
