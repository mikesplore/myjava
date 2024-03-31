import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int totalCount = 0;
        int totalSum = 0;

        System.out.println("Enter integers the input ends if it is 0:");
        
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
            totalCount++;
            totalSum += num;
        }

        if (totalCount == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        double average = (double) totalSum / totalCount;

        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + totalSum);
        System.out.printf("The average is %.2f\n", average);

        scanner.close();
    }
}
