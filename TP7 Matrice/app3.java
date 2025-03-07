import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M = new int[20][30];  
        int[] T;  
        int nl, nc;   
        do {
            System.out.print("Enter the number of rows (nl, 1-20): ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl > 20);     
       do {
            System.out.print("Enter the number of columns (nc, 1-30): ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc > 30);     
        T = new int[nl];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                M[i][j] = scanner.nextInt();
            }
        }        
        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
            }
            T[i] = sum;  
        }       
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
        System.out.println("Minimum sum of rows: " + minSum);
        System.out.println("Maximum sum of rows: " + maxSum);

        scanner.close();
    }
}
