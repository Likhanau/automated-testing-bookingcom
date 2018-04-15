package com.epam.likhanau.pageobject;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultHotelPage extends BasePage {

    @FindBy(css = "div[data-hotelid]")
    private List<WebElement> resultList;

    public Integer checkMoreThenPlace(){
        if(resultList != null){
            log.info(" ===== SUCCESS RESULT =========, length = " + resultList.size() + ";");
        } else {
            log.info(" ===== BAD RESULT =========, length = 0;");
        }
        return (resultList != null)? resultList.size(): NumberUtils.INTEGER_ZERO;

    }

}
