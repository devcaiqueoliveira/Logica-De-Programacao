import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int tot = 0;

        while (x != 0) {
            if (x % 2 == 0) {
                tot = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(tot);
            }
            else {
                x = x + 1;
                tot = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(tot);
            }
            x = sc.nextInt();
        }

        sc.close();
    }
}