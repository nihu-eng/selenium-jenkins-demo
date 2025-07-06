package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;

    @BeforeTest
    public void setup() {
       /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niharika\\Downloads\\selenium-java-4.33.0"); // Replace with your ChromeDriver path
        driver = new ChromeDriver();
        */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }

    @Test
    public void loginTest() {
        System.out.println("Executing Login Test...");
        // Add Selenium test steps here
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
