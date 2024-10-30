import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        // taking input from user.
        Scanner Num1 = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = Num1.nextInt();

        Scanner Num2 = new Scanner((System.in));
        System.out.print("Enter a number 2 : ");
        int b = Num2.nextInt();

        Scanner Num3 = new Scanner(System.in);
        System.out.print("Enter a number 3 : ");
        int c = Num3.nextInt();


        if (a >= b) {
      if (c >= a) {
                System.out.println("c is bigger ");
            } else
                System.out.println("a is bigger ");
            }
        if (b>=c){
            if(a>=b){
                System.out.println("a is bigger ");
            } else
                System.out.println("b is bigger ");
        }
    }
    }