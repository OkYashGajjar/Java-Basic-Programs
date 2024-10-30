import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){

        // taking input from user
        Scanner s = new Scanner(System.in);
         System.out.println("How many time you want to sum? : ");
         int input = s.nextInt();
         int sum = 0;

         //adding for loop for sum
        for ( int i = 0 ; i <= input ; i++){
            // taking sum of numbers
            sum = sum + i;
        }
        System.out.println( "this is your " + sum);
    }
}
