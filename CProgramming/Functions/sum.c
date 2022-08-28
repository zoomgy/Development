#include <stdio.h>
int sumoftwo(int num1,int num2){
    return num1+num2;
}
int main(){
    int a,b,sum;
    printf("Enter two numbers for addition : ");
    scanf("%d %d",&a,&b);
    sum = sumoftwo(a,b);
    printf("%d\n",sum);
}