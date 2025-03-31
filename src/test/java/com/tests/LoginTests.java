package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver_path"); // Replace with your ChromeDriver path
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
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
