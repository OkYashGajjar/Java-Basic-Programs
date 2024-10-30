import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args ){

        // taking an input from user
        Scanner Num1 = new Scanner(System.in);
        System.out.print("Enter a number");
        int num1 = Num1.nextInt();

// checking if number is even or odd.
        if (num1 % 2 == 0 ){
            System.out.println("the number is even ");
        }
        else {
            System.out.println("the number is odd");
        }

    }
}
