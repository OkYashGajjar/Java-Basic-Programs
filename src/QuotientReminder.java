import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {

        // taking input from user

        Scanner Num1 = new Scanner(System.in);
        System.out.println("Enter a number :");
        float num1 = Num1.nextFloat();

        Scanner Num2 = new Scanner(System.in);
        System.out.println("Enter a second number :");
        float num2 = Num2.nextFloat();

        // quotient can be a floating number but reminder can not so we had typecasted that numbers here..
        float Quotient = num1 / num2;
        int Reminder =(int)  (num1 % num2);

        System.out.println("the quotient is :" + Quotient);
        System.out.println("The Reminder is :" + Reminder);
    }
}
