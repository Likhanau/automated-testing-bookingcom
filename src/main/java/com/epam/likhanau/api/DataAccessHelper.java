package com.epam.likhanau.api;


import com.epam.likhanau.data.SearchHotelData;
import com.epam.likhanau.data.NearAirportSearchData;

import java.util.ArrayList;
import java.util.List;


public class DataAccessHelper {

    public static List<SearchHotelData> getCheckCertainСountOfAvailableHotelsData() {

        // TODO Переписать, добавить выгрузку из файла
        List<SearchHotelData> data = new ArrayList<>();

        SearchHotelData data1 = new SearchHotelData();
        data1.setCityDir("Рига");
        data1.setDateFrom(1525132800000l);
        data1.setMinResultList(5);
        data.add(data1);

        SearchHotelData data2 = new SearchHotelData();
        data2.setCityDir("Мадрид");
        data2.setDateFrom(1526688000000l);
        data2.setMinResultList(10);
        data.add(data2);


        SearchHotelData data3 = new SearchHotelData();
        data3.setCityDir("Вена");
        data3.setDateFrom(1526688000000l);
        data3.setMinResultList(7);
        data.add(data3);

        return data;

    }

    public static List<NearAirportSearchData> getNearAirportSearchData() {

        List<NearAirportSearchData> data = new ArrayList<>();

        NearAirportSearchData data1 = new NearAirportSearchData();
        data1.setDateFrom(1525132800000l);
        data1.setMinResultList(3);
        data.add(data1);

        return data;
    }
}