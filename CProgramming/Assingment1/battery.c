#include <stdio.h>
int main(){
    float y,x;
    printf("\nEnter battery percentage remaining - ");
    scanf("%f",&y);
    y=y/100;
    x=(5*(1-y));
    printf("\nHours -- %0.2f",x);
    return 0;
}