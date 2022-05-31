package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private final By signin = By.xpath("//a[text()=' sign-in ']");
    private final By flightsLink = By.xpath("//a[text()='Flights']");


    public void goToFlightDetailsPage(){

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(signin)));
        driver.findElement(flightsLink).click();
    }
}
