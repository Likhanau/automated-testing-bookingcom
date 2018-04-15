package com.epam.likhanau.data;

import java.util.Objects;

public class NearAirportSearchData {
    private Integer minResultList;
    private Long dateFrom;

    public NearAirportSearchData() {
    }

    public Integer getMinResultList() {
        return minResultList;
    }

    public void setMinResultList(Integer minResultList) {
        this.minResultList = minResultList;
    }

    public Long getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Long dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NearAirportSearchData that = (NearAirportSearchData) o;
        return Objects.equals(minResultList, that.minResultList) &&
                Objects.equals(dateFrom, that.dateFrom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(minResultList, dateFrom);
    }

    @Override
    public String toString() {
        return "NearAirportSearchData{" +
                "minResultList=" + minResultList +
                ", dateFrom=" + dateFrom +
                '}';
    }
}
