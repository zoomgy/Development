

#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    int alphabet=0,numeric=0,special=0;
    scanf("%s",str);
        int i;
        for (i=0;i<strlen(str);i++){
            if((str[i]>=65&&str[i]<=90)||(str[i]>=97&&str[i]<=122)){
                alphabet++;
            }
            else if (str[i]>=48&&str[i]<=57){
                numeric++;
            }
            else 
                special++;
        }

        printf ("\n\nAlphabet : %d   Numeric : %d   Special : %d\n\n",alphabet,numeric,special);

        return 0;
}