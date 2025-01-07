#include <stdio.h>
#include <unistd.h>

int my_print_digits(void)
{
    char chiffres[10];
   
    for (int x = 0; x < 10; x++) {
        chiffres[x] = x + '0'; 
    
    }
    
    write(1, chiffres, 11);
}

void main() {
    my_print_digits();
    
}

// ce programme affiche les chiffres (0 à 9).

