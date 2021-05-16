package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //getGreatestCommonDivisor(12,30);
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));



    }

    public static int getGreatestCommonDivisor (int num1, int num2) {

        if (num1 < 10 || num2 < 10) {
            return -1;
        }
        int Temp, GCD=0;
        while(num2 != 0)
        {
            Temp = num2;
            num2 = num1 % num2;
            num1 = Temp;
        }
        GCD = num1;
        return GCD;
    }
}
            /*int temp = 1;
            int temp2 = 1;


           for (int i = 2; i != num1; i++){
               if (num1 % i == 0){
                   int tempHolder= temp; // sets previous value of temp to this variable
                   temp = num1 / i;
                   if (temp < tempHolder){
                       continue;
                   } else {
                       if (temp == tempHolder){
                           continue;
                       }
                       temp = tempHolder;
                   }

               }
           }

            for (int j = 1; j != num2; j++){ // runs a for loop if theres
                int tempHolder2 = temp2;
                temp2 = num1 % j;
                if (temp2 < tempHolder2){
                    continue;
                } else {
                    temp2 = tempHolder2;

                }



            }



        if (temp == temp2){
            return temp;
        } else {
            return -1;
        }
*/


   /* Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

    The method should return the greatest common divisor of the two numbers (int).

    The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).


    For example 12 and 30:

            12 can be divided by 1, 2, 3, 4, 6, 12

            30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

    The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.


    EXAMPLE INPUT/OUTPUT:

            * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder

* getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder

* getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10

            * getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder


    HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.

    HINT: Find the minimum of the two numbers.


            NOTE: The method getGreatestCommonDivisor should be defined as public static like we have been doing so far in the course.

    NOTE: Do not add a main method to the solution code.*/

