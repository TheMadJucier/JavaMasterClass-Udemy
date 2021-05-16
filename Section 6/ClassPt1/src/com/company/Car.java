package com.company;

public class Car {
    /*
    other access modifiers: public, private, protected or nothing
    classes are blueprints for
     */

    private int doors;
    private int numberOfWheels;
    private String model;
    private String engine;
    private String color;

    //use this to let java know that you want to use the class field variable

    public void setModel (String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("Carrera") || validModel.equals("Commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel (){
        return this.model;
    }

}
