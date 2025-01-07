import javax.swing.JButton;
import javax.swing.JFrame;
//Fait apparaitre une fenêtre. 

public class FenetreAvecBouton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fenêtre avec un bouton");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajouter un bouton
        JButton bouton = new JButton("Clique-moi !");
        frame.add(bouton); // Ajouter le bouton à la fenêtre

        frame.setVisible(true);
    }
}
