package org.example.nivell3.exercici1;

public class Person {
    private String name;
    private String lastName;
    private String DNI;

    public Person(String[] data) {
        this.name = data[0];
        this.lastName = data[1];
        this.DNI = data[2];
    }

    public Person(String name, String lastName, String DNI) {
        this.name = name;
        this.lastName = lastName;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return String.format(" %-15s  %-20s  %-20s ", this.name, this.lastName, this.DNI);
    }


    public String toCSV() {
        return String.join(",", this.name, this.lastName, this.DNI);
    }

}
