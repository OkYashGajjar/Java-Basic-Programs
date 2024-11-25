public class DsaQuick {
        static void QuickSort(int[] array, int low, int high) {
            if (low < high) {
                int pivot = partition(array, low, high);
                QuickSort(array, low, pivot - 1); // Sort left subarray
                QuickSort(array, pivot + 1, high); // Sort right subarray
            }
        }

        static int partition(int[] array, int low, int high) {
            int pivot = array[low];
            int p = low + 1;
            int q = high;

            while (p <= q) {
                while (p <= q && array[p] <= pivot) {
                    p++;
                }
                while (p <= q && array[q] > pivot) {
                    q--;
                }
                if (p < q) {
                    int temp = array[p];
                    array[p] = array[q];
                    array[q] = temp;
                }
            }
            int temp = array[low];
            array[low] = array[q];
            array[q] = temp;

            return q;
        }

        public static void main(String[] args) {
            int[] array = {10, 5, 9, 22, 88, 72};
            QuickSort(array, 0, array.length - 1);

            // Print sorted array
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
