package com.epam.likhanau.pageobject;


import com.epam.likhanau.data.CheckMoreThenHotelsData;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HotelSearchPage extends BasePage {

    private final Logger log = Logger.getLogger(this.getClass());

    @FindBy(id = "ss")
    private WebElement cityDir;

    @FindBy(css = "div[data-mode=checkin]")
    private WebElement calendarFrom;

    @FindBy(css = "div[data-mode=checkout]")
    private WebElement calendarTo;

    @FindBy(css = "button[data-sb-id=main]")
    private WebElement showMePricesButton;

    @FindBy(xpath = "//a[contains(@href,'https://www.booking.com/airport')]")
    private WebElement airportButton;


    public HotelSearchPage findDataPlace(CheckMoreThenHotelsData data) throws InterruptedException {
        // CONVERT DATE TO MILLISECONDS https://www.freeformatter.com/epoch-timestamp-to-date-converter.html

        cityDir.clear();
        cityDir.sendKeys(data.getCityDir());

        calendarFrom.click();
        getDriver().findElement(findDateById(data.getDateFrom())).click();
        Thread.sleep(2000);

//        calendarTo.click();
//        Thread.sleep(2000);
//        getDriver().findElement(findDateById(data.getDateTo())).click();
//
//        Thread.sleep(1000);

        showMePricesButton.click();


        return this;
    }

    public HotelSearchPage pushAirportButton(){

        airportButton.click();

        return this;
    }


    public By findDateById(Long id){
        return By.cssSelector("td[data-id='" + id + "']");
    }

}
