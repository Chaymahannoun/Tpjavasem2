import java.util.Scanner;

public class xercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaine de caracteres : ");
        String chaine = scanner.nextLine();

        if (chaine != null && !chaine.isEmpty()) {

            System.out.print("Un caractere sur deux : ");
            for (int i = 0; i < chaine.length(); i += 2) {
                System.out.print(chaine.charAt(i));
            }
            System.out.println(); 

            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caractere : " + premierCaractere);
            System.out.println("Dernier caractere : " + dernierCaractere);
        } else {
            System.out.println("La chaine est vide. Veuillez saisir une chaine valide.");
        }

        scanner.close();
    }
}
