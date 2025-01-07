#include<stdio.h>
#include<unistd.h>

//affiche l'alphabet

void afficherAlphabet() {
    char alphabet [26];
    char lettre = 'a';
    
    for (int x = 0; x < 26; x++) 
    {
        alphabet[x] = lettre;
        lettre++;
    }
    
    write(1,&alphabet, 26);   
}

void main() {
    afficherAlphabet();
}


