import java.util.Scanner;
public class ex1{

    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int compter(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = lecture();
        int nbCh = compter(n);
        System.out.println("Le nombre de chiffres est : " + nbCh);
    }}
   
