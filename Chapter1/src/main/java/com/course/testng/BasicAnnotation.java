package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
   @Test
    public void testCase1(){
        System.out.println("这是test Case1 -- 1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是test Case2 -- 2");
    }

    @Test
    public void testCase3(){
        System.out.println("这是test Case3 -- 3");
    }
//    public  void testGroup
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是beforeMethod 1 --1");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是afterMethod 1 --1");
    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("这是beforeClass1 ---1");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("这是afterClass1 ---1");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite  1-1");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite  1-1");
    }
}
