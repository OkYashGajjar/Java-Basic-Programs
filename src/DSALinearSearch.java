import java.util.Scanner;

public class DSALinearSearch {

    public static int linearSearch(int[] a, int key ){

        for (int i = 0 ; i < a.length ; i++){
            if(a[i] == key){
                System.out.print("the element is at " + i + " index is :");
                return a[i];
            }
        }
        System.out.println("Element not found.");
        return -1;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of an array");
        int size = s.nextInt();
        System.out.print("Enter an array :");
        int[] array = new int[size];

        for ( int i =0; i < array.length ; i++){
            array[i] = s.nextInt();
        }

        System.out.println("Enter a key you want to find.");
        int x = s.nextInt();

        int y =linearSearch(array , x);
        System.out.println(y);

    }
}
