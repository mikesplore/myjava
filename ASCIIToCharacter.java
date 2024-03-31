import java.util.Scanner;

public class ASCIIToCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiCode;
        do {
            System.out.print("Enter an ASCII code (between 0 and 127): ");
            asciiCode = scanner.nextInt();
        } while (asciiCode < 0 || asciiCode > 127);

        char character = (char) asciiCode;

        if (Character.isISOControl(character) || Character.isWhitespace(character)) {
            System.out.println("The ASCII code " + asciiCode + " corresponds to a non-printable character.");
        } else {
            System.out.println("The character corresponding to ASCII code " + asciiCode + " is: " + character);
        }

        scanner.close();
    }
}
