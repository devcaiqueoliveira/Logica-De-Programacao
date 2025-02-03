import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int novo = 1;
        int contIn = 0;
        int contGrem = 0;
        int empate = 0;

        while (novo == 1) {
            int inter = sc.nextInt();
            int gremio = sc.nextInt();

            if (gremio > inter) {
                contGrem += 1;
            }
            else if (inter == gremio){
                empate += 1;
            }
            else {
                contIn += 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao");
            novo = sc.nextInt();
        }

        int contTot = contIn + contGrem + empate;
        System.out.println(contTot + " grenais");
        System.out.println("Inter: " + contIn);
        System.out.println("Gremio: " + contGrem);
        System.out.println("Empates: " + empate);

        if (contIn > contGrem) {
            System.out.println("Inter venceu mais");
        }
        else {
            System.out.println("Gremio venceu mais");
        }
        sc.close();
    }
}