package com.company;

import java.util.Date;

public class Customers {
    private String customerName;
    private String city;
    private Date birthDate;
    private String district;
    private String gender;
    private String nationality;
    private int age;

    public Customers(String customername, String city, Date birthdate, String district, String gender, String nationality, int age) {
        this.customerName = customername;
        this.city = city;
        this.birthDate = birthdate;
        this.district = district;
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
    }
}
