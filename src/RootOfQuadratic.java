import java.util.Scanner;

public class RootOfQuadratic {
    public static void main (String[] args) {

        //taking input from user.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a :");
        double a = scanner.nextDouble();

        System.out.println("Enter b :");
        double b = scanner.nextDouble();

        System.out.println("Enter c :");
        double c = scanner.nextDouble();

        // here the formula to solve a quadratic eqn is : (-b +- root(b^2 - 4ac)) / 2a

        // let suppose b^2-4ac = inst
        double inst = (b*b) - (4*a*c);

        if (inst > 0){
            double root1 = ( -b + Math.sqrt(inst) ) / (2*a);
            double root2 = ( -b - Math.sqrt(inst) ) / (2*a);
            System.out.println("the Root of Quadratic equation is " + root1 + " and " + root2);
        } else if ( inst == 0 ){
            double root = -b / (2*a);
            System.out.println("Root is " + root);
        } else System.out.println("roots are imaginary ");
    }
}
