import java.util.Scanner;
//affiche le nombre le plus grand entrer. 
public class Max{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez trois nombres");
        int nb1 = scanner.nextInt();
        int nb2 = scanner.nextInt();
        int nb3 = scanner.nextInt();
        if (nb1> nb2 &&  nb1> nb3){
            System.out.println("Le plus grand nomre est : " + nb1); 
        } else if (nb2>nb1 && nb2>nb3){
            System.out.println("Le plus grand nombre est :" + nb2);
        } else {
            System.out.println("Le plus grand nombre est :" + nb3);
        }


    }
}
