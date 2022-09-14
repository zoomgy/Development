public class Pattern9 {
    public static void main(String[] args) {
        int i = 1;
        int j;
        int k = 4;
        int l = 4;
        while(i<=7){
            j = 1;
            while(j<=7){
                if(j>l && j<k){
                    System.out.print("  ");}
                else {
                    System.out.print("* ");} 
                j++;}
            if(i<4){
                k++;
                l--;}
            else {
                k--;
                l++;}
            System.out.println();
            i++;
        }}}