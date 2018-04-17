package com.epam.likhanau.api;


import com.epam.likhanau.browser.BrowserEnum;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.epam.likhanau.util.PropertyUtils.getProperties;


public class WebDriverConfig {
    private static WebDriver driver = null;

    private static final Logger log = Logger.getLogger(WebDriverConfig.class);

    public static WebDriver getWebDriver() {
        if (driver == null) {
            log.info("========== CREATE NEW DRIVER ===========");
            final String browser = getProperties("browser");

            if (browser == null || browser.isEmpty()) {
                log.info("Browser is null or empty");
                throw new IllegalStateException("Browser is null or empty");
            }

            if (browser.equals(BrowserEnum.CHROME.getBrowserName())) {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
            }

        }

        return driver;
    }
}
