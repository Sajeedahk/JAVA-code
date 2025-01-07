import java.util.Random;
import java.util.Scanner;


public class Devinelenombre {
    //Génère un nombre aléatoire entre 1 et 100 et demande à l'utilisateur de le deviner. Donne des indices comme "trop grand" ou "trop petit".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombre = random.nextInt(100);
        System.out.println("Entrez un nombre");
        int nb = scanner.nextInt();
        while(nb != nombre){
            if (nb > nombre){
                System.out.println("Le nombre est trop grand");
                nb = scanner.nextInt();
            } else if (nb<nombre){
                System.out.println("Le nombre est trop petit");
                nb = scanner.nextInt();
            }   
        }
        System.out.println("We did it !!!");
          
    }    
}
