import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_disk = sc.nextInt();
        System.out.println();
        answerOfTower(number_of_disk,"A","B","C");
        System.out.println();
        sc.close();
    }
    public static void answerOfTower(int number_of_disk,String source,String helper,String destination){
        if(number_of_disk == 0){
            return; //base case
        }

        answerOfTower(number_of_disk -1, source, destination, helper);
        System.out.println("Disk number "+number_of_disk+" moved from "+source+" to "+destination);
        answerOfTower(number_of_disk-1, helper, source, destination);
    }
}
