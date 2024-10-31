import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print(" Fibonacci series upto : ");
        int last = s.nextInt();
    int first = 0 ;
    int second = 1;

        System.out.print ( first +"  " + second );

    for( int i = 0 ; i <= last ; i++){

        int next = first + second ;
        System.out.print ( "  " + next );
        first = second ;
        second = next;
    }


    }
}
