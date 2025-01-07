import java.util.Scanner;
// affiche une pyramide de taille entrer par l'utilisateur. 
public class pyramides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nombre = scanner.nextInt();

        for (int i = 1 ; i<=nombre; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();     
        }
        scanner.close();    
    }   
}
