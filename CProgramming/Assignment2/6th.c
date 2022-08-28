#include <stdio.h>
int main(){
    int a,b,c;
    printf ("\nEnter first number to check : ");
    scanf("%d",&a);
    printf ("\nEnter second number to check : ");
    scanf("%d",&b);
    printf ("\nEnter third number to check : ");
    scanf("%d",&c);
    if (a>b&&a>c){
        printf("\nFirst number is greatest\n");
    }
    else if(b>a&&b>c){
        printf("\nSecond Number is greatest\n");
    }
    else if(c>a&&c>b){
        printf("\nThird number is greatest\n");
    }
    else if(c==a&&a==b&&b==c){
        printf ("\nAll the numbers are equal\n");
    }
    else if(b==c&&a>b&&a>c){
        printf ("\nFirst is greatest and second = third\n");
    }
    else if(b==c&&a<b&&a<c){
        printf ("\nSecond = third and first is smallest\n");
    }
    else if(a==c&&b>a&&b>c){
        printf ("\nSecond is greatest and first = third\n");
    }
    else if(a==c&&b<a&&b<c){
        printf ("\nSecond is smallest first = third\n");
    }
    else if(a==b&&c>b&&c>a){
        printf ("\nThird is greatest and First = Second\n");
    }
    else if(a==b&&c<b&&c<a){
        printf ("\nthird is smallest and First = Second\n");
    }
    else {
        printf("\nBhag\n");
    }
    return 0;
}