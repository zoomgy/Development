#include <stdio.h>
int table(int num1,int num2){
    if(num2==11){
        return 0;
    }
    else {
        printf("%d  *  %d  =  %d\n",num1,num2,(num1*num2));
        return table(num1,num2+1);
    }
}
int main(int num5){
    if(num5<6){
    int a;
    printf("Enter a number : ");
    scanf("%d",&a);
    printf("Table :- \n\n");
    table(a,1);
    main(num5+1);
    }
    else
    return 0;
}