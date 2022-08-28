//Write a C program to compare two strings with and without function.
#include <stdio.h>
#include <string.h>
int main(){
    char a[10];
    char b[10];
        printf("\nEnter the First String : ");
        scanf("%s",a);
        printf("\nEnter the Second String : ");
        scanf("%s",b);
        int x = strlen(a),flag=1;
            for (int i=0;i<x;i++){
                if(a[i]==b[i]){
                    flag = 1;
                }
                else {
                    flag = 0;
                    break;
                }
            }
        if(flag == 1)
            printf("\nEQUAL\n");
        if(flag == 0)
            printf("\nNot EQUAL\n");
    return 0;
}