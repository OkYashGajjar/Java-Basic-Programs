import java.util.Scanner;

public class ArrayInput {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int array[] = new int[size];

        //taking input by loop
        for ( int i = 0 ; i < size ; i++){
            array[i] = s.nextInt();
        }

        //giving output by array
        for ( int i = 0 ; i < size ; i++){
            System.out.println("You have entered " + array[i]);
        }
    }
}
