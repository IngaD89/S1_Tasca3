package org.example.nivell2.exercici2;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Restaurant_1 restaurant1 = new Restaurant_1("Restaurnate 1", 8);
        Restaurant_1 restaurant2 = new Restaurant_1("Restaurnate 1", 7);
        Restaurant_1 restaurant3 = new Restaurant_1("Restaurnate 2", 3);
        Restaurant_1 restaurant4 = new Restaurant_1("Restaurnate 3", 9);

        HashSet<Restaurant_1> restaurants = new HashSet<>();
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);

        System.out.println("Hash set restaurants");
        System.out.println(restaurants);

        TreeSet<Restaurant_1> restaurantsTreeSet = new TreeSet<>(restaurants);

        System.out.println("Tree Set restaurants");

        System.out.println(restaurantsTreeSet.descendingSet());
    }
}
