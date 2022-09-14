import java.util.*;

public class Pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i = 1;
        int space = 0;
        int star = row;
        int j;
        int g;
        while(i<=row){
            j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            g = 1;
            while(g<=star){
                System.out.print("* ");
                g++;
            }
            space = space + 2;
            star = star - 1;
            i++;
            System.out.println();
        }

        sc.close();
    }
}