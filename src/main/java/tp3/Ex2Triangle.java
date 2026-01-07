package tp3;

import java.util.Scanner;

public class Ex2Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez la hauteur du triangle : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int nbEtoiles = 2 * i - 1;

            for (int j = 1; j <= nbEtoiles; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
