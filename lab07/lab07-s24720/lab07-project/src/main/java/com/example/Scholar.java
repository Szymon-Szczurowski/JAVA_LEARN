package com.example;

import java.time.LocalDate;

public class Scholar extends Student{
    String indexNumber;
    double scholarship;

    public Scholar(String fryderyk, String nowak, LocalDate of, Gender male) {
        super(fryderyk, nowak, of, male);
    }

    public String getIndex() {
        return indexNumber;
    }

    public void setIndex(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    @Override
    public void printPersonDetails() {
        super.printPersonDetails();
        System.out.println(this.getScholarship());
    }
}
