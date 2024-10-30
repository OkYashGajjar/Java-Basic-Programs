import java.util.Scanner;

public class AsciiValueOfChar {
    public static void main(String[] args){


       // How to find Ascii value??

        //taking user input of character

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter a character to find ASCII value of it :");
        char character = ch.next().charAt(0);

        // TYPECAST above character into int.
        int typeCastCh = (int) character;
        System.out.println(character + "'s" + " ASCII value is : " + typeCastCh);
    }
}
