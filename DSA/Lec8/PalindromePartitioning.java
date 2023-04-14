import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        List<String> ll = new ArrayList<>();
        List<List<String>> finalList= new ArrayList<>();
        stringBreakdown(s1, ll ,finalList);
        System.out.println(finalList);
        sc.close();
    }
    public static void stringBreakdown(String s,List<String> ll,List<List<String>> finalList){
        if(s.length() == 0){
            // System.out.println(ll);
            finalList.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            if(stringReverse(s1).compareTo(s1) == 0){ll.add(s1);stringBreakdown(s2 , ll,finalList);ll.remove(ll.size()-1);}
        }
    }
    public static String stringReverse(String s){
        String reversedString = "";
        for (int i = s.length()-1; i >=0; i--) {
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }
}
