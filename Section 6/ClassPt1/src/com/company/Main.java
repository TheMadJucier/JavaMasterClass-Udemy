package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche; // declaration
        porsche = new Car(); // initialization
        Car holden = new Car();

       // porsche = null;
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
