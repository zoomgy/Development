#include <stdio.h>

int main(){
    char a;
    printf("\nEnter an alphabet : ");
    scanf("%c",&a);
    if ((a>=65&&a<=90)||(a>=97&&a<=122)){
    printf("\nThe char is ALPHABET\n");
    }
    else {
    printf("\nThe char is NOT ALPHABET\n");
    }
    return 0;
}