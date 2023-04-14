import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        ArrayList<String> ansList = new ArrayList<>();
        permutationsString(testString,"",ansList);
        System.out.println(ansList);
        sc.close();
    }
    public static void permutationsString(String testString,String ans,ArrayList<String> ansList){
        if(testString.length() == 0){
            if(!ansList.contains(ans)){
                ansList.add(ans);
            }
            return;
        }

        for(int i=0;i<testString.length();i++){
            permutationsString(testString.substring(0, i) + testString.substring(i+1,testString.length()), ans+testString.charAt(i),ansList);
        }
    }
}