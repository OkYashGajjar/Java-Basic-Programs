import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String args[]){

        //implementing a scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size for an array :");
        int size = s.nextInt();
        int array[] = new int[size];

        // taking array input from user.
        for( int i = 0; i<size ; i++){
            System.out.print("Enter a number at " + i +" position :" );
            array[i] = s.nextInt();
        }

        // finding a number here. doing i+1 because of index size is a.size+1.
        for ( int i = 0; i < size ; i++){
            if(array[i] == 20){
                System.out.println(" 20 is at "+ (i+1) + "th index.");
            }
        }

    }
}
