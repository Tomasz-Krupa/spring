package org.example.task5;

public class Car {
    int year;
    String name;

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
