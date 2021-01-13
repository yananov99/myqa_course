package com.course.lesson8;

import org.testng.annotations.Test;

public class LinkedinTest extends BaseTest {

    @Test
    public void linkedinTest() {
        linkedinLoginPage.getPage();
        linkedinLoginPage.login("Test","Test");
        System.out.println();
    }
}

