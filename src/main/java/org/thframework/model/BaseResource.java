package org.thframework.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_base_resources")
public class BaseResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "poi_id")
    private Integer poiId;

    @Column(name = "parent_poi_id")
    private Integer parentPoiId;

    @Column(name = "special_parent_poi_id")
    private Integer specialParentPoiId;

    @Column(name = "continent_id")
    private Integer continentId;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "region_id")
    private Integer regionalId;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "province_id")
    private Integer provinceId;

    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "name")
    private String name;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "spell")
    private String spell;

    @Column(name = "short_spell")
    private String shortSpell;

    @Column(name = "iata_code")
    private String iataCode;

    @Column(name = "iata_code_three")
    private String iataCodeThree;

    @Column(name = "iata_code_four")
    private String iataCodeFour;

    @Column(name = "time_zone")
    private String timeZone;

    @Column(name = "hot_flag")
    private Integer hotFlag;

    @Column(name = "airport_flag")
    private Integer airportFlag;

    @Column(name = "international")
    private Integer international;

    @Column(name = "type")
    private Integer type;

    @Column(name = "status")
    private Integer status;

    @Column(name = "b_lon")
    private Double bLon;

    @Column(name = "b_lat")
    private Double bLat;

    @Column(name = "g_lon")
    private Double gLon;

    @Column(name = "g_lat")
    private Double gLat;

    @Column(name = "city_airport_ids")
    private String cityAirportIds;

    @Column(name = "approach_airport_ids")
    private String approachAirportIds;

    @Column(name = "share_airport_ids")
    private String shareAirportIds;

    @Column(name = "tempetature")
    private Integer temperature;

    @Column(name = "add_uid")
    private Integer addUid;

    @Column(name = "add_name")
    private String addName;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_uid")
    private Integer updateUid;

    @Column(name = "update_name")
    private String updateName;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "del_flag")
    private Integer delFlag;

    @Column(name = "parent_tree_json")
    private String parentTreeJson;

    @Column(name = "city_airport_json")
    private String cityAirportJson;

    @Column(name = "approach_airport_json")
    private String approachAirportJson;

    @Column(name = "share_airport_json")
    private String shareAirportJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public Integer getParentPoiId() {
        return parentPoiId;
    }

    public void setParentPoiId(Integer parentPoiId) {
        this.parentPoiId = parentPoiId;
    }

    public Integer getSpecialParentPoiId() {
        return specialParentPoiId;
    }

    public void setSpecialParentPoiId(Integer specialParentPoiId) {
        this.specialParentPoiId = specialParentPoiId;
    }

    public Integer getContinentId() {
        return continentId;
    }

    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getRegionalId() {
        return regionalId;
    }

    public void setRegionalId(Integer regionalId) {
        this.regionalId = regionalId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getShortSpell() {
        return shortSpell;
    }

    public void setShortSpell(String shortSpell) {
        this.shortSpell = shortSpell == null ? null : shortSpell.trim();
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode == null ? null : iataCode.trim();
    }

    public String getIataCodeThree() {
        return iataCodeThree;
    }

    public void setIataCodeThree(String iataCodeThree) {
        this.iataCodeThree = iataCodeThree == null ? null : iataCodeThree.trim();
    }

    public String getIataCodeFour() {
        return iataCodeFour;
    }

    public void setIataCodeFour(String iataCodeFour) {
        this.iataCodeFour = iataCodeFour == null ? null : iataCodeFour.trim();
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCityAirportIds() {
        return cityAirportIds;
    }

    public void setCityAirportIds(String cityAirportIds) {
        this.cityAirportIds = cityAirportIds == null ? null : cityAirportIds.trim();
    }

    public String getApproachAirportIds() {
        return approachAirportIds;
    }

    public void setApproachAirportIds(String approachAirportIds) {
        this.approachAirportIds = approachAirportIds == null ? null : approachAirportIds.trim();
    }

    public Integer getHotFlag() {
        return hotFlag;
    }

    public void setHotFlag(Integer hotFlag) {
        this.hotFlag = hotFlag;
    }

    public String getShareAirportIds() {
        return shareAirportIds;
    }

    public void setShareAirportIds(String shareAirportIds) {
        this.shareAirportIds = shareAirportIds == null ? null : shareAirportIds.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getAddUid() {
        return addUid;
    }

    public void setAddUid(Integer addUid) {
        this.addUid = addUid;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName == null ? null : addName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getParentTreeJson() {
        return parentTreeJson;
    }

    public void setParentTreeJson(String parentTreeJson) {
        this.parentTreeJson = parentTreeJson == null ? null : parentTreeJson.trim();
    }

    public String getCityAirportJson() {
        return cityAirportJson;
    }

    public void setCityAirportJson(String cityAirportJson) {
        this.cityAirportJson = cityAirportJson == null ? null : cityAirportJson.trim();
    }

    public String getApproachAirportJson() {
        return approachAirportJson;
    }

    public void setApproachAirportJson(String approachAirportJson) {
        this.approachAirportJson = approachAirportJson == null ? null : approachAirportJson.trim();
    }

    public String getShareAirportJson() {
        return shareAirportJson;
    }

    public void setShareAirportJson(String shareAirportJson) {
        this.shareAirportJson = shareAirportJson == null ? null : shareAirportJson.trim();
    }

    public Integer getAirportFlag() {
        return airportFlag;
    }

    public void setAirportFlag(Integer airportFlag) {
        this.airportFlag = airportFlag;
    }

    public Integer getInternational() {
        return international;
    }

    public void setInternational(Integer international) {
        this.international = international;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getbLon() {
        return bLon;
    }

    public void setbLon(Double bLon) {
        this.bLon = bLon;
    }

    public Double getbLat() {
        return bLat;
    }

    public void setbLat(Double bLat) {
        this.bLat = bLat;
    }

    public Double getgLon() {
        return gLon;
    }

    public void setgLon(Double gLon) {
        this.gLon = gLon;
    }

    public Double getgLat() {
        return gLat;
    }

    public void setgLat(Double gLat) {
        this.gLat = gLat;
    }


}