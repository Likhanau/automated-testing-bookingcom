package com.epam.likhanau.data;

import java.util.Objects;

public class NearAirportSearchData {
    private Integer minResultList;
    private Long checkIn;

    public NearAirportSearchData() {
    }

    public Integer getMinResultList() {
        return minResultList;
    }

    public void setMinResultList(Integer minResultList) {
        this.minResultList = minResultList;
    }

    public Long getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Long checkIn) {
        this.checkIn = checkIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NearAirportSearchData that = (NearAirportSearchData) o;
        return Objects.equals(minResultList, that.minResultList) &&
                Objects.equals(checkIn, that.checkIn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(minResultList, checkIn);
    }

    @Override
    public String toString() {
        return "NearAirportSearchData{" +
                "minResultList=" + minResultList +
                ", checkIn=" + checkIn +
                '}';
    }
}
