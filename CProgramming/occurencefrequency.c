//Write a C program to find first occurrence of a character in a given string

#include <stdio.h>
#include <string.h>

int main(){
    char a[200],c;
    printf("\nEnter the string : ");
    fgets (a,50,stdin);
    printf("\nEnter the letter you want to find occurence of : ");
    scanf("%c",&c);
        int x=strlen(a);
        printf("\nThe occurence os character '%c' is at - \n",c);
        for (int i=0;i<x;i++){
                if (a[i]==c){
                    printf(" %dth index in the string.\n",i);
                }
        }
    return 0;
}