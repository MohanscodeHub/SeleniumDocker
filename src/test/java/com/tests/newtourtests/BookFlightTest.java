package com.tests.newtourtests;

import com.tests.base.BaseTest;
import com.tests.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BookFlightTest extends BaseTest {

    WebDriver driver;




    @Test
    public void flightDetailsTest(){

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.
                goTo().
                enterUserDetails("Mohan","k").
                enterUserCredentails("Mohan","k").
                clickSubmit();
    }








}
