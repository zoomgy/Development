//Write a C program to concatenate two strings with and without function.
#include <stdio.h>
#include <string.h>
int main(){
    char a[10];
    char b[10];
    char c[20];
    printf("\nEnter the First String : ");
    scanf("%s",a);
    printf("\nEnter the Second String : ");
    scanf("%s",b);
    int x=strlen(a);
    int y=strlen(b);
        for (int i=0;i<(x+y);i++){
            if(i>=0&&i<x){
                c[i]=a[i];
                }
            if(i<=x&&i<(x+y)){
                c[i]=b[i-x];
            }
        }
        printf("\n\n\t%s\n\n",c);
    return 0;
}