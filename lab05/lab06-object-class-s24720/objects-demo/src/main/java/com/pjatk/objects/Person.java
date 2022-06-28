package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {
     int id;
     String Name;
     LocalDate DateOfBirth;

     ArrayList<Address> addresses = new ArrayList<>();

    public Person(int id,
                  String name,
                  LocalDate  DateOfBirth) {

        this.id= id;
        this.Name = name;
        this.DateOfBirth = DateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int ID)
    {
        this.id = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public LocalDate getDateOfBirth()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.DateOfBirth = dateOfBirth;
    }

    /*
    Twoim zadaniem jest zaimplementowanie mechanizmu, który pozwoli na porównywanie ze sobą obiektów klas Person oraz Address


Dwa obiekty uznajemy za takie same gdy:

wszystkie wartości pól w obiektach są takie same
jeżeli pole jest referencją do innego obiektu lub kolekcji obiektów (klasa Person będzie miała referencję do ArrayListy obiektów klasy Address) to
wartości pól w referencjach także powinny być równe (tj. pola w poszczególnych adresach)
W przeciwnym przypadku obiekty są różne.

Aby rozwiązać to zadanie należy nadpisać metody equals hashCode toString, które klasa dziedziczy po klasie Object

Warto wykorzystać klasę StringBuilder w implementacji metody toString
   */

    public Person copy() {
        var copy = new  Person(this.id, this.Name, this.DateOfBirth);
        if (addresses.size() <= 0) {
            return copy;
        }
        copy.addresses = this.addresses;
        return copy;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString(){
        return "("+id+", "+Name+", "+DateOfBirth+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(Name, person.Name) && Objects.equals(DateOfBirth, person.DateOfBirth) && Objects.equals(addresses, person.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, DateOfBirth, addresses);
    }
}
