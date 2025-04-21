import java.util.Scanner;

public class CharacterCategorizerAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        String category = categorizeCharacter(inputChar);
        System.out.println("The character '" + inputChar + "' is a " + category + ".");
    }

    public static String categorizeCharacter(char ch) {
        int asciiValue = (int) ch;
        if (asciiValue >= 65 && asciiValue <= 90) { // ASCII for A-Z
            return "Uppercase";
        } else if (asciiValue >= 97 && asciiValue <= 122) { // ASCII for a-z
            return "Lowercase";
        } else {
            return "Special character";
        }
    }
}