import java.util.Scanner;

public class SetBit {
    public static void main(String[] args){

        //taking decimal as an input.
           Scanner s = new Scanner(System.in);
           System.out.print("Enter a decimal number between 0 to 15 :");
           int number =  s.nextInt();
        // taking position as an input.
           System.out.print("Enter position you have to change in binary from o to 3 :");
           int i = s.nextInt();
        // doing bit mask
           int bitmask = 1<<i;
        // performing OR operation to set a number.
           int changedNumber = bitmask | number;
           System.out.println("the number is changed to : " + changedNumber);

    }
}
