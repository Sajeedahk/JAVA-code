import java.util.Scanner;
// Convertie l'euro en d'autre devise. Problème = les montants des devises changent au file des jours

public class convertisseurDunité {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Montant :");
        float Montant = scanner.nextFloat();
        System.out.println("Choisir la devise :");
        String Devise = scanner.next();

        switch (Devise) {
            case "Maurice":
                Montant *= 48.89;
                System.out.println(Montant+"MUR");
                break;
            case "Angleterre":
                Montant *= 0.829;
                System.out.println(Montant + "GBP");
                break;
            case "USA":
                Montant *= 1.039;
                System.out.println(Montant + "USD");
                break;
            case "Inde":
                Montant *= 88.48;
                System.out.println(Montant + "INR");
                break;
            case "Canada":
                Montant *= 1.493;
                System.out.println(Montant + "CAD");
                break;
            case "Australie":
                Montant *= 16.67;
                System.out.println(Montant + "AUD");
                break;
            case "Suisse":
                Montant *= 0.931;
                System.out.println(Montant + "CHF");
                break;
            case "Mexique":
                Montant *= 20.93;
                System.out.println(Montant + "MXN");
                break;
            case "ArabieSaoudite":
                Montant *= 38.17;
                System.out.println(Montant + "AED");
                break;
            case "Albanie":
                Montant *= 985.95;
                System.out.println(Montant + "ALL");
                break;
            case "Arménie":
                Montant *= 411.4;
                System.out.println(Montant + "AMD");
                break;
            case "Angola": 
                Montant *= 958.2;
                System.out.println(Montant + "AOA");
                break;
            case "Argentine":
                Montant *= 1066;
                System.out.println(Montant + "ARS");
                break;
            case "Azerbaïdjan":
                Montant *= 1.766;
                System.out.println(Montant + "AZN");
                break;
            case "Algerie":
                Montant *= 140.5;
                System.out.println(Montant + "DZD");
                break;
            default:
                break;
        }
    }
                   
}
    
    

