import java.util.Scanner;

public class WordSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] maze = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(maze[i][j] == word.charAt(0)){
                    boolean ans = Word_Search(maze, i, j, word, 0);
                    if(ans){
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
        sc.close();
    }
    public static boolean Word_Search(char[][] maze,int cr,int cc,String word,int idx){
        if(word.length()-1 == idx){
            return true;
        }

        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc] != word.charAt(idx)){
            return false;
        }
        int[] rowDirection = {-1,1,0,0};
        int[] columnDirection = {0,0,-1,1};
        maze[cr][cc] = '*';
        boolean ans = false;
        for(int i=0;i<columnDirection.length;i++){
            ans = Word_Search(maze, cr + rowDirection[i], cc+columnDirection[i], word, idx+1);
            if(ans) return ans;
        }
        maze[cr][cc] = word.charAt(idx);
        return false;
    }
}