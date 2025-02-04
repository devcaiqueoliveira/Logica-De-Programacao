import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = ((9 * c) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.print("Deseja repetir? (s/n) ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();
    }
}