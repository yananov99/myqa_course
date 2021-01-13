package com.course.HWLesson8;

import org.testng.annotations.Test;

public class PHPTravelTest extends BaseTestPHPTravel {

    @Test
    public void PHPTravelTest() {
        phpTravelPage.getPage();
        phpTravelPage.pressStoreBtn();
        phpTravelPage.pressMobileBtn();
        phpTravelPage.pressCheckbox();
        phpTravelPage.pressContinueBtn();

    }
}

