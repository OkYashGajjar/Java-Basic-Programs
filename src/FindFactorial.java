import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        int factorial = 1;
        for ( int i = 1 ; i <= num ; i++ ){

            factorial = factorial * i ;

        }
        System.out.print("The factorial is = " + factorial );


    }
}
