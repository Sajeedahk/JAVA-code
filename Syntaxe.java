import java.util.Scanner;

public class Syntaxe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Hello"+" "+ nom);
        System.out.println("Entrez un entier :");
        int a = scanner.nextInt();
        System.out.println("Entrez un autre entier : ");
        int b = scanner.nextInt();
        int somme = a + b;
        System.out.println(somme);
    }
    
}

