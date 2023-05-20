package DSA.Super150.Super_150_GLA_2025.Lec2;
public class Pattern5 {
        public static void main(String[] args) {  
        int i = 1;
        int j = 1;
        int k = 9;
        int l = 1;
        while(i <= 5){
            j = 1;
            while (j<=9){
                if(j<=k && j>=l){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
            k--;
            l++;
        }
    }
}