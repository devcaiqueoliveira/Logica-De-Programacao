import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] x = new double[n];
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (x[i] % 2 == 0) {
                soma = soma + x[i];
                cont += 1;
            }
        }

        double media = (double) soma / cont;

        System.out.printf("%.1f%n", media);

        sc.close();
    }
}