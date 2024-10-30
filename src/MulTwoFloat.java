import java.util.Scanner;

public class MulTwoFloat {
public static void main(String[] args){

    Scanner Num1 = new Scanner(System.in);
    System.out.println("enter Num1 : ");
    float num1 = Num1.nextFloat();

    Scanner Num2 = new Scanner(System.in);
    System.out.println("enter Num2 :");
    float num2 = Num2.nextFloat();

    float num = num1 * num2;
    System.out.println("The sum of " + num1 + "and" + num2 + "=" + num);

}
}
