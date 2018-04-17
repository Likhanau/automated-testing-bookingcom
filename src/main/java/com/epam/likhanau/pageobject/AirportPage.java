package com.epam.likhanau.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirportPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'/airport/by/msq.ru')]")
    private WebElement airportButton;

    public AirportPage chooseAirport() {
        airportButton.click();
        return this;
    }
}
