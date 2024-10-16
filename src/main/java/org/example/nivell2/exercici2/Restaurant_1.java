package org.example.nivell2.exercici2;

public class Restaurant_1 implements Comparable<Restaurant_1> {
    private String name;
    private int score;

    public Restaurant_1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Restaurant_1 anotherRestaurant) {
        int compareValue = this.name.compareTo(anotherRestaurant.name);
        if (compareValue != 0) {
            return compareValue;
        }
        return Integer.compare(this.score, anotherRestaurant.score);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
