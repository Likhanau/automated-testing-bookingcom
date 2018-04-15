package com.epam.likhanau.constant;

public enum BrowserEnum {
    CHROME("chrome");

    BrowserEnum(String browserName) {
        this.browserName = browserName;
    }

    public String browserName;

    public String getBrowserName() {
        return browserName;
    }

}
