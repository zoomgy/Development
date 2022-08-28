#include <stdio.h>
#include <string.h>
int main(){
    char a[200];
        fgets(a,50,stdin);
        int x = strlen (a),m;
        for (int l=0;l<x;l++){
                if (a[l]==32){
                    m = m + 1;
                }
            }
        for (int z=0;z<=(m+1);z++){
            x = strlen(a),m=0;
            int n,lastspace;
            for (int i=0;i<x;i++){
                if (a[i]==32){
                    m = m + 1;
                    lastspace = i;
                }
            }
            for (int k = lastspace ; a[k]!='\0';k++){
                printf("%c",a[k]);
            }
            a[lastspace]='\0';
        }
    return 0;
}