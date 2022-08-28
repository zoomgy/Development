#include <stdio.h>
int main(){
    int a,b,c;
    float avg;
    printf("\nEnter marks of first subject : ");
    scanf("%d",&a);
    printf("\nEnter marks of second subject : ");
    scanf("%d",&b);
    printf("\nEnter marks of third subject : ");
    scanf("%d",&c);
    if (a<35||b<35||c<35){
        printf("\nYou FAILED\n");
    }
    else {
        avg = ((a+b+c)/3);
        printf ("\nAverage marks : %0.2f",avg);
        if (avg >= 60){
            printf("\nCongrats you have got first class.\n");
        }
        else if (avg< 60){
            printf("\nCongrats you have got Second class.\n");
        }
        else {
            printf("\nWork Hard\n");
        }
    }
    return 0;
}