package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

    @Parameters({"URL","URL1"})
    @Test
    public void WebLoginCar(String urlName,String SecondURL)
    {
        System.out.println("Web Login Car ");
        System.out.println("urlName = " + urlName + ", SecondURL = " + SecondURL);
    }

    @Test
    public void MobileLoginCar()
    {
        System.out.println("Mobile Login Car");
    }


    @Test(dataProvider = "getData")
    public void LoginApiCar(String name,String surname,int age)
    {

        System.out.println("Login API Car");
        System.out.println("name = " + name + ", surname = " + surname + ", age = " + age);
    }

    @DataProvider
    public Object[][] getData()
    {
        return new Object[][]{{"Toufic","Deknach",21},{"Cristiano","Ronaldo",37},{"Lionel","Messi",35}};
    }
}
