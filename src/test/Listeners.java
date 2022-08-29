package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG Listeners
public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {//run before any test
        System.out.println("The test is started ");
    }

    @Override
    public void onTestSuccess(ITestResult result) {//after a test success
        System.out.println("The Test is succeeded");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The is is failed "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {//at first ,on Start of testing
        System.out.println("on Start");
    }

    @Override
    public void onFinish(ITestContext context) {//at the end when we finish testing
        System.out.println("On finish");
    }
}
