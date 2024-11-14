public class DSABubbleSort {

     static void bubbleSort(int[] a){
        int n = a.length;
        // making loop for compare.
        for( int i = 0; i < n ; i++){
            for ( int j = 1; j< n ; j++ ){
                // comparing an elements in array.
                if ( a[j] < a[j-1]){
                    // sorting here.
                    int c = a[j];
                    a[j] = a[j-1];
                    a[j-1] = c;
                }
            }
        }
    }

    public static void main(String[] args){
       int arr[] = {5,6,7,8,3,5,2};
       bubbleSort(arr);
// writing an output for an sorted array.
       for ( int i = 0; i <arr.length ; i ++){
           System.out.print(arr[i] + " ");
       }

    }
}
