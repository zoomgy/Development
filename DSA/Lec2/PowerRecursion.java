import java.util.*;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(powerFunction(sc.nextInt(),sc.nextInt(),1));
        sc.close();
    }
    public static int powerFunction(int a,int b,int ans){
        if(b==0){
            return ans;
        }
        return powerFunction(a, b-1 ,ans * a);
    }
}
