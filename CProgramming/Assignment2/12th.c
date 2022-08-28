#include <stdio.h>

int main(){
    char a;
    int age;
    printf("\nEnter M for male and F: ");
    scanf("%c",&a);
    if (a==77){
    printf("\nHello Sir Enter your age\n");
    scanf("%d",&age);
        if(age>=21){
            printf("\nBhai shadi karle ab toh\n");
        } 
        else if (age<21){
            printf("\nHehe raha nahin jata tadap hi aisee hai\n");
        } 
    }
    else if (a==70){
    printf("\nHello Lady Enter your age\n");
    scanf("%d",&age);
        if(age>=21){
            printf("\nMAM shadi karlo ab toh\n");
        } 
        else if (age<21){
            printf("\nHehe raha nahin jata tadap hi aisee hai\n");
        } 
    }
    return 0;
}