/**
  * Copyright 2017 bejson.com 
  */
package org.thframework.domain.weather;

/**
 * Auto-generated: 2017-04-15 11:26:3
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class HourlyForecast {

    private Cond cond;
    private String date;
    private String hum;
    private String pop;
    private String pres;
    private String tmp;
    private Wind wind;
    public void setCond(Cond cond) {
         this.cond = cond;
     }
     public Cond getCond() {
         return cond;
     }

    public void setDate(String date) {
         this.date = date;
     }
     public String getDate() {
         return date;
     }

    public void setHum(String hum) {
         this.hum = hum;
     }
     public String getHum() {
         return hum;
     }

    public void setPop(String pop) {
         this.pop = pop;
     }
     public String getPop() {
         return pop;
     }

    public void setPres(String pres) {
         this.pres = pres;
     }
     public String getPres() {
         return pres;
     }

    public void setTmp(String tmp) {
         this.tmp = tmp;
     }
     public String getTmp() {
         return tmp;
     }

    public void setWind(Wind wind) {
         this.wind = wind;
     }
     public Wind getWind() {
         return wind;
     }

}