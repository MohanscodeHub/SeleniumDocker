package flightmodule.pages;

import com.commonutils.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {


    private final By firstName = By.xpath("//input[@name='firstName']");
    private final By lastName = By.xpath("//input[@name='lastName']");
    private final By userName = By.xpath("//input[@name='email']");
    private final By password = By.xpath("//input[@name='password']");
    private final By confirmPassword = By.xpath("//input[@name='confirmPassword']");

    private final By submit = By.xpath("//input[@name='submit']");



    public RegistrationPage goTo(){
        DriverManager.getDriver().get("https://demo.guru99.com/test/newtours/register.php");
        new WebDriverWait(DriverManager.getDriver(), 50).until(ExpectedConditions.presenceOfElementLocated(firstName));
        return this;
    }

    public RegistrationPage enterUserDetails(String firstname, String lastname){
        DriverManager.getDriver().findElement(firstName).sendKeys(firstname);
        DriverManager.getDriver().findElement(lastName).sendKeys(lastname);
        return this;
    }

    public RegistrationPage enterUserCredentails(String username, String passwrd){
        DriverManager.getDriver().findElement(userName).sendKeys(username);
        DriverManager.getDriver().findElement(password).sendKeys(passwrd);
        DriverManager.getDriver().findElement(confirmPassword).sendKeys(passwrd);
        return this;
    }

    public RegistrationConfirmationPage clickSubmit(){
        DriverManager.getDriver().findElement(submit).click();
        return new RegistrationConfirmationPage();

    }
}
