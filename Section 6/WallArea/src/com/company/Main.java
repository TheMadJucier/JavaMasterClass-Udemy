package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WallArea wall = new WallArea(-1.25,-1.25);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
