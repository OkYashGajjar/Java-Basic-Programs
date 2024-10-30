import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        // taking input from user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        Double Num = s.nextDouble();

        if (Num >= 0.0 ){
            System.out.println(Num + "is a positive number");
        } else System.out.println(Num + "is a negative number");
    }
}
