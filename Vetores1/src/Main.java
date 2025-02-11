import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] x = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }

        double maior = x[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (x[i] > maior) {
                maior = x[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicaoMaior);


        sc.close();
    }
}