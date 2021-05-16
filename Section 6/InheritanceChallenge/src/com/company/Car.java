package com.company;

public class Car extends Vehicle{
    private byte wheels;
    private String engineType;
    private boolean isRearViewMirror;
    private String suspensionType;
    private int heightOffGround;

    public Car(String name,int passengerCapacity, double price, double horsePower, int weight, int size, String direction,
               String engineType, int heightOffGround) {
        super(name, "Gas", passengerCapacity, price, horsePower, weight, size, direction);
        this.wheels = 4;
        this.engineType = engineType;
        this.isRearViewMirror = true;
        this.suspensionType = "Automatic";
        this.heightOffGround = heightOffGround;
    }

    public void handSteering(){
        System.out.println("Car.handSteering() has been called");
    }

    public void changingGears (){
        System.out.println("Car.changing Gears has been called");
    }

    public void moving (){
        System.out.println("Car.moving() has been called");
    }

    public byte getWheels() {
        return wheels;
    }

    public void setWheels(byte wheels) {
        this.wheels = wheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public boolean isRearViewMirror() {
        return isRearViewMirror;
    }

    public void setRearViewMirror(boolean rearViewMirror) {
        isRearViewMirror = rearViewMirror;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public int getHeightOffGround() {
        return heightOffGround;
    }

    public void setHeightOffGround(int heightOffGround) {
        this.heightOffGround = heightOffGround;
    }
}
