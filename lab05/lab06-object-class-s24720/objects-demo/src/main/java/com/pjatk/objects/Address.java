package com.pjatk.objects;

import java.util.ArrayList;

public class Address {

          int id;
          String postalCode;
          String city;
          ArrayList<String> AddressLines= new ArrayList<>();

          public ArrayList<String> getAddressLines() {
            return AddressLines;
        }

    public Address(int id,
                   String city,
                   String postalCode) {

        this.id = id;
        this.postalCode = postalCode;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", AddressLines=" + AddressLines +
                '}';
    }
}
