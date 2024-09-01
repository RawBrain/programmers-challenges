import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        
        for(int tp1 : topping){
            if(b.containsKey(tp1)){
                b.put(tp1, b.get(tp1)+1);
            }else{
                b.put(tp1, 1);
            }            
        }
        
        for(int tp2 : topping){
            a.put(tp2, 1);
            b.put(tp2, b.get(tp2)-1);
            if(b.get(tp2)==0){
                b.remove(tp2);
            }
            
            if(a.size()==b.size()){
                answer++;
            }
        }
        
        return answer;
    }
}