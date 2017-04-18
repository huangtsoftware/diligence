/**
  * Copyright 2017 bejson.com 
  */
package org.thframework.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_cityinfo")
public class CityInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JSONField(serialize = false, deserialize = false)
    private Integer id;

    @Column(name = "code")
    @JSONField(name="id")
    private String code;

    @Column(name = "city_en")
    @JSONField(name="cityEn")
    private String cityen;

    @Column(name = "city_zh")
    @JSONField(name="cityZh")
    private String cityzh;

    @Column(name = "country_code")
    @JSONField(name="countryCode")
    private String countrycode;

    @Column(name = "country_en")
    @JSONField(name="countryEn")
    private String countryen;

    @Column(name = "country_zh")
    @JSONField(name="countryZh")
    private String countryzh;

    @Column(name = "province_en")
    @JSONField(name="provinceEn")
    private String provinceen;

    @Column(name = "province_zh")
    @JSONField(name="provinceZh")
    private String provincezh;

    @Column(name = "leader_en")
    @JSONField(name="leaderEn")
    private String leaderen;

    @Column(name = "leader_zh")
    @JSONField(name="leaderZh")
    private String leaderzh;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lon")
    private Double lon;

    @Column(name = "add_time", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date addTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;

    @PrePersist
    public void onCreate() {
        updateTime = addTime = new Date();
    }

    @PreUpdate
    public void onUpdate() {
        updateTime = new Date();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCityen() {
        return cityen;
    }

    public void setCityen(String cityen) {
        this.cityen = cityen;
    }

    public String getCityzh() {
        return cityzh;
    }

    public void setCityzh(String cityzh) {
        this.cityzh = cityzh;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountryen() {
        return countryen;
    }

    public void setCountryen(String countryen) {
        this.countryen = countryen;
    }

    public String getCountryzh() {
        return countryzh;
    }

    public void setCountryzh(String countryzh) {
        this.countryzh = countryzh;
    }

    public String getProvinceen() {
        return provinceen;
    }

    public void setProvinceen(String provinceen) {
        this.provinceen = provinceen;
    }

    public String getProvincezh() {
        return provincezh;
    }

    public void setProvincezh(String provincezh) {
        this.provincezh = provincezh;
    }

    public String getLeaderen() {
        return leaderen;
    }

    public void setLeaderen(String leaderen) {
        this.leaderen = leaderen;
    }

    public String getLeaderzh() {
        return leaderzh;
    }

    public void setLeaderzh(String leaderzh) {
        this.leaderzh = leaderzh;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }


    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}