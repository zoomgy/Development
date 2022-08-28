#include <stdio.h>
#include <string.h>
int main(){
    printf("Enter a String : ");
    char a[10],b[10];
        scanf("%s",a);
        strcpy(b,a);
        printf("Copied String : %s",b);
    return 0;
}