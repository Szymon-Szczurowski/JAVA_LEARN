package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class SearchSettings {
    LocalDate DateFrom;
    int MilleageTo;
    double PriceFrom;
    double PriceTo;
    String World;
    int YearFrom;

    public void setDateFrom(LocalDate date) {
        this.DateFrom = date;
    }

    public void setMilleageTo(int MilleageTo) {
        this.MilleageTo = MilleageTo;
    }

    public void setPriceFrom(double PriceFrom) {
        this.PriceFrom = PriceFrom;
    }

    public void setPriceTo(double PriceTo) {
        this.PriceTo = PriceTo;
    }

    public void setWord(String World) {
        this.World = World;
    }

    public void setYearFrom(int YearFrom) {
        this.YearFrom = YearFrom;
    }

    public LocalDate getDateFrom() {
        return DateFrom;
    }

    public int getMilleageTo() {
        return MilleageTo;
    }

    public double getPriceFrom() {
        return PriceFrom;
    }

    public double getPriceTo() {
        return PriceTo;
    }

    public String getWorld() {
        return World;
    }

    public int getYearFrom() {
        return YearFrom;
    }
}
