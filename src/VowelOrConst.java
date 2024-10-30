import java.util.Scanner;

public class VowelOrConst {
    public static void main(String[] args){

        // taking input of a character.
        Scanner char1 = new Scanner(System.in);
        System.out.print("enter a character : ");
        char Char1 = char1.next().charAt(0);

        if ( Char1 == 'a' || Char1 == 'e' || Char1 == 'i' || Char1 == 'o' || Char1 == 'u'){
            System.out.println ( Char1 + "this character is vowel ");
        }
        else if ( Char1 == 'A' || Char1 == 'E' || Char1 == 'I' || Char1 == 'O' || Char1 == 'U') {
            System.out.println(Char1 + "this character is vowel ");
        } else {
            System.out.println(Char1 + "this character is not vowel");
        }

    }
}
