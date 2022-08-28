#include<stdio.h>
void main(){
    int i,a,b;
    char j;
    printf("Please enter the number of rows: ");
    scanf("%d",&a);
    printf("Please enter the number of column: ");
    scanf("%d",&b);
    b = b+65;
    for(i=1;i<=a;i++){
        for(j=65;j<=b;j++){
            printf("%c ",j);
        }
        printf("\n");
    }
}
