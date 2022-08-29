package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test(groups = {"Smoke"})
    public void Demo() {
        System.out.println("Day 2:1");
    }
    @Test(groups = {"Smoke"})
    public void Demo1() {
        System.out.println("Day 2:2");
    }
    @Test(groups = {"Smoke"})
    public void Demo2() {
        System.out.println("Day 2:3");
    }

    @BeforeTest//run before any test annotation in this class
    public void beforeTest()
    {
        System.out.println("Before Test Method ");
    }

}
