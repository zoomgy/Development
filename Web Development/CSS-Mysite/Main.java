import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();  
        for(int i=0;i<asteroids.length;i++){
            if(stack.size() > 0 && func(stack.peek() , asteroids[i])){  
                if(stack.peek() == -asteroids[i]){
                    stack.pop();
                }
                else if(Math.abs(stack.peek()) > Math.abs(asteroids[i])){
                    
                }
                else{
                    stack.pop();
                    stack.push(asteroids[i]);
                }
                
            }
            else if(stack.size() == 0 || !func(stack.peek() , asteroids[i])){
                stack.push(asteroids[i]);
            }
            while(stack.size() > 1){
                int first = stack.pop();
                if(func(stack.peek(), first)){
                    if(stack.peek() == -first){
                        stack.pop();
                    }
                    else if(Math.abs(stack.peek()) > Math.abs(first)){

                    }
                    else{
                        stack.pop();
                        stack.push(first);
                    }
                }
                else{
                    stack.push(first);
                    break;
                }
            }
        }
        
        int[] ret = new int[stack.size()];
        for(int i=ret.length-1;i>=0;i--){
            ret[i] = stack.pop();
        }
        return ret;
        
    }
    
    
    public boolean func(int a, int b){
        if(b < 0 && a > 0){
            return true;
        }
        return false;
    } 
}