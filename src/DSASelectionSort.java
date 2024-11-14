public class DSASelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
              swap(array, minIndex , i);
        }
    }


    static void swap(int[] a , int first , int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
    public static void main(String[] args){
         int[] arr = {1,7,-1,6,2};
         selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
