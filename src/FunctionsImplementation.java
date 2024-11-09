import java.util.Scanner;

public class FunctionsImplementation {

    // functions implementation here.
    public static void printMyName( String name ){
       System.out.println( "hello " + name + " Nice to meet you!");
       return;
    }

    public static void main(String[] args ){

        // returnType FunctionName ( dt val1, dt val2 )  dt can be multiple types.. {
        //    Operations
        //    }
        Scanner s = new Scanner(System.in);
        System.out.print("what is your name ? : ");
        String name = s.next();
        printMyName(name);
    }
}
