import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int maior = sc.nextInt();
        int posicao = 1;

        for (int i = 2; i <= 100; i++) {
            int n = sc.nextInt();
            if (n > maior) {
                maior = n;
                posicao = i;

            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}