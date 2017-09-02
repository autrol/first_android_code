package com.example.coolweather.gson;

/**
 * Created by yangzhinian on 2017/9/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
