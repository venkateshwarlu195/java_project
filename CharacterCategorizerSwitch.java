import java.util.Scanner;

public class CharacterCategorizerSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        String category = categorizeCharacter(inputChar);
        System.out.println("The character '" + inputChar + "' is a " + category + ".");
    }

    public static String categorizeCharacter(char ch) {
        switch (Character.getType(ch)) {
            case Character.UPPERCASE_LETTER:
                return "Uppercase";
            case Character.LOWERCASE_LETTER:
                return "Lowercase";
            default:
                return "Special character";
        }
    }
}