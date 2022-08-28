#include <stdio.h>
const char *QUAD(int a,int b,int c) {
    int D = (b*b - (4*a*c)) ;
    if(D>0){return "Real";}
    if(D<0){return "Imaginary";}
    return 0;
}
int main(){
    int a,b,c;
    printf("\n Enter the roots of quad eq : ");
    scanf("%d%d%d",&a,&b,&c);
    printf("\n\t%s\n\n",QUAD(a,b,c));
}