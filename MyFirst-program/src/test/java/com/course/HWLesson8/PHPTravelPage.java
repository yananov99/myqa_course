package com.course.HWLesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class PHPTravelPage extends BasePage {
        private WebDriver driver;

        @FindBy(xpath = "//*[@id='Primary_Navbar-Store']")
        private WebElement storeBtn;

        @FindBy(xpath = "//*[@id='Primary_Navbar-Store-Mobile']")
        private WebElement mobileBtn;

        @FindBy(xpath = "//*[@id='pid41']")
        private WebElement checkbox;

        @FindBy(xpath = "//*[@class='btn btn-primary btn-lg']")
        private WebElement continueBtn;


        public PHPTravelPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        public void pressStoreBtn() {
            storeBtn.click();
        }

        public void pressMobileBtn() {
            mobileBtn.click();
        }

        public void pressCheckbox() {
            checkbox.click();
        }

        public void pressContinueBtn(){
            continueBtn.click();
        }


        @Override
        public void getPage() {

            driver.get("https://phptravels.org/clientarea.php");
        }
    }





