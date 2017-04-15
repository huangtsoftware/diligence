/**
 * Copyright 2017 bejson.com
 */
package org.thframework.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2017-04-15 11:25:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Dog {

    private String name;
    private String breed;
    private int count;
    @JSONField(name = "twoFeet")
    private boolean twofeet;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setTwofeet(boolean twofeet) {
        this.twofeet = twofeet;
    }

    public boolean getTwofeet() {
        return twofeet;
    }

}