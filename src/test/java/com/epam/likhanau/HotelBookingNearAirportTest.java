package com.epam.likhanau;

import com.epam.likhanau.api.DataAccessHelper;
import com.epam.likhanau.data.NearAirportSearchData;
import com.epam.likhanau.listener.SetUpDataListener;
import com.epam.likhanau.pageobject.AirportPage;
import com.epam.likhanau.pageobject.HotelSearchNearAirportPage;
import com.epam.likhanau.pageobject.HotelSearchPage;
import com.epam.likhanau.pageobject.ResultHotelPage;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Listeners(value = SetUpDataListener.class)
public class HotelBookingNearAirportTest {
    private final Logger log = Logger.getLogger(this.getClass());

    @Test(dataProvider = "searchHotelNearMinskAirportData")
    public void searchHotelNearAirport(NearAirportSearchData data) throws InterruptedException {

        log.info("Check data: " + data);

        HotelSearchPage page = new HotelSearchPage();
        page.pushAirportButton();
        Thread.sleep(10000);

        AirportPage airportPage = new AirportPage();
        airportPage.chooseAirport();
        Thread.sleep(10000);

        HotelSearchNearAirportPage hotelBookingNearAirportPageTest = new HotelSearchNearAirportPage();
        hotelBookingNearAirportPageTest.findDataPlace(data);
        Thread.sleep(10000);

        ResultHotelPage resultPage = new ResultHotelPage();
        Integer resultLength = resultPage.getAmountOfAvailableHotels();

        assertTrue(resultLength >= data.getMinResultList());
    }

    @DataProvider
    private Object[][] searchHotelNearMinskAirportData() {
        List<NearAirportSearchData> dataList = DataAccessHelper.getNearMinskAirportSearchData();
        Object[][] objArray = new Object[dataList.size()][];

        for (int i = 0; i < dataList.size(); i++) {
            objArray[i] = new Object[1];
            objArray[i][0] = dataList.get(i);
        }
        return objArray;
    }
}
