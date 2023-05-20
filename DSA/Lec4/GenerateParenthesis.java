import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis{
    public static ArrayList main(String[] args) {

        List<String> ll= new ArrayList<>();
        myFunction(3,0,0,"",ll);
        return (ArrayList)ll;


    }
    public static void myFunction(int n,int open,int close,String ans,List<String> ll){
        if(ans.length() == n*2){
            //System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open < n){
            myFunction(n, open + 1, close, ans + "(" ,ll);
        }
        if(close < n && close<open){
            myFunction(n, open, close + 1, ans + ")" ,ll);
        }
    }
}