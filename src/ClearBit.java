import java.util.Scanner;

public class ClearBit {
public static void main(String[] args ){

    // taking value from user;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number between 0 to 15 :");
    int number = s.nextInt();
    // taking position to perform bit clear
    System.out.println("Enter a position of a bits between 0 to 3 :");
    int i = s.nextInt();
    // doing bit masking
    int bitmask = 1<<i;
    // performing not operation here.
    int newBitmask = ~(bitmask);
    // performing and operation
    int newNumber = newBitmask & number ;
    System.out.println("the number is : " + newNumber );

}
}
