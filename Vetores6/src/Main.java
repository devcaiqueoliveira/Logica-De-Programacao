import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++ ) {
            name[i] = sc.next();
            age[i] = sc.nextInt();
        }

        int maisVelho = age[0];
        int nomeVelho = 0;

        for (int i = 1; i < n; i++) {
            if (age[i] > maisVelho) {
                maisVelho = age[i];
                nomeVelho = i;
            }
        }

        System.out.println("Pessoa mais velha: " + name[nomeVelho]);

        sc.close();
    }
}