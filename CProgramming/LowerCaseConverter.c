//	Write a C program to convert uppercase string to lowercase.
#include <stdio.h>
#include <string.h>
int main(){
    char a[20];
    printf("\nEnter a String : ");
    scanf("%s",a);
    int x = strlen (a);
        for (int i=0;i<x;i++){
            if(a[i]>=65&&a[i]<=90){
                a[i]=a[i]+32;
            }
        }
        printf("\n\t%s\n",a);
    return 0;
}