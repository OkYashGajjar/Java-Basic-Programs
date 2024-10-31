import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        // user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number you want to find table of :");
        int number = s.nextInt();
        int multiplication = 1;
        // for loop for table

        for ( int i = 1 ; i <= 10 ; i++){
            multiplication  = number * i ;
            System.out.println(number + "*" + i + "=" + multiplication);
        }


    }
}
