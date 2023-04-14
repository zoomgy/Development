import java.util.Scanner;

public class DiceRoll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        diceRoll(0, 5, "");
        sc.close();
    }
    public static void diceRoll(int num ,int des, String ans){
        if(num == des){
            System.out.print(ans + " ");
            return;
        }
        if(num > des){
            return;
        }
        diceRoll(num + 1 ,des, ans+1);
        diceRoll(num + 2 ,des, ans+2);
        diceRoll(num + 3 ,des, ans+3);
    }
}