#include <stdio.h>

int main(){
    char a;
    printf("\nEnter an  alphabet : ");
    scanf("%c",&a);
    if (a>=97&&a<=122){
    printf("\nThe char is SMALL\n");
    }
    else if(a>=65&&a<=91){
    printf("\nThe char is CAPITAL\n");
    }
    else {
        printf("\nThe char is special char");
    }
    return 0;
}