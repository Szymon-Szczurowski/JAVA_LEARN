package com.pjatk.pesel.model;

import java.time.LocalDate;

public class Person {
    String getGender;
    String peselNumber;
    String name;
    String surname;
    LocalDate DateOfBirth;

    public Person(String peselNumber) {
        this.peselNumber = peselNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPeselNumber() {
        return peselNumber;
    }

    public String getGender() {
        if((Byte.parseByte(peselNumber.substring(9, 10)) % 2) == 0) {
            return "Female";
        } else {
            return "Male";
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String lastName) {
        this.surname = lastName;
    }


    public LocalDate getDateOfBirth() {

        int year = Integer.parseInt((peselNumber.substring(0, 2)));
        int month = Integer.parseInt((peselNumber.substring(2, 4)));
        int day=Integer.parseInt((peselNumber.substring(4, 6)));
        if (month > 0 && month < 13) {
            year += 1900;
        } else if (month > 20 && month < 33) {
            year += 2000;
            month-=20;
        } else if (month > 40 && month < 53) {
            year += 2100;
            month-=40;
        } else if (month > 60 && month < 73) {
            year += 2200;
            month-=60;
        }

        DateOfBirth = LocalDate.of(year, month, day);
        return DateOfBirth;
    }
}
