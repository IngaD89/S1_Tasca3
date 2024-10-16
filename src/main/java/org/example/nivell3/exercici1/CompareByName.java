package org.example.nivell3.exercici1;

import java.util.Comparator;

public class CompareByName implements Comparator<Person> {

    @Override
    public int compare(Person person, Person anotherPerson) {
        return person.getName().compareTo(anotherPerson.getName());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
