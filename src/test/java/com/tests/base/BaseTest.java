package com.tests.base;

import com.tests.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

	WebDriver driver;


	protected BaseTest(){


	}

	@BeforeMethod
	protected void setUp(){
		Driver.initDriver();


	}

	@AfterMethod
	protected void tearDown(){

		Driver.quitDriver();

	}
}


