package com.epam.likhanau.data;


import java.util.Objects;

public class SearchHotelData {
    private Integer minResultList;
    private String cityDir;
    private String checkIn;
    private String checkOut;
    private Integer adultsNumber;
    private Integer childrenNumber;
    private Integer roomsNumber;


    public SearchHotelData() {
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

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getAdultsNumber() {
        return adultsNumber;
    }

    public void setAdultsNumber(Integer adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public Integer getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchHotelData that = (SearchHotelData) o;
        return Objects.equals(minResultList, that.minResultList) &&
                Objects.equals(cityDir, that.cityDir) &&
                Objects.equals(checkIn, that.checkIn) &&
                Objects.equals(checkOut, that.checkOut) &&
                Objects.equals(adultsNumber, that.adultsNumber) &&
                Objects.equals(childrenNumber, that.childrenNumber) &&
                Objects.equals(roomsNumber, that.roomsNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minResultList, cityDir, checkIn, checkOut, adultsNumber, childrenNumber, roomsNumber);
    }

    @Override
    public String toString() {
        return "SearchHotelData{" +
                "minResultList=" + minResultList +
                ", cityDir='" + cityDir + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", adultsNumber=" + adultsNumber +
                ", childrenNumber=" + childrenNumber +
                ", roomsNumber=" + roomsNumber +
                '}';
    }
}
