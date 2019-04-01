package com.zwj.entity;

public class Company {
    private String fullname;
    private String name;
    private String website;
    private String chinacity;
    private String Industry;
    private String csize;
    private String phase;
    private String temptation;

    public Company() {

    }


    public Company(String name) {
        this.name = name;
    }

    public Company(String fullname, String name, String website, String chinacity,
                   String Industry, String csize, String phase, String temptation) {
        this.fullname = fullname;
        this.name = name;
        this.website = website;
        this.chinacity = chinacity;
        this.Industry = Industry;
        this.csize = csize;
        this.phase = phase;
        this.temptation = temptation;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getChinacity() {
        return chinacity;
    }

    public void setChinacity(String city) {
        this.chinacity = city;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public String getCsize() {
        return csize;
    }

    public void setCsize(String csize) {
        this.csize = csize;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getTemptation() {
        return temptation;
    }

    public void setTemptation(String temptation) {
        this.temptation = temptation;
    }


}
