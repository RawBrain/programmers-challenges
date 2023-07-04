import java.util.*;

class Solution {
	public int[] solution(String s) {
        int n = (int)s.chars()
            .filter(c -> c=='{')
            .count();
        s = s.replaceAll("\\{", "").replaceAll("\\}", "");
        String[] strarr = s.split(",");
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<strarr.length; i++){
            int num = Integer.parseInt(strarr[i]);
            if(map.containsKey(num)){
                map.put(num, map.get(num)-1);
            }else{
                map.put(num, n-2);
            }
        }
        
        int[] answer = new int[n-1];
        for(Map.Entry<Integer, Integer> pair : map.entrySet()) {
        	answer[pair.getValue()] = pair.getKey();
        }
        
        return answer;
    }
}