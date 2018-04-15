package com.epam.likhanau.pageobject;


import com.epam.likhanau.api.WebDriverConfig;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected final Logger log = Logger.getLogger(this.getClass());

    protected WebDriver driver;


    public BasePage() {
        this.driver = WebDriverConfig.getWebDriver();
        PageFactory.initElements(getDriver(), this);
        log.debug("Init driver - " + driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
