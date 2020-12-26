package com.course.lesson7;

import org.testng.annotations.Test;

public class DataDriverTest {

    @Test(dataProvider = "data-provider1",dataProviderClass = DataProviderContainer.class)
    public void testingData(String massage, int value) {
        System.out.println(massage + value);
    }
}

