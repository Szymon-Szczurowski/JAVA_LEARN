package com.example;

import java.time.LocalDate;

public class CarOffer {

     int milleage;
     int year;
     LocalDate date;
     String title;
     double price;

    public CarOffer(int milleage, int year, LocalDate date, String title, double price) {
        this.milleage = milleage;
        this.year = year;
        this.date = date;
        this.title = title;
        this.price = price;
    }

    public int getMilleage() {
        return milleage;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

}
