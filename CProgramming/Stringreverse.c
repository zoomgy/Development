//Write a C program to check whether a string is palindrome or not.

#include <stdio.h>
#include <string.h>
int main(){
    char a[200];
    fgets (a,20,stdin);
    char b[200];
    int x = strlen(a);
        for (int i=0;i<x;i++){
            b[i]=a[x-i-1];
        }
    printf("\nThe reversed string is :\n\t%s\n",b);
    return 0;
}