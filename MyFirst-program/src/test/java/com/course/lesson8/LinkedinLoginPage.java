package com.course.lesson8;

import com.course.HWLesson8.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLoginPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='session_key']")
    private WebElement emailFld;

    @FindBy(xpath = "//*[@id='session_password']")
    private WebElement passwordFld;

    @FindBy(xpath = "//*[@class='sign-in-form__submit-button']")
    private WebElement signInBtn;

    public LinkedinLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setEmail(String email) {
        emailFld.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordFld.sendKeys(password);
    }

    public void pressSignin() {
        signInBtn.click();
    }

    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        pressSignin();
    }

    @Override
    public void getPage() {
        driver.get("https://www.linkedin.com/");
    }
}
