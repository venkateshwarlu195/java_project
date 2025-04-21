import java.util.Scanner;

public class CharacterCategorizerIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        String category = categorizeCharacter(inputChar);
        System.out.println("The character '" + inputChar + "' is a " + category + ".");
    }

    public static String categorizeCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return "Uppercase";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Lowercase";
        } else {
            return "Special character";
        }
    }
}