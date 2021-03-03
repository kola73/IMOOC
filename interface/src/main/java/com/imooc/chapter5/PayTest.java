package com.imooc.chapter5;

import org.testng.annotations.*;

public class PayTest {
    @Test
    public void pay() {
        System.out.println("pay");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }
}
