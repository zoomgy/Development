package DSA.Super150.Super_150_GLA_2025.Lec3;
public class Pattern11 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 5;
        int l = 5;
        int counter = 1;
        while (i<=5){
            j = 1;
            counter = 1;
            while(j<=9){
                if(j<=k && j>=l){
                    System.out.print(counter + " ");
                    if(j<5){
                        counter = counter + 1;
                    }
                    else {
                        counter = counter - 1;
                    }   
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