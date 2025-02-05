import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        int x = n / 2;
        for (int i = 0; i <= n; i++)

            if (n % 2 > 0) {
                System.out.println(x);
            }

        sc.close();
    }
}