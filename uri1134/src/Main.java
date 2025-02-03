import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasosa = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            }
            else if (tipo == 2) {
                gasosa += 1;
            }
            else if ( tipo == 3) {
                diesel += 3;
            }

            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasosa);
        System.out.println("Diesel: " + diesel);


        sc.close();

    }
}