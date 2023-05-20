package DSA.Super150.Super_150_GLA_2025.Lec2;
import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row = 1;
        int column;
        while(row <= number ){
            column = 1;
            while(column<=number){
                System.out.print("* ");
                column++;
            }
            System.out.println("");
            row++;
        }
        
    sc.close();
    }
}
