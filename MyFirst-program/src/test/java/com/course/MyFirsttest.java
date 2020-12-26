package com.course;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirsttest {

    @BeforeClass
    public void setupClass(){
        System.out.println("Setup class");

    }

    @BeforeClass
    public void setupTest() {
        System.out.println("Setup Test");

    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Setup method");

    }

    @BeforeSuite
    public void setupSuit(){
        System.out.println("Setup suit");

    }

    @Test(description = "this is the first basic test", priority = 0, enabled = true)
    public void basicTest(){
        System.out.println("First test executed");
        Assert.assertEquals(2,2);
    }
    @Test(description = "this is the second basic test", priority = 2, enabled = true)
    public void basicTest2(){
        System.out.println("Second test executed");
        Assert.assertEquals(2,5);
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("teardown class");

    }

    @AfterTest
    public void teardownTest() {
        System.out.println("teardown Test");

    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("teardown method");

    }

    @AfterSuite
    public void teardownSuit(){
        System.out.println("teardown suit");

    }
}
