#include <stdio.h>

void afficherAlphabet() {
    char lettre = 'a';
    
    // Utilisation d'une boucle do-while
    do {
        printf("%c ", lettre);
        lettre++;
    } while (lettre <= 'z');
    
}

void main() {
    // Appel de la fonction pour afficher l'alphabet
    afficherAlphabet();
}

