public class ForLoopConversion {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; sum < 10000; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
