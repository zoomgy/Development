#include <stdio.h>

int main(){
    double w,r=299792458000000000.0;
    printf("\nEnter wavelength in nano meters - ");
    scanf("%lf",&w);
    double freq = r/w;
    printf("\nFrequency in per second - %lf",freq);
}