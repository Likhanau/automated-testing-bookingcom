package com.epam.likhanau.pageobject;


import com.epam.likhanau.data.SearchHotelData;
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

    @FindBy(id = "group_adults")
    private WebElement adultsButton;

    @FindBy(id = "group_children")
    private WebElement childrenButton;

    @FindBy(id = "no_rooms")
    private WebElement roomsButton;

    @FindBy(xpath = "//a[contains(@href,'https://www.booking.com/airport')]")
    private WebElement airportButton;

    public HotelSearchPage findDataPlace(SearchHotelData data) throws InterruptedException {

        cityDir.clear();
        cityDir.sendKeys(data.getCityDir());

        if (data.getCheckIn() != null) {
            calendarFrom.click();
            getDriver().findElement(By.xpath("//td[@data-id ='" + data.getCheckIn() + "']")).click();
            Thread.sleep(2000);
        }

        if (data.getCheckOut() != null) {
            calendarFrom.click();
            getDriver().findElement(By.xpath("//td[@data-id ='" + data.getCheckOut() + "']")).click();
            Thread.sleep(2000);
        }

        if (data.getAdultsNumber() != null) {
            adultsButton.click();
            getDriver().findElement(By.xpath("//select[@id='group_adults']/option[@value='" + data.getAdultsNumber() + "']")).click();
        }
        Thread.sleep(1000);

        if (data.getChildrenNumber() != null) {
            childrenButton.click();
            getDriver().findElement(By.xpath("//select[@id='group_children']/option[@value='" + data.getChildrenNumber() + "']")).click();
        }
        Thread.sleep(1000);

        if (data.getRoomsNumber() != null) {
            roomsButton.click();
            getDriver().findElement(By.xpath("//select[@id='no_rooms']/option[@value='" + data.getRoomsNumber() + "']")).click();
        }
        Thread.sleep(1000);

        showMePricesButton.click();
        return this;
    }


    public HotelSearchPage pushAirportButton() {

        airportButton.click();

        return this;
    }

}
