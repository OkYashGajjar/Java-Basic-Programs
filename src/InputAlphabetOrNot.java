import java.util.Scanner;

public class InputAlphabetOrNot {
    public static void main(String[] args){

        // taking character input
        Scanner s = new Scanner(System.in);
        System.out.print("enter a character :");
        char character = s.next().charAt(0);

        // typecasting character to integer so that we can have ASCII value.
        int ascii = (int) character;

        // checking ascii value is between 65 to 90 & 95 to 122 is a character.
        if (ascii >=65 && ascii < 90 ){
            System.out.println("Provided input is a character. ");
        } else if (ascii >= 97 && ascii < 122){
            System.out.println("provided input is a character. ");
        } else System.out.println("Provided input is not a character ");

    }
}
