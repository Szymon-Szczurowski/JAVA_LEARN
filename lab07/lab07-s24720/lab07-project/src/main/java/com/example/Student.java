package com.example;

import java.time.LocalDate;

public class Student extends PersonBase{

    String indexNumber;


    public Student(String janeczek, String kowalski, LocalDate of, Gender male) {
        this.name = janeczek;
        this.surname = kowalski;
        this.dateOfBirth = of;
        this.gender = male;
    }


    public String getIndex() {
        return indexNumber;
    }

    public void setIndex(String indexNumber) {
        this.indexNumber = indexNumber;
    }
    @Override
    public void printPersonDetails() {
    super.printPersonDetails();
        System.out.println(this.getIndex());
    }
}
