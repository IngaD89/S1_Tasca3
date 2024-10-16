package org.example.nivell2.exercici1;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (score != that.score) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + score;
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
