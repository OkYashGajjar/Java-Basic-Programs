import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args ){

        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number :");
        int number = s.nextInt();

        while (number != 0 ){

            number = (number / 10);
            ++count;
        }
        System.out.println("You have provided " + count + " numbers");


    }
}
