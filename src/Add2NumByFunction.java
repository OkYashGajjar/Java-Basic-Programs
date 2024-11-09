import java.util.Scanner;

public class Add2NumByFunction {

    public static void addTwoNumbers(int a , int b){
         int c = a + b ;
         System.out.println("the sum is "+ c);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int num1 = s.nextInt();
        System.out.print("Enter a second number :");
        int num2 = s.nextInt();
        addTwoNumbers(num1, num2);
    }
}
