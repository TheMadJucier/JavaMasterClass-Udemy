package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here





        com.company.Carpet carpet = new com.company.Carpet(3.5);
        com.company.Floor floor = new com.company.Floor(2.75, 4.0);
        com.company.Calculator calculator = new com.company.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new com.company.Carpet(1.5);
        floor = new com.company.Floor(5.4, 4.5);
        calculator = new com.company.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
