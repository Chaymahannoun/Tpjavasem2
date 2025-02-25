import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M = new int[20][30];  // La matrice a une taille maximale de 20x30
        int[] T;  // Tableau pour stocker la somme des lignes
        int nl, nc;

        // Demander le nombre de lignes (nl) entre 1 et 20
        do {
            System.out.print("Enter the number of rows (nl, 1-20): ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl > 20);

        // Demander le nombre de colonnes (nc) entre 1 et 30
        do {
            System.out.print("Enter the number of columns (nc, 1-30): ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc > 30);

        // Initialiser le tableau T pour stocker la somme des lignes
        T = new int[nl];

        // Demander à l'utilisateur d'entrer les éléments de la matrice
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                M[i][j] = scanner.nextInt();
            }
        }

        // Calculer la somme des éléments pour chaque ligne
        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
            }
            T[i] = sum;  // Stocker la somme de chaque ligne dans T
        }

        // Trouver la somme minimale et maximale
        int minSum = T[0];
        int maxSum = T[0];
        for (int i = 1; i < nl; i++) {
            if (T[i] < minSum) {
                minSum = T[i];
            }
            if (T[i] > maxSum) {
                maxSum = T[i];
            }
        }

        // Afficher les résultats
        System.out.println("Minimum sum of rows: " + minSum);
        System.out.println("Maximum sum of rows: " + maxSum);

        scanner.close();
    }
}
