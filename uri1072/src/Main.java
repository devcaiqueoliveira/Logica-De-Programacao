import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xMais = 0;
        int xMenos = 0;

        for (int x = 1; n >= x; x++) {
            int z = sc.nextInt();

            if (z >= 10 && z <= 20) {
                xMais += 1;
            }
            else {
                xMenos += 1;
            }
        }

        System.out.println(xMais + " in");
        System.out.println(xMenos + " out");

        sc.close();

    }
}