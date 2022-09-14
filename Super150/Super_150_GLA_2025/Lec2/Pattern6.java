public class Pattern6 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 9;
        int l = 1;
        while(i <= 5){
            j = 1;
            while (j<=9){
                if(j<=k && j>=l){
                    if(i%2==1){
                        if(j%2==1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else if(i%2==0){
                        if(j%2==0){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
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
