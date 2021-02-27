package com.cybertek_B21.yourNameHere.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    //singleton design pattern
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    //driverPool.get() ==> just like our driver object, its a single thread of WebDriver
    //driverPool.set(new browserType()) ==> opens our browser up and sets it to that thread
    //driverPool.remove() ==> going to nullify that thread and send it back into the pool to wait for a new assignment

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {

            String browser = ConfigurationReader.getValue("browser"); //return us what browser we will be using
            synchronized (Driver.class) {
                switch (browser) {
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        break;


                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        break;

                }
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);//for webElements
                driverPool.get().manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);//for pageLoading
            }
        }


        return driverPool.get();
    }


    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }

    }


}
