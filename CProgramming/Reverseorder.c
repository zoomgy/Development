#include <stdio.h>
#include <string.h>
 
int main(){
    char a[200];
        scanf("%[^\n]s",a);
        int x = strlen(a);
        for (int j=(x-1);j>=0;j--){
            if(a[j]==' '&&a[j+1]!=' '){
                int i=j+1;
                while (a[i]!=' '&&a[i]!='\0'){
                    printf("%c",a[i]);
                    i++;
                }
                printf(" ");
            }
            else if (j==0){
                int i=0;
                while (a[i]!=' '){
                    printf("%c",a[i]);
                    i++;
                }
                printf("\n");
            }
        }
    return 0;
}