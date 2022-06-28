package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchByWordFilter {

    List<CarOffer> cars;

    SearchSettings searchSettings;

    public void setCarOffers(List<CarOffer> cars) {
        this.cars = cars;
    }

    public void setSearchSettings(SearchSettings searchSettings) {
        this.searchSettings = searchSettings;
    }

    public boolean canFilter() {
        return searchSettings.getWorld() != null;
    }

    public List<CarOffer> filter() {
        List<CarOffer> auto = new ArrayList<>();
        for (int i = 0, carsSize = cars.size(); i < carsSize; i++) {
            CarOffer car = cars.get(i);
            if (car.getTitle().contains(searchSettings.getWorld())) {
                auto.add(car);
            }
        }
        return auto;
    }
}
