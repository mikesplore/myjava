import java.util.Scanner;

public class UppercaseCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println("Number of uppercase letters: " + getUppercaseCount(input));
    }

    public static int getUppercaseCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}

