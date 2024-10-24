package org.example.nivell3.exercici1;

import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonFileHandler personFileHandler = new PersonFileHandler();

    public void showMenu() {
        int option;

        do {
            System.out.println("""
                1. Introduir persona.
                2. Mostrar les persones ordenades per nom (A-Z).
                3. Mostrar les persones ordenades per nom (Z-A).
                4. Mostrar les persones ordenades per cognoms (A-Z).
                5. Mostrar les persones ordenades per cognoms (Z-A).
                6. Mostrar les persones ordenades per DNI (1-9).
                7. Mostrar les persones ordenades per DNI (9-1).
                0. Sortir.
            """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Adeu");
                    break;
                case 1:
                    personFileHandler.addPerson(createPerson());
                    break;
                case 2:
                    personFileHandler.showPersonsOrdered(new CompareByName());
                    break;
                case 3:
                    personFileHandler.showPersonsOrdered(new CompareByName().reversed());
                    break;
                case 4:
                    personFileHandler.showPersonsOrdered(new CompareByLastName());
                    break;
                case 5:
                    personFileHandler.showPersonsOrdered(new CompareByLastName().reversed());
                    break;
                case 6:
                    personFileHandler.showPersonsOrdered(new CompareByDNI());
                    break;
                case 7:
                    personFileHandler.showPersonsOrdered(new CompareByDNI().reversed());
                    break;
                default:
                    System.out.println("Escoge una opción válida");
            }

        } while (option != 0);
    }

    private Person createPerson() {
        System.out.println("Introduce nombre de persona:");
        String name = scanner.nextLine();
        System.out.println("Introduce apellido de persona:");
        String lastName = scanner.nextLine();
        System.out.println("Introduce DNI de persona:");
        String dni = scanner.nextLine();

        return new Person(name, lastName, dni);
    }

}
