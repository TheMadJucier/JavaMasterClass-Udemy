package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count = 0;
        while (count != 5){
            System.out.println("Count value is " + count);
                count++;
        }

      /*  for (int i = 1; i < 7; i++){
            System.out.println("Count value is " + count);
        }*/

//        for (count = 1; count != 6; count++){
//            System.out.println("Count values is " + count);
//        }

//        while (true){
//            if (count == 5){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 6 ;
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

//        while (number <= finishNumber){
//            number++;
//
//
//            if (!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) break;
        }

        System.out.println("Total numbers of even numbers found " + evenNumbersFound);

    }



    public static boolean isEvenNumber (int num){
        if (num < 0){
            return false;
        } else if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }


}
