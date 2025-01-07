#include <stdio.h>

void afficherNombresCroissants(int debut, int fin) {
    // Boucle for pour afficher les nombres de 'debut' à 'fin'
    for (int nombre = debut; nombre <= fin; nombre++) {
        printf("%d ", nombre);
    }
    
    printf("\n");
}

int main() {
    int debut, fin;
    
    // Demande à l'utilisateur de saisir le début et la fin de la plage de nombres
    printf("Entrez le début de la plage de nombres : ");
    scanf("%d", &debut);
    printf("Entrez la fin de la plage de nombres : ");
    scanf("%d", &fin);
    
    // Appel de la fonction pour afficher les nombres dans la plage spécifiée par l'utilisateur
    afficherNombresCroissants(debut, fin);
    
    return 0;
}
