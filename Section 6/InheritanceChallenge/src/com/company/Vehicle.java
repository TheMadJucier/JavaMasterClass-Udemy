package com.company;

public class Vehicle { // assuming vehicals doesn't include manual bikes, scooters, etc

    private String name;
    private String fuelType;
    private int passengerCapacity;
    private double price;
    private double horsePower;
    private int weight;
    private int size;
    private String direction;

   /* public Vehicle (String name,double price, String direction){
        this(String name, "Gasoline/EV", 0,25000, 0,)
    }*/

    public Vehicle(String name, String fuelType, int passengerCapacity, double price, double horsePower, int weight, int size, String direction) {
        this.name = name;
        this.fuelType = fuelType;
        this.passengerCapacity = passengerCapacity;
        this.price = price;
        this.horsePower = horsePower;
        this.weight = weight;
        this.size = size;
        this.direction = direction;
    }

    public void steer(int currentDirection){
        this.direction += currentDirection;
        System.out.println("Vehical.steer(): steering at " + currentDirection + "degrees");
    }

    //public void move

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getdirection() {
        return direction;
    }

    public void setdirection(String direction) {
        this.direction = direction;
    }
}
