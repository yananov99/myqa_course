package com.course.lessons.six;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest {

    @Test
    public void chromeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/yana.novojeni/Downloads/for QA course/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
    }

    @Test
    public void mozillaTest() {
        System.setProperty("webdriver.gecko.driver", "/Users/yana.novojeni/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com.ua");
    }
}
