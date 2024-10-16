package org.example.nivell3.exercici1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonFileHandler {
    private static final String FILE_PATH = "src/main/resources/person.csv";

    public void addPerson(Person person) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bufferedWriter.append(person.toCSV());
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la persona: " + e.getMessage());
        }
    }

    public void showPersonsOrdered(Comparator<Person> comparator) {
        Set<Person> personList = new TreeSet<>(comparator);

        try (Reader reader = new FileReader(FILE_PATH); CSVReader csvReader = new CSVReader(reader)) {
            String[] data;
            while ((data = csvReader.readNext()) != null) {
                if (data.length == 3 && !data[0].isEmpty() && !data[1].isEmpty() && !data[2].isEmpty()) {
                    Person person = new Person(data);
                    personList.add(person);
                }
            }
            System.out.println("_Nombre_____________Apellido_______________DNI");
            personList.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat: " + e.getMessage());
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error llegint el fitxer: " + e.getMessage());
        }
    }
}
