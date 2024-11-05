import java.util.Scanner;

public class FindMaxMInUsingArray {
    public static void main(String[] args){

        // taking input
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];

        for( int i = 0 ; i < size ; i++){
            System.out.print("enter number at "+ i + " th position :");
            array[i] = s.nextInt();
        }

        for(int i = 0 ; i < size ; i++){
            System.out.println(array[i] + " number at " + (i+1) + "th position");
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

    }
}
