import java.util.Scanner;

public class CharacterCategorizerMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        String category = categorizeCharacter(inputChar);
        System.out.println("The character '" + inputChar + "' is a " + category + ".");
    }

    public static String categorizeCharacter(char ch) {
        if (Character.isUpperCase(ch)) {
            return "Uppercase";
        } else if (Character.isLowerCase(ch)) {
            return "Lowercase";
        } else {
            return "Special character";
        }
    }
}