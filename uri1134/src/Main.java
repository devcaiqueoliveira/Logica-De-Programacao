import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int gasosa = 0;
        int alcool = 0;
        int diesel = 0;

        while (entrada != 4 ) {
            if (entrada == 1) {
                alcool += 1;
            }
            else if(entrada == 2) {
                gasosa += 1;
            }
            else if(entrada == 3) {
                diesel += 1;
            }
            entrada = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasosa);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}