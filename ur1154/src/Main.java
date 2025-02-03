import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        double contValor = 0;
        int valorFinal = 0;

        while (valor >= 0) {
            contValor += 1;
            valorFinal += valor;
            valor = sc.nextInt();
        }

        double media = valorFinal / contValor;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}