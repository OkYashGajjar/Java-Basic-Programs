import java.util.Scanner;

public class GetBit {
    public static void main(String[] args ){

        Scanner s = new Scanner(System.in);
        // taking a number as an input
        System.out.print("enter a decimal number between 0 to 15 :");
        int n = s.nextInt();
        // taking position as an input
        System.out.println("In which position you have to check of a bit from 0 to 3 ? :");
        int i = s.nextInt();
        // doing bit masking.
        int bitmask = 1<<i;
        // conditioning here.
        if( (bitmask & n) == 0 ){
            System.out.println("number was 0 ");
        } else System.out.println("number is 1 ");

    }

}
