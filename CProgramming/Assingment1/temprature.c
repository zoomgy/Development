#include <stdio.h>
int main (){
    float a=0,f,c;
    printf("Please Press -\n1 for F to C\n2 for C to F\n- ");
    scanf("%f",&a);
        if (a==1){
            printf("Enter temprature in Fahrenheit - ");
            scanf("%f",&f);
            c = (5.0/9.0) * (f - 32.0);
            printf("Celcius - %0.2f",c);
        }
        else if (a==2){
            printf("Enter temprature in Celcius - ");
            scanf("%f",&c);
            f = ((c*1.80)+32);
            printf("Fahrenheit - %0.2f",f);
        }
        else {
            printf("\nWrong Choice.");
        }
    return 0;
}