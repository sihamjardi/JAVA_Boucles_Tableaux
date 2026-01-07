package tp3;

import java.util.Scanner;

public class Ex5RotationMatrice {

    public static void printMatrix(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }

    public static void transposeInPlace(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
    }

    public static void reverseRowsInPlace(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = tmp;
            }
        }
    }

    public static void reverseColsInPlace(int[][] A) {
        int n = A.length;
        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < n; i++) {
                int tmp = A[j][i];
                A[j][i] = A[n - 1 - j][i];
                A[n - 1 - j][i] = tmp;
            }
        }
    }

    public static void rotate90ClockwiseInPlace(int[][] A) {
        transposeInPlace(A);
        reverseRowsInPlace(A);
    }

    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        transposeInPlace(A);
        reverseColsInPlace(A);
    }

    public static void rotate180InPlace(int[][] A) {
        reverseRowsInPlace(A);
        reverseColsInPlace(A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 2 || n > 200) {
            System.out.println("N doit être entre 2 et 200.");
            sc.close();
            return;
        }

        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);

        printMatrix(A);

        sc.close();
    }
}
