package com.example;
import java.time.LocalDate;
abstract public class PersonBase {
    String name;
    String surname;
    LocalDate dateOfBirth;
    Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void printPersonDetails() {
        System.out.println(this.getName() + " " + this.getSurname() + " " + getDateOfBirth() + " " + this.getGender());
    }
}