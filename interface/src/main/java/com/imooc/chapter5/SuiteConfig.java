package com.imooc.chapter5;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

}
