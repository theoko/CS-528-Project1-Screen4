package com.tkonstantopoulos.weatherviewer.data;

public class WeatherItem {
    String day;
    String msgForDay;
    String header;

    int low;
    int high;
    int humidity;

    public WeatherItem(String day, String msgForDay, int low, int high, int humidity) {
        this.day = day;
        this.msgForDay = msgForDay;
        this.low = low;
        this.high = high;
        this.humidity = humidity;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMsgForDay() {
        return msgForDay;
    }

    public void setMsgForDay(String msgForDay) {
        this.msgForDay = msgForDay;
    }

    public String getHeader() {
        return day + ": " + msgForDay;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
