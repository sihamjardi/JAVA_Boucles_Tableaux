package tp3;

import java.util.Scanner;

public class Ex1Harmonic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez la valeur de n : ");
        int n = scanner.nextInt();

        double somme = 0.0;

        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }

        System.out.println("La somme harmonique H(" + n + ") = " + somme);

        scanner.close();
    }
}
