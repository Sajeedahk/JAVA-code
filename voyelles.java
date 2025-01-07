import java.util.Scanner;

//Ce programme affiche le nombre de voyelle dans un mot
public class voyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String texte = scanner.nextLine();
        int somme = 0;
        for (int i = 0; i< texte.length();i++){
            char a = texte.charAt(i);
            if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='y'){
                somme++ ;
            }
        }
        System.out.println("Nombre de voyelles :" + somme);
    }
}
