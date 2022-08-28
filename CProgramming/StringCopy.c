//2.	Write a C program to copy one string to another string with and without function.
#include <stdio.h>
#include <string.h>
int main(){
    char a[10];
    char b[10];
    printf("\nEnter a String : ");
    scanf("%s",a);
        for (int i=0;i<strlen(a);i++){
            b[i]=a[i];
        }
    printf("\nCopied String : %s\n",b);
    return 0;
}