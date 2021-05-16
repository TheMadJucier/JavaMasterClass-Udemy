public class PostiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);

    }
    public static void checkNumber (int number){
        if(number > 0){
            System.out.println("postive");
        } else if (number < 0 ){
            System.out.println("negative");
        }else if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("That is not a number");
        }
    }
}
