import java.util.Scanner;

public class FindLeapYear
{ public static void main(String[] args ){

    // taking input from user.

    Scanner a = new Scanner(System.in);
    System.out.println("Enter a Year :");
    int Year = a.nextInt();

    // checking if year is divisible by 4 then it will be a leap year.

    if (Year % 4 == 0 ){
        System.out.println(Year + " is a leap year");
    } else System.out.println(Year + " is a not a leap year");
}
}
