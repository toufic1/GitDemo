package test;

import org.testng.annotations.*;

public class day1 {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before  Suite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }
    @AfterSuite
    public void after()
    {
        System.out.println("After Suite");
    }
    @Test(groups ={"Smoke"})
    public void Demo() {
        System.out.println("Hello world !");
    }

    @Test
    public void SecondTest()
    {
        System.out.println("bye");
    }


    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test ");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After class");
    }
}
