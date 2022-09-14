public class Pattern4 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 5;
        int l = 5;
        while (i<=5){
            j = 1;
            while(j<=9){
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
            k++;
            l--;         
        }
    }
}