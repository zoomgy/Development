#include <stdio.h>
int main(){
    int row1,col1,row2,col2,i,j;
    scanf("%d %d %d %d",&row1,&col1,&row2,&col2);
    if(col1==row2){
    int mat1[row1][col1],mat2[row2][col2],mat3[row1][col2];
    printf("Enter 1st matrix elements --> \n");
        for (i=0;i<row1;i++){
            for (j=0;j<col1;j++){
                scanf("%d",&mat1[row1][col1]);
            }
        }
    printf("Enter 2nd matrix elements --> \n");
        for (i=0;i<row2;i++){
            for (j=0;j<col2;j++){
                scanf("%d",&mat2[row2][col2]);
            }
        }
    
    for (i=0;i<row1;i++){
        for (j=0;j<col2;j++){
            int sum=0;
            for(int k=0;k<col1;k++){
                for (int l=0;l<col1;l++){
                    sum=sum + mat1[k][l]*mat2[l][k];
                }
            }
            mat3[row1][col2]=sum;
        }
    }
    for (i=0;i<row1;i++){
            for (j=0;j<col2;j++){
                printf("%d  ",mat3[row1][col2]);
            }
            printf("\n\n");
        }
    }

    else {
    printf("Hello");
    }
    return 0;
}