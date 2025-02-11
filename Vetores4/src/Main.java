import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double[] n = new double[x];
        double soma = 0;
        double cont = 0;
        double media = 0;

        for (int i = 0; i < x; i++) {
            n[i] = sc.nextDouble();
            soma += n[i];
            cont = i + 1;
        }

        media =  soma / cont;
        System.out.println(media);

        for (int i = 0; i < x; i++) {
            if (n[i] < media) {
                System.out.println(n[i]);
            }
        }

        sc.close();
    }
}