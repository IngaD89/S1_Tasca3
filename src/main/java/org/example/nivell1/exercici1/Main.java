package org.example.nivell1.exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        HashSet<Month> monthHashSet = new HashSet<>();

        Month january = new Month("Enero");
        Month february = new Month("Febrero");
        Month march = new Month("Marzo");
        Month april = new Month("Abril");
        Month may = new Month("Mayo");
        Month june = new Month("Junio");
        Month july = new Month("Julio");
        Month september = new Month("Septiembre");
        Month october = new Month("Octubre");
        Month november = new Month("Noviembre");
        Month december = new Month("Diciembre");


        months.add(january);
        months.add(february);
        months.add(march);
        months.add(april);
        months.add(may);
        months.add(june);
        months.add(july);
        months.add(september);
        months.add(october);
        months.add(november);
        months.add(december);

        System.out.println("Meses sin agosto\n");

        for(Month month : months){
            System.out.println(month);
        }

        months.add(7, new Month("Agosto"));

        System.out.println("\nMeses completos\n");
        for(Month month : months){
            System.out.println(month);
        }

        monthHashSet.add(january);
        monthHashSet.add(february);
        monthHashSet.add(march);
        monthHashSet.add(april);
        monthHashSet.add(may);
        monthHashSet.add(june);
        monthHashSet.add(july);
        monthHashSet.add(september);
        monthHashSet.add(october);
        monthHashSet.add(november);
        monthHashSet.add(december);
        monthHashSet.add(new Month("Diciembre"));

        System.out.println("\nMonth hash set\n");
        for (Month month : monthHashSet){
            System.out.println(month);
        }

        System.out.println("\nLista de meses iteración\n");

        Iterator<Month> it = months.iterator();
        Iterator<Month> itHasSet = monthHashSet.iterator();

        while (it.hasNext()){
        System.out.println(it.next());
        }

        System.out.println("\nIteración de hash set\n");

        while (itHasSet.hasNext()){
            System.out.println(itHasSet.next());
        }
    }
}