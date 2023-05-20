package DSA.Super150.Super_150_GLA_2025.Lec2;
import java.util.*;
public class GradeCard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if(grade > 75){
            System.out.println("A");
        }
        else if(grade >= 65){
            System.out.println("B");
        }
        else if(grade >=55){
            System.out.println("C");
        }
        else if(grade >=45){
            System.out.println("Pass.");
        }
        else{
            System.out.println("Fail.");
        }
        sc.close();
    }
}