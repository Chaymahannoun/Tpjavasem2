import java.util.Scanner;

public class App2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int nl;
        do {
            System.out.print("Entrez le nombre de lignes (nl < 30): ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl >= 30);
        
        
        int nc;
        do {
            System.out.print("Entrez le nombre de colonnes (nc < 30): ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc >= 30);
        
      
        int[][] M = new int[nl][nc];
        System.out.println("Entrez les elements de la matrice:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = scanner.nextInt();
            }
        }
        
      
        int somme = 0;
        long produit = 1;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme += M[i][j];
                produit *= M[i][j];
            }
        }
        double moyenne = (double) somme / (nl * nc);
        
      
        System.out.println("Somme des elements: " + somme);
        System.out.println("Produit des elements: " + produit);
        System.out.println("Moyenne des elements: " + moyenne);
        
        scanner.close();
    }
}