package com.zwj.entity;

public class Team {
    private String founder;
    private String position;
    private String weibo;
    private String Introduction;

    public Team() {

    }

    public Team(String founder, String position, String weibo,String Introduction) {
        this.founder = founder;
        this.position = position;
        this.weibo = weibo;
        this.Introduction = Introduction;
    }
    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }
}
