//Write a C program to find length of a string with and without function.

#include <stdio.h>
int main(){
    char a[10];
    int i=0,flag=0;
    printf("\nEnter a string : ");
    scanf("%s",a);
        while (a[i]!='\0'){
            flag = flag + 1;
            i++;
        }
        printf("The number of elements : %d\n",flag);
    return 0;
}