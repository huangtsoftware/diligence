/**
 * Copyright 2017 bejson.com
 */
package org.thframework.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2017-04-15 11:25:48
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class WeatherInfoData {

    @JSONField(name = "HeWeather5")
    private List<Heweather5> heweather5;

    public void setHeweather5(List<Heweather5> heweather5) {
        this.heweather5 = heweather5;
    }

    public List<Heweather5> getHeweather5() {
        return heweather5;
    }

}