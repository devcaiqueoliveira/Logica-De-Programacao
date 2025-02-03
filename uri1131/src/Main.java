import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totInter = 0;
        int totGrem = 0;
        int empate = 0;
        int totGrenal = 0;

        int grenal = 1;

        while (grenal == 1) {
            int inter = sc.nextInt();
            int gremio = sc.nextInt();

            totGrenal += 1;

            if (inter > gremio) {
                totInter += 1;
            } else if (inter == gremio) {
                empate += 1;
            } else {
                totGrem += 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            grenal = sc.nextInt();

        }

        System.out.println(totGrenal + (" grenais"));
        System.out.println("Inter:" + totInter);
        System.out.println("Gremio:" + totGrem);
        System.out.println("Empates:" + empate);

        if (totInter > totGrem) {
            System.out.println("Inter venceu mais");
        }
        else if (totInter == totGrem) {
            System.out.println("Os times empataram");
        }
        else {
            System.out.println("Gremio venceu mais");
        }

        sc.close();
    }
}