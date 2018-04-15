package com.epam.likhanau.data;


import java.util.Objects;

public class CheckMoreThenHotelsData {
    private Integer minResultList;
    private String cityDir;
    private Long dateFrom;


    public CheckMoreThenHotelsData() {
    }

    public Integer getMinResultList() {
        return minResultList;
    }

    public void setMinResultList(Integer minResultList) {
        this.minResultList = minResultList;
    }

    public String getCityDir() {
        return cityDir;
    }

    public void setCityDir(String cityDir) {
        this.cityDir = cityDir;
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
        CheckMoreThenHotelsData that = (CheckMoreThenHotelsData) o;
        return Objects.equals(minResultList, that.minResultList) &&
                Objects.equals(cityDir, that.cityDir) &&
                Objects.equals(dateFrom, that.dateFrom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(minResultList, cityDir, dateFrom);
    }

    @Override
    public String toString() {
        return "CheckMoreThenHotelsData{" +
                "minResultList=" + minResultList +
                ", cityDir='" + cityDir + '\'' +
                ", dateFrom=" + dateFrom +
                '}';
    }
}
