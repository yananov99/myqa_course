package com.course.lesson7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkedinTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    /*
    Locators:
    Id => p1
    Name => p2
    CSS => p3
    XPATH => p3  //*[contains(test(),'Password')]
    LinkText => p3
     */

    @Test
    public void chromeTest() {
        driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        WebElement email = driver.findElement(By.id("email-address"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement AgreeAndJoinBtn = driver.findElement(By.xpath("//*[text() = 'Agree & Join']"));
        WebElement userAgreement = driver.findElement(By.linkText("User Agreement"));

        email.sendKeys("test@test.com");
        password.sendKeys("test");
        AgreeAndJoinBtn.click();
        userAgreement.click();
    }

    @AfterMethod
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }
}
