//WAP to input a string and copy all the vowels , consonants , digits and special characters in 4 different strings then display those 4 strings. 
#include <stdio.h>
#include <string.h>
int main(){
    char a[10],vowel[10],cons[10],num[10],spec[10];
    printf("\nEnter a string : ");
    scanf("%s",a);
    int x = strlen(a),j=0,k=0,l=0,m=0;
        for (int i=0;i<x;i++){
            if((a[i]>=97&&a[i]<=122)||(a[i]>=65&&a[i]<=90)){
                    if(a[i]==65||a[i]==69||a[i]==73||a[i]==79||a[i]==85||a[i]==97||a[i]==101||a[i]==105||a[i]==111||a[i]==117){
                        vowel[l]=a[i];
                        l++;
                    }
                    else{
                        cons[m]=a[i];
                        m++;
                    }
            }
            else if(a[i]>=48&&a[i]<=57){
                num[j]=a[i];
                j++;
                }
            else{
                spec[k]=a[i];
                k++;
                }
        }
        printf("\nStrings are as follows : \nNumbers : %s\nVowels : %s\nConsonant : %s\nSpecials : %s\n",num,vowel,cons,spec)
    return 0;
}