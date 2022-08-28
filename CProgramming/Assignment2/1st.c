#include <stdio.h>

int main (){
    int age;
    printf("\nEnter your age : ");
    scanf ("%d",&age);
        if (age<18){
            printf("\nNABALIK HAI TU BHAI :(");
        }
        else if (age>=18){
            printf("\nCONGRATS YOUR ARE A BALIK NOW");
        }
        else {
            printf("\nERROR 420");
        }
    return 0;
}