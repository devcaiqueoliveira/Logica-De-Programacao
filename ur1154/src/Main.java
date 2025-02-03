import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int cont = 0;
        int idadeTot = 0;

        while (idade > 0) {
            idadeTot += idade;
            cont += 1;
            idade = sc.nextInt();
        }

        double media = (double) idadeTot / cont;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}