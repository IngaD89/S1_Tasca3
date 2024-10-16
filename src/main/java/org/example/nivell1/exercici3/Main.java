package org.example.nivell1.exercici3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> countriesMap = new HashMap<>();
        HashMap<String, Integer> userScoreMap = new HashMap<>();
        Random random = new Random();

        String name = "";
        String randomCountry = "";
        String response = "";

        try (FileReader reader = new FileReader("src/main/resources/countries.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] pairs = line.split(" ");
                countriesMap.put(pairs[0], pairs[1]);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }


        System.out.println("Introduce tu nombre");
        name = scanner.nextLine();

        User user = new User(name);

        ArrayList<String> keyList = new ArrayList<>(countriesMap.keySet());

        for (int i = 0; i < 10; i++) {
            randomCountry = keyList.get(random.nextInt(keyList.size()));
            System.out.println("Adivina capital de " + randomCountry);
            response = scanner.nextLine();

            if (response.equalsIgnoreCase(countriesMap.get(randomCountry))) {
                user.setScore(user.getScore() + 1);
            }
            userScoreMap.put(user.getName(), user.getScore());
            System.out.println(userScoreMap);
        }

        try (FileWriter fileWriter = new FileWriter(new File("src/main/resources/clasificacio.txt"))) {

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(userScoreMap));
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("File path not found");
        }
    }
}
