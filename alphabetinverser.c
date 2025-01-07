#include<stdio.h>
#include<unistd.h>

int my_print_rev_alpha(void) {
    char alphabet [26];
    char lettre = 'z';
    
    for (int x = 0; x < 26; x++) 
    {
        alphabet[x] = lettre;
        lettre--;
    }
    
    write(1,&alphabet, 26 );   
}

void main() {
    my_print_rev_alpha();
}
// ce programme affiche l'alphabet à l'envers