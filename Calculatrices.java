import java.util.Scanner;
//Demande à l'utilisateur deux nombres et une opérations, et selon l'opération, le résultat est renvoyé. 

public class Calculatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nb1 = scanner.nextInt();
        System.out.println("Entrez un autre numéro :");
        int nb2 = scanner.nextInt();
        System.out.println("Entrez une opérations (+, -, *, %)");
        String operation = scanner.next();
        int result = 0;
        if (operation.equals("+")){
            result = nb1 + nb2;
        }else if(operation.equals("-")){
            result = nb1-nb2;
        }else if(operation.equals( "%")){
            result = nb1/nb2;
        }else {
            result = nb1*nb2;
        }
        System.out.println(result);    
    }
    
}
