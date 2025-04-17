import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Entrez une chaine de caracteres : ");
        String chaine = scanner.nextLine();
        scanner.close(); 

        String chaineInversee = new StringBuilder(chaine).reverse().toString();
        System.out.println("Chaine inversee : " + chaineInversee);
    }
}





