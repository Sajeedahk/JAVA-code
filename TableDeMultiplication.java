import java.util.Scanner;

// affiche la table de multiplication d'un nombre entrer par l'utilisateur.
public class TableDeMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int table = scanner.nextInt();
        for (int i = 1; i<=10; i= i+1) {
            int mul = i * table;
            System.out.println(i + "*" + table + "=" + mul);
        }
    }
}
