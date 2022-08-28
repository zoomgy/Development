#include <stdio.h>
int main(){
    int i=97,n=122;
    printf("Small Alphabet: \n");
    while (i<=n){
        printf("%c ",i);
        i=i+1;
    }
    printf("\nLarge Alphabet: \n");
    i = 65,n=91;
    while (i<=n){
        printf("%c ",i);
        i=i+1;
    }
    printf("\n");
    return 0;
}