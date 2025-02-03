import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = 1;

        while (codigo == 1) {
            double x = sc.nextDouble();
            while (x < 0 || x > 10) {
                System.out.println("nota invalida");
                x = sc.nextDouble();
            }

            double y = sc.nextDouble();
            while (y < 0 || y > 10) {
                System.out.println("nota invalida");
                y = sc.nextDouble();
            }

            double media = (x + y) / 2;

            System.out.printf("media = %.2f%n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            codigo = sc.nextInt();

            while (codigo != 1 && codigo != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                codigo = sc.nextInt();
            }
        }

        sc.close();
    }
}