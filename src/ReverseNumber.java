import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = s.nextInt();
        int reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);


    }
}
