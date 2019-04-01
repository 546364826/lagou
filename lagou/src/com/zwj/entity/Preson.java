package com.zwj.entity;

public class Preson {
    private String loginemail;
    private String name;
    private String sex;
    private String degree;
    private String hands;
    private String phone;
    private String email;
    private String idea;
    private String headpic;


    public Preson() {

    }

    public Preson(String loginemail) {
        this.loginemail = loginemail;
    }

    public Preson(String loginemail,String name, String sex, String degree, String hands,
                  String phone, String email, String idea, String headpic) {
        this.loginemail=loginemail;
        this.name = name;
        this.sex = sex;
        this.degree = degree;
        this.hands = hands;
        this.phone = phone;
        this.email = email;
        this.idea = idea;
        this.headpic = headpic;
    }

    public String getLoginemail() {
        return loginemail;
    }

    public void setLoginemail(String loginemail) {
        this.loginemail = loginemail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }
    public String getHeadpic() {
        return headpic;
    }

    public void setheadpic(String work) {
        this.headpic = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
