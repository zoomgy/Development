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
        for (int i=(x-1);i>=0;i--){
                if (a[i]==c){
                    printf("\nThe last occurence character '%c' is at %dth index in the string.\n\n",c,i);
                    break;
                }
        }
    return 0;
}