import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= x; i++) {
            fatorial *= i;

        }
        System.out.println(fatorial);

        sc.close();
    }
}