package com.jetictors.example.mybatis.model;

/**
 * Desc           :  城市实体类对象
 * Author         :  Jetictors
 * Time           :  2019/8/6 14:12
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class City {

    private long cityId;

    private long provinceId;

    private String cityName;

    private String description;

    public City(){}

    public City(long cityId, long provinceId, String cityName, String description) {
        this.cityId = cityId;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", provinceId=" + provinceId +
                ", cityName='" + cityName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
