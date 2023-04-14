import java.util.*;
public class QueenPermutation {
    public static void main (String args[]) {
        int queen = 2;
        int slots = 4;
        boolean[] visitesArray = new boolean[slots];
        printingPermutations(visitesArray, queen, 0, "",0);


    }
    public static void printingPermutations(boolean[] visitedArray,int queen,int present_queen,String ans,int k){
        if(present_queen == queen){
            System.out.println(ans);
            return;
        }
        for(int i=k;i<visitedArray.length;i++){
            if(visitedArray[i] == false){
                visitedArray[i] = true;
                printingPermutations(visitedArray, queen, present_queen+1, ans + "b" + i + "q" + present_queen,i+1);
                visitedArray[i] = false;
            }
        }
    }
}