import java.util.Scanner;

public class AddTwoInt {
    public static void main(String[] args){

        Scanner Num1 = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = Num1.nextInt();

        Scanner Num2 = new Scanner(System.in);
        System.out.println("Enter num 2");
        int num2 = Num2.nextInt();

        int addTwoNum = num1 + num2 ;
        System.out.println("Your Sum is = "+ addTwoNum );



    }
}
