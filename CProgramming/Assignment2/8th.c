#include <stdio.h>

int main(){
    char a;
    printf("\nEnter an  alphabet : ");
    scanf("%c",&a);
    if (a>=65&&a<=90){
    printf("\nThe char is CAPITAL\n");
    }
    else {
    printf("\nThe char is SMALL\n");
    }
    return 0;
}