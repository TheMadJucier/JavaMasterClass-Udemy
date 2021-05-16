package com.company;

public class Mercedes  extends Car {
    private String model;
    private String type;
    private int year;
    private String color;

    public Mercedes(double price, double horsePower, int weight, String engineType, String model, String type, int year, String color) {
        super("Mercedes", 5, price, horsePower, weight, 4, "North", engineType, 10);
        this.model = model;
        this.type = type;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
