package com.course.lesson7.HW7;

import com.course.lesson7.DataProviderContainer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InternetHerokuAppTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test (dataProvider = "data-provider-first", dataProviderClass = LoginTestDataProvider.class)
        public void test(String userName, String password){
        driver.get("http://the-internet.herokuapp.com/login");
        WebElement UserName = driver.findElement(By.id("username"));
        WebElement introducePassword = driver.findElement(By.name("password"));
        WebElement clickLogin = driver.findElement(By.xpath("//*[contains(@class, 'fa fa-2x fa-sign-in')]"));

        UserName.sendKeys(userName);
        introducePassword.sendKeys(password);
        clickLogin.click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}


