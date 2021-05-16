package com.company;

public class PrimativeTypeChallenge {
    public static void main(String[] args) {

        byte myByte = 125;
        short myShort = 30000;
        int myInt = 4409;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));

        short total = (short) (100 + 10 *( myByte + myShort + myInt));

        System.out.println(myLong);

    }

}
