package com.autotrader.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MyDriver {


    private static WebDriver driver;



    private MyDriver(){

    }

    public static WebDriver getDriver(){



        if(driver == null){
            String browser = ConfigReader.getProperty("browser");
            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions co = new ChromeOptions();
                    co.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(co);
                    break;


                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }


    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }




}
