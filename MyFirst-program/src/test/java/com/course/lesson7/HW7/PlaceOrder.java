package com.course.lesson7.HW7;
//Используя локатор XPATH заполнить check-out форму http://www.practiceselenium.com/check-out.html
// и нажать кнопку Place Order
//Значение из дропдауна -> https://stackoverflow.com/questions/20138761/how-to-select-a-dropdown-value-in-selenium-webdriver-using-java)

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlaceOrder {

    private WebDriver driver;

    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void Test() {
        driver.get("http://www.practiceselenium.com/check-out.html");
        WebElement Email = driver.findElement(By.id("email"));
        WebElement Name = driver.findElement(By.id("name"));
        WebElement address = driver.findElement(By.id("address"));
        WebElement CardNum = driver.findElement(By.xpath("//*[@id='card_number']"));
        WebElement CardHolderName = driver.findElement(By.xpath("//*[@id='cardholder_name']"));
        WebElement VerificationCode = driver.findElement(By.xpath("//*[@id='verification_code']"));
        WebElement placeOrderBtn = driver.findElement(By.xpath("//*[text() = 'Place Order']"));

        Select dropdown = new Select(driver.findElement(By.id("card_type")));

        Email.sendKeys("test@test.com");
        Name.sendKeys("test");
        address.sendKeys("NewYork");
        dropdown.selectByIndex(1);
        CardNum.sendKeys("1111 2222 3333 4444");
        CardHolderName.sendKeys("Vasea");
        VerificationCode.sendKeys("123");
        placeOrderBtn.click();
    }


    @AfterTest
    public void tearDown() {
        driver.quit();

    }

}




