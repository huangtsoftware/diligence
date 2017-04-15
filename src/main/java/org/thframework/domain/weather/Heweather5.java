/**
 * Copyright 2017 bejson.com
 */
package org.thframework.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2017-04-15 11:26:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Heweather5 {

    private List<Alarms> alarms;
    private Aqi aqi;
    private Basic basic;
    @JSONField(name = "daily_forecast")
    private List<DailyForecast> dailyForecast;
    @JSONField(name = "hourly_forecast")
    private List<HourlyForecast> hourlyForecast;
    private Now now;
    private String status;
    private Suggestion suggestion;

    public void setAlarms(List<Alarms> alarms) {
        this.alarms = alarms;
    }

    public List<Alarms> getAlarms() {
        return alarms;
    }

    public void setAqi(Aqi aqi) {
        this.aqi = aqi;
    }

    public Aqi getAqi() {
        return aqi;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setDailyForecast(List<DailyForecast> dailyForecast) {
        this.dailyForecast = dailyForecast;
    }

    public List<DailyForecast> getDailyForecast() {
        return dailyForecast;
    }

    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }

    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public Now getNow() {
        return now;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

}