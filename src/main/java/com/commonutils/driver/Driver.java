package com.commonutils.driver;


import com.commonutils.constants.FrameworkConstants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public final class Driver {

    private Driver(){


    }




    public static void initDriver() throws MalformedURLException {
        if (Objects.isNull(DriverManager.getDriver())) {


            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            String host ="localhost";
            DesiredCapabilities dc = DesiredCapabilities.chrome();
            if(System.getProperty("BROWSER")!=null&&System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
                dc = DesiredCapabilities.firefox();
            }
            if(System.getProperty("HUBHOST")!=null){
                host =System.getProperty("HUB_HOST");
            }
            String finalurl ="http://"+host+":4444/wd/hub";
            DriverManager.setDriver(new RemoteWebDriver(new URL(finalurl),dc));


        }


    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
