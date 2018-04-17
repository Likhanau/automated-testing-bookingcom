package com.epam.likhanau.api;


import com.epam.likhanau.data.NearAirportSearchData;
import com.epam.likhanau.data.SearchHotelData;

import java.util.ArrayList;
import java.util.List;


public class DataAccessHelper {

    public static List<SearchHotelData> getCheckCertainСountOfAvailableHotelsData() {
        // TODO Rewrite, add upload from file
        List<SearchHotelData> data = new ArrayList<>();

        SearchHotelData data1 = new SearchHotelData();
        data1.setCityDir("Рига");
        data1.setCheckOut("1526774400000");
        data1.setAdultsNumber(7);
        data1.setChildrenNumber(4);
        data1.setRoomsNumber(2);
        data1.setMinResultList(5);
        data.add(data1);

        SearchHotelData data2 = new SearchHotelData();
        data2.setCityDir("Мадрид");
        data2.setMinResultList(5);
        data.add(data2);

        SearchHotelData data3 = new SearchHotelData();
        data3.setCityDir("Вена");
        data3.setCheckOut("1526774400000");
        data3.setMinResultList(5);
        data.add(data3);

        SearchHotelData data4 = new SearchHotelData();
        data4.setCityDir("Киев");
        data4.setCheckOut("1526774400000");
        data4.setMinResultList(5);
        data.add(data4);

        SearchHotelData data5 = new SearchHotelData();
        data5.setCityDir("Минск");
        data5.setCheckOut("1526774400000");
        data5.setAdultsNumber(7);
        data5.setMinResultList(5);
        data.add(data5);

        SearchHotelData data6 = new SearchHotelData();
        data6.setCityDir("Берлин");
        data6.setCheckOut("1526774400000");
        data6.setAdultsNumber(7);
        data6.setChildrenNumber(3);
        data6.setMinResultList(5);
        data.add(data6);

        SearchHotelData data7 = new SearchHotelData();
        data7.setCityDir("Токио");
        data7.setAdultsNumber(7);
        data7.setRoomsNumber(4);
        data7.setMinResultList(5);
        data.add(data7);

        return data;
    }

    public static List<NearAirportSearchData> getNearMinskAirportSearchData() {

        List<NearAirportSearchData> data = new ArrayList<>();
        NearAirportSearchData data1 = new NearAirportSearchData();
        data1.setCheckIn(1525132800000l);
        data1.setMinResultList(3);
        data.add(data1);
        return data;
    }
}