package com.zwj.entity;

public class Users {
    private String purpose;
    private String email;
    private String password;

    public Users() {

    }
    public Users( String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(String purpose, String email, String password) {
        this.purpose = purpose;
        this.email = email;
        this.password = password;
    }

    public String getPurpose() {

        return purpose;
    }

    public void setPurpose(String purpose) {

        this.purpose = purpose;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
