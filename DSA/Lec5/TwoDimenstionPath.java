import java.util.Scanner;

public class TwoDimenstionPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        String ans = "";
        pathWays(0, 0, row, column , ans);
        sc.close();
    }
    public static void pathWays(int counter1 , int counter2 , int row , int column, String ans){
        if(counter1 == row-1 && counter2 == column-1){
            System.out.println(ans);
            return;
        }
        if(counter1 < row-1){
            pathWays(counter1+1, counter2, row, column, ans + "H");
        }
        if(counter2 < column-1){
            pathWays(counter1, counter2+1, row, column , ans + "V");
        }
    }
}