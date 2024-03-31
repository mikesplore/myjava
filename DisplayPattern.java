import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        displayPattern(numRows);
        scanner.close();
    }

    public static void displayPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
