package org.example.nivell3.exercici1;

import java.util.Comparator;

public class CompareByDNI implements Comparator<Person> {
    @Override
    public int compare(Person person, Person anotherPerson) {
        return person.getDNI().compareTo(anotherPerson.getDNI());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
