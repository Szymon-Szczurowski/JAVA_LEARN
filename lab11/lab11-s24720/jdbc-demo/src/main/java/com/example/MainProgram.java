package com.example;

import java.util.List;

public class MainProgram {
    public static void main(String[] args) {

        Person Janusz = new Person();

        PersonRepository repository = new PersonRepository();

        repository.createTable();
        Janusz.setAge(30);
        Janusz.setSurname("Kowalski");
        Janusz.setName("Janusz");

        int result = repository.add(Janusz);
        Janusz.setName("Barabasz");

        Janusz.setId(4);

        repository.update(Janusz);
 //       repository.delete(Janusz);
        System.out.println(result);

        List<Person> people = repository.getAll();
        for (Person person: people){
            System.out.println(person.getId() + " " + person.getName() + " " +person.getSurname() + " " + person.getAge() );
        }
    }
}
