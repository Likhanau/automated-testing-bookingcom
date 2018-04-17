package com.epam.likhanau.listener;


import com.epam.likhanau.api.WebDriverConfig;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

import static com.epam.likhanau.util.PropertyUtils.getProperties;


public class SetUpDataListener implements ITestListener {

    private static final Logger log = Logger.getLogger(SetUpDataListener.class);

    private WebDriver driver;

    public SetUpDataListener() {
        driver = WebDriverConfig.getWebDriver();
    }

    @Override
    public void onFinish(ITestContext arg0) {
        log.info("********** Quit browser " + getProperties("browser") + "**********\n\n\n");
        driver.quit();
    }

    @Override
    public void onStart(ITestContext arg0) {
        log.info("********** Start browser " + getProperties("browser") + "**********\n\n\n");
        driver.manage().window().maximize();
        driver.get(getProperties("url"));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    @Override
    public void onTestFailure(ITestResult res) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().refresh();
        log.error("========= TEST FAILURE.=============");
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {

    }

    @Override
    public void onTestStart(ITestResult res) {
        log.info("========== Start test==========  " + res.getMethod().getMethodName() + "\n");
    }

    @Override
    public void onTestSuccess(ITestResult res) {
        log.info("========== End test==========  " + res.getMethod().getMethodName() + "\n");
        log.info("Test " + res.getMethod().getMethodName() + " is Success\n\n\n");

    }
}
