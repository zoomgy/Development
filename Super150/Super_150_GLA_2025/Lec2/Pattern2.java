import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int row = 1;
        int column;
        while(row <= number ){
            column = 1;
            while(column<=row){
                System.out.print("* ");
                column++;
            }
            System.out.println("");
            row++;
        }
        
    sc.close();
    }
}
