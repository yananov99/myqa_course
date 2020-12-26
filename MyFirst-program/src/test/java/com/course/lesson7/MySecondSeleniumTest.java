package com.course.lesson7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MySecondSeleniumTest {
    private WebDriver driver;


    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void chromeTest() {
        driver.get("https://google.com.ua");
    }

    @AfterMethod
    public void teardown()throws InterruptedException{
        if(driver != null){
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
