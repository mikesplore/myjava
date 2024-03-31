public class PentagonalNumbers {
    public static void main(String[] args) {
        final int NUM_PER_LINE = 10;
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            if (i % NUM_PER_LINE == 0)
                System.out.println(); 
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
