import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args){

        // taking input numbers from users.
        Scanner Num1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = Num1.nextInt();

        Scanner Num2 = new Scanner(System.in);
        System.out.print("enter a second number : ");
        int num2 = Num2.nextInt();


        //before swapping
        System.out.println("before swapping your num1 is :" + num1 + " and num2 is :" + num2 );

        // making a temporary variable for swapping.
        int temp = num1 ;
        num1 = num2;
        num2 = temp;

        //after swapping.
        System.out.println("after swapping your num1 is :" + num1 + " and num2 is :" + num2 );

    }

}
