public class DisplayAtoZ {
    public static void main(String[] args ){
// adding last ascii value
        int last = 90;
// usimg for loop for type a to z
        for ( int first = 65 ; first <= last ; first++){

            // typecasting integer to character to find character from its ascii value.
            char typeCast = (char) first;
            System.out.print("  " +typeCast);
        }
    }
}
