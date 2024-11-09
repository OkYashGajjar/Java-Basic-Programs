import java.util.Scanner;

public class PowerOfNumberByFunction {

    public static int power(int a , int b){
     int result = 1;
        for( int i = 1; i<= b ;i++ ){
            result = result*a;
     }
        return result;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter number :");
        int num1 = s.nextInt();
        System.out.print("enter power of number :");
        int num2 = s.nextInt();
       int c = power(num1, num2);
       System.out.println("the value is : " + c);
    }

}
