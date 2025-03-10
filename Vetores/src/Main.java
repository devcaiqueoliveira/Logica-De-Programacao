import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += height[i];
        }

        double media = sum / n;
        System.out.printf("Altura media: %.2f%n", media);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                count++;
            }
        }

        double x = (double) count * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);

        sc.close();
}
}