package com.epam.likhanau.pageobject;

import com.epam.likhanau.data.NearAirportSearchData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSearchNearAirportPage extends BasePage {

    @FindBy(css = "div[data-mode=checkin]")
    private WebElement calendarFrom;

    @FindBy(css = "input[value=leisure]")
    private WebElement travelPurpose;

    @FindBy(css = "button[data-sb-id=main]")
    private WebElement buttonShowMePrices;

    public HotelSearchNearAirportPage findDataPlace(NearAirportSearchData data) throws InterruptedException {

        calendarFrom.click();
        getDriver().findElement(By.cssSelector("td[data-id='" + data.getCheckIn() + "']")).click();
        Thread.sleep(2000);
        travelPurpose.click();
        buttonShowMePrices.click();
        return this;
    }
}


