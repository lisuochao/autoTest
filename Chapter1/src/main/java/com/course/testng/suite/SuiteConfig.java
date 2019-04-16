package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/***
 * 写案例执行前需要执行的东西
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println(" suiterconfig 已执行 --before suite 1-1");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("suiterconfig 已执行 -- after suite 1-1");
    }

}
