package org.example.nivell2.exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Restaurnate 1", 8);
        Restaurant restaurant2 = new Restaurant("Restaurnate 1", 7);

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);

        System.out.println(restaurants);
    }
}
