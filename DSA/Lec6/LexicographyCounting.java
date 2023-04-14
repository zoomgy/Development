import java.util.Scanner;

public class LexicographyCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String itterating_string = "0";
        lexicographicFuction(str,itterating_string);
        sc.close();
    }
    public static void lexicographicFuction(String str,String itterating_String){
        
        if(itterating_String.compareTo(str) > 0){
            System.out.println(itterating_String);
            return;
        }
        lexicographicFuction(str,nextWord(itterating_String));
    }
    public static String nextWord(String str)
    {   
        if (str == "")return "0";
        int i = str.length() - 1;
        while (str.charAt(i) == '9' && i >= 0)i--;
        if (i == -1)str = str + '0';
        else str = str.substring(0, i) +(char)((int)(str.charAt(i)) + 1) +str.substring(i + 1);
        return str;
    }
}