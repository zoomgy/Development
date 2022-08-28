//Write a C program to find total number of alphabets, digits or special character in a string.
#include <stdio.h>
#include <string.h>
int main(){
    char a[10];
    printf("\nEnter a string : ");
    scanf("%s",a);
    int x = strlen(a),upper=0,lower=0,digits=0,special=0;
        for (int i=0;i<x;i++){
            if(a[i]>=97&&a[i]<=122)
                lower ++;
            else if(a[i]>=65&&a[i]<=90)
                upper ++;
            else if(a[i]>=48&&a[i]<=57)
                digits ++;
            else
                special ++;
        }
        printf("\nUpper Case : %d\nLower Case : %d\nDigits : %d\nSpecial : %d\n",upper,lower,digits,special);
    return 0;
}