package org.example.nivell1.exercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> inverseNumbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Lista inicial de numeros\n");
        System.out.println(numbers);

        ListIterator<Integer> it = numbers.listIterator(numbers.size());

        while (it.hasPrevious()) {
            inverseNumbers.add(it.previous());
        }
        System.out.println("\nLista reversa\n");
        System.out.println(inverseNumbers);
    }
}
