import java.util.Scanner;

public class ex3 {

    public static boolean estInfinitif(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static String groupe(String verbe) {
        if (verbe.endsWith("er") && !verbe.equals("aller")) {
            return "Premier groupe";
        } else if (verbe.endsWith("ir")) {
            return "Deuxième groupe";
        } else {
            return "Troisième groupe";
        }
    }

    public static String saisieVerbe(Scanner scanner) {
        String verbe;
        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine().trim().toLowerCase();
        } while (!estInfinitif(verbe));
        return verbe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe = saisieVerbe(scanner);
        String groupeVerbe = groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupeVerbe + ".");
        scanner.close();
    }
}
