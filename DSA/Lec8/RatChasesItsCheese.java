import java.util.*;

public class RatChasesItsCheese {
    static boolean flag = false ;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char[][] pathArray = new char[row][column];
        int[][] finalPath = new int[row][column];
        for(int i=0;i<pathArray.length;i++){
            String s = sc.next();
            for(int j=0;j<s.length();j++){
                pathArray[i][j] = s.charAt(j);
            }
        }
        cheese(pathArray, row, column, 0, 0, finalPath);
        sc.close();
    }
    public static void cheese(char[][] pathArray,int row,int column,int k,int l,int[][] finalPath){
        if(k == row - 1 && l == column - 1 && finalPath[k][l] != 'X'){
            finalPath[k][l] = 1;
            flag = true;
            printFinalPath(finalPath);
            return;
        }
        if(k < 0 || l < 0 || k >=row || l >=column || pathArray[k][l] == 'X'){
            return;
        }
        pathArray[k][l] = 'X';
        finalPath[k][l] = 1;
        cheese(pathArray,row,column,k-1,l,finalPath); //up
        cheese(pathArray,row,column,k+1,l,finalPath); //down
        cheese(pathArray,row,column,k,l+1,finalPath); //right
        cheese(pathArray,row,column,k,l-1,finalPath); //left
        pathArray[k][l] = 'O';
    }
    public static void printFinalPath(int[][] finalPath){
        if(!flag) { 
            System.out.println("NO PATH FOUND");
            return;
        }
        for (int i = 0; i < finalPath.length; i++) {
            for (int j = 0; j < finalPath[0].length; j++) {
                System.out.print(finalPath[i][j] + "  ");
            }
            System.out.println();
        }
    }
}