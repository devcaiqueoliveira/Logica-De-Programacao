import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            double divisao = (double) x / y;

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}