package org.thframework.service;

import org.thframework.domain.weather.WeatherInfoData;

/**
 * Created on 2017/4/15.
 */
public interface WeatherInfoService {

    WeatherInfoData getWeatherInfoData(String city);
}
