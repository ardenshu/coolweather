package com.coolweather.data.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by zbh on 2017/11/6.
 * Version: 1.0
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
