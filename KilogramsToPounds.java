public class KilogramsToPounds {
    public static double kgToPounds(double kg) {
        return kg * 2.2;
    }

    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds");
        System.out.println("-------------------");
        for (int kg = 1; kg <= 199; kg++) {
            double pounds = kgToPounds(kg);
            System.out.printf("%-11d %.1f\n", kg, pounds);
        }
    }
}
