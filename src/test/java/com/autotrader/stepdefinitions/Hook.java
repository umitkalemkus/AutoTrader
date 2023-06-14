package com.autotrader.stepdefinitions;

import com.autotrader.utilities.ConfigReader;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {


    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialize WebDriver, open browser, and perform setup steps
        MyDriver.getDriver().manage().window().maximize();
        MyDriver.getDriver().get(ConfigReader.getProperty("Url"));
        driver = new ChromeDriver();
        // Additional setup steps for your application
    }

    @After
    public void tearDown(Scenario scenario) {
        // Capture screenshot if scenario fails
        if (scenario.isFailed()) {
            System.out.println("Test failed! Check your Screenshot");
            // Take screenshot using WebDriver
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }else {
            System.out.println("Test passed");
        }

        // Close the browser and perform cleanup steps
        driver.quit();
        // Additional cleanup steps for your application
    }



















    }
