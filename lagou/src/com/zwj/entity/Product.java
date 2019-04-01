package com.zwj.entity;

public class Product {
    private String  pasters;
    private String name;
    private String address;
    private String Introduction;

    public Product() {

    }

    public Product(String pasters, String name, String address, String Introduction) {
        this.pasters = pasters;
        this.name = name;
        this.address = address;
        this.Introduction = Introduction;
    }


    public String getPasters() {
        return pasters;
    }

    public void setPasters(String pasters) {
        this.pasters = pasters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }
}

