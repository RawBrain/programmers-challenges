import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<targets.length; i++){
            for(char c : targets[i].toCharArray()){
                if(map.containsKey(c)){
                    answer[i] += map.get(c);
                    continue;
                }
                int index = 101;
                for(int j=0; j<keymap.length; j++){
                    int n = keymap[j].indexOf(c);
                    if(n != -1 && n < index){
                        index = n+1;    
                    }
                }
                if(index == 101){
                    answer[i] = -1;
                    break;
                }else{
                    map.put(c,index);
                    answer[i] += index;
                }
            }
        }
        return answer;
    }
    
}