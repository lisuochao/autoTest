package com.course.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PayTest {
    @Test
    public void payTest(){
        System.out.println("PayTest类执行成功， 1-1");
    }
    @BeforeTest
    public void beforePay(){
        System.out.println("before Pay  test 1-1");
    }

    @AfterTest
    public void afterPay(){
        System.out.println("after pay test 1-1");
    }
}
