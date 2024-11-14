public class DSABinarySearch {
    public static int binarySearch(int[] a, int key){
        int n = a.length;
        // initially left=0 , right = 0

        int start = a[0];
        int end = a[n-1];

        while (start <= end ){
            int middle = (start + end )/2;
            if(a[middle] == key){
                return middle;
            }
            else if ( a[middle] < key){
                start = middle +1;
            }else if (a[middle] > key){
                end = middle -1;
            }
            return -1; //key is not there.
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {1, 2, 3 ,4 ,5, 6, 7, 8};
        int key = 7;
        int answer = (binarySearch(array , key));
        if(answer == -1){
            System.out.println("key is not there.");
        }
    }
}
