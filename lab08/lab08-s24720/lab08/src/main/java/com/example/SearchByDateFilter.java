package com.example;

import java.util.ArrayList;
import java.util.List;

public class
SearchByDateFilter {

    List<CarOffer> cars;

    SearchSettings searchSettings;

    public void setCarOffers(List<CarOffer> cars) {
        this.cars = cars;
    }

    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    public boolean canFilter() {
        return searchSettings.getDateFrom() != null;
    }

    public List<CarOffer> filter() {
        List<CarOffer> auto = new ArrayList<>();
        for (int i = 0, carsSize = cars.size(); i < carsSize; i++) {
            CarOffer car = cars.get(i);
            if (car.getDate().isAfter(searchSettings.getDateFrom())) {
                auto.add(car);
            }
        }
        return auto;
    }
}
