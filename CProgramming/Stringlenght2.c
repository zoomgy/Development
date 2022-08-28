#include <stdio.h>
#include <string.h>
int main(){
    char a[10];
        printf("\nEnter a string : ");
        scanf("%s",a);
        printf("Length of the string : %lu",strlen(a));
    return 0;
}