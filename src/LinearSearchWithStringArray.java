import java.util.Scanner;

public class LinearSearchWithStringArray {
    public static void main(String[] args){

        // scanning strings from users
        Scanner s = new Scanner (System.in);
        System.out.print("enter size for a string :");
        int size = s.nextInt();
        System.out.print("enter String values :");
        String[] array = new String[size];
            for ( int i = 0 ; i< array.length ; i ++  ){
                  array[i] = s.next();
            }
        System.out.print("enter target :");
        String target = s.nextLine();
        s.nextLine();
            for ( int i = 0 ; i < 1 ; i ++ ){
                target = s.next();
            }
            s.close();
           System.out.println( searchFromString(array, target) );

    }

    public static int searchFromString(String[] array, String target){
        for (int i = 0; i<= array.length ;i++){
            // checking here element is equal to target.
            if(array[i].equalsIgnoreCase(target) ){
                System.out.print("we have founded " + target + " at index at ");
                return i;
            }
        }
        System.out.println("we didn't found");
        return -1;
    }
}
//        public class LinearSearchWithStringArray {
//            public static void main(String[] args) {
//                // Create a Scanner object to read input
//                Scanner s = new Scanner(System.in);
//
//                // Prompt user for the size of the array
//                System.out.print("Enter the size of the string array: ");
//                int size = s.nextInt();
//                s.nextLine();  // Consume the leftover newline
//
//                // Initialize the array and prompt user for each element
//                String[] array = new String[size];
//                System.out.println("Enter " + size + " string values:");
//                for (int i = 0; i < array.length; i++) {
//                    array[i] = s.nextLine();
//                }
//
//                // Prompt user for the target string
//                System.out.print("Enter the target string to search for: ");
//                String target = s.nextLine();
//
//                // Call the search function and print the result
//                int index = searchFromString(array, target);
//                if (index != -1) {
//                    System.out.println("Target found at index " + index);
//                } else {
//                    System.out.println("Target not found in the array.");
//                }
//
//                // Close the scanner
//                s.close();
//            }
//
//            // Sequential search method to find the target string
//            public static int searchFromString(String[] array, String target) {
//                for (int i = 0; i < array.length; i++) {
//                    // Check if the current element matches the target
//                    if (array[i].equalsIgnoreCase(target)) {
//                        return i;  // Return the index if a match is found
//                    }
//                }
//                return -1; // Return -1 if the target is not found
//            }
//        }