package test;

import org.testng.annotations.Test;

import java.time.Duration;

public class day4 {
    @Test(dependsOnMethods = {"LoginApiHome"})
    public void WebLoginHome()
    {
        System.out.println("Web Login Home");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHome()
    {
        System.out.println("Mobile Login Home");
    }

    @Test(enabled=true,timeOut = 4000)
    public void LoginApiHome()
    {
        System.out.println("Login API Home");
    }
}
