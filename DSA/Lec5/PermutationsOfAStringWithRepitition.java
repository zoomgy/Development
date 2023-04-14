import java.util.Scanner;

public class PermutationsOfAStringWithRepitition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        permutationsString(testString,"");
        sc.close();
    }
    public static void permutationsString(String testString,String ans){
        if(ans.length() == 3){
            System.out.print(ans + " ");
            return;
        }

        for(int i=0;i<testString.length();i++){
            permutationsString(testString, ans+testString.charAt(i));
        }
    }
}