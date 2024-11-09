import java.util.Scanner;

public class FactorialByFunction {

    public static void factorial(int a ){
        if ( a == 0){
            System.out.println("the factorial is 1.");
        }
        else if ( a < 0) {
            System.out.println("factorial of this number is not exist");
        }
        else if (a > 0){
            int number = 1;
            for (int i = 1 ; i <= a ; i ++){
                number = number * i;
            }
            System.out.println("The factorial is : " + number);
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        factorial(num);
    }
}
