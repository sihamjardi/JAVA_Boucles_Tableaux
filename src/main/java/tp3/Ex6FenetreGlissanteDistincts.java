package tp3;

import java.util.Scanner;

public class Ex6FenetreGlissanteDistincts {

    public static void main(String[] args) {

        final int MAXV = 100000;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k < 1 || k > n || n > 100000) {
            System.out.println("Paramètres invalides.");
            sc.close();
            return;
        }

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            if (T[i] < 0 || T[i] > MAXV) {
                System.out.println("Valeur hors bornes.");
                sc.close();
                return;
            }
        }

        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        for (int i = 0; i < k; i++) {
            int x = T[i];
            if (freq[x] == 0) distinct++;
            freq[x]++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(distinct);

        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];
            if (freq[in] == 0) distinct++;
            freq[in]++;

            sb.append(' ').append(distinct);
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
