import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantia = 0;
        String tipo;

        for (int i = 0; i <= quantia; i++) {
           quantia = sc.nextInt();
           tipo = sc.next();
        }



        sc.close();
    }
}