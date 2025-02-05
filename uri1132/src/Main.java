import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n, min, max;

        if (x > y) {
            max = x;
            min = y;
        } else {
            min = x;
            max = y;
        }
        int soma = 0;

        for (int i = min; i <= max; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}