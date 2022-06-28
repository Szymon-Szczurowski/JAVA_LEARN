package com.example;

import java.time.LocalDate;

public class Lecturer extends PersonBase{
    String title;

    public Lecturer(String ania, String nowak, LocalDate of, Gender female) {
        this.name =ania;
        this.surname = nowak;
        this.dateOfBirth = of;
        this.gender = female;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void printPersonDetails() {
        super.printPersonDetails();
        System.out.println(this.getTitle());
    }
}
