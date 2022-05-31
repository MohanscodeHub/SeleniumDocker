package com.commonutils.base;

import com.commonutils.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;


public class BaseTest {

	WebDriver driver;


	protected BaseTest(){


	}

	@BeforeMethod
	protected void setUp() throws MalformedURLException {
		Driver.initDriver();


	}

	@AfterMethod
	protected void tearDown(){

		Driver.quitDriver();

	}
}


