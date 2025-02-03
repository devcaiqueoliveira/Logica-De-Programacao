import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int saida;

        while (x != 0) {
            if (x % 2 == 0) {
                saida = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(saida);
            }
            else  {
                x = x + 1;
                saida = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(saida);
            }
            x = sc.nextInt();
        }

        sc.close();
    }
}