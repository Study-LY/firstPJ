package com.example.firstPJ.Domain;

public class Member {

    private String user_ID;
    private String user_PW1;
    private String user_PW2;
    private String user_name;
    private String year;
    private String month;
    private String day;
    private String gender;
    private String user_phone;

    public Member(String user_ID, String user_PW1, String user_PW2, String user_name, String year, String month, String day, String gender, String user_phone){
        this.user_ID = user_ID;
        this.user_PW1 = user_PW1;
        this.user_PW2 = user_PW2;
        this.user_name = user_name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.gender = gender;
        this.user_phone = user_phone;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_PW1() {
        return user_PW1;
    }

    public void setUser_PW1(String user_PW1) {
        this.user_PW1 = user_PW1;
    }

    public String getUser_PW2() {
        return user_PW2;
    }

    public void setUser_PW2(String user_PW2) {
        this.user_PW2 = user_PW2;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }
}