import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<clothes.length; i++){
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], 1);
            }else{
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        for(String key : map.keySet()){
            answer = answer * (map.get(key)+1);
        }
        answer--;
        return answer;
    }
}