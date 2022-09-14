import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hcf=1,i,dividend;
        int firstnumber = sc.nextInt();
        int secondnumber = sc.nextInt();
        if(firstnumber>secondnumber){
            dividend = secondnumber;
        }
        else {
            dividend = firstnumber;
        }
        for(i=1; i<= dividend ;i++){
            if(firstnumber%i==0 && secondnumber%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);

        sc.close();
    }
}