package org.example.exercice5_api;

public class Car {

    private int id;
    private String brand;
    private int manufactureYear;
    private String color;

    public Car(){

    }

    public Car(int id, String brand, int manufactureYear, String color) {
        this.id = id;
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
