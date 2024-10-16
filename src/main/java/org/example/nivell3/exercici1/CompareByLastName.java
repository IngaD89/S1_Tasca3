package org.example.nivell3.exercici1;

import java.util.Comparator;

public class CompareByLastName implements Comparator<Person> {
    @Override
    public int compare(Person person, Person anotherPerson) {
        return person.getLastName().compareTo(anotherPerson.getLastName());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
