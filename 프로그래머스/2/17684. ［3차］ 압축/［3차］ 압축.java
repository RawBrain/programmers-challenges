import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int add = 1;
        for(int i=0; i<26; i++){
            map.put(String.valueOf((char)('A'+i)), i+1);
        }
        
        int index = 0;
        
        while(index < msg.length()){
            int n = 1;
            
            while(index + n <= msg.length() && map.containsKey(msg.substring(index, index+n))){
                n++;
            }
            
            if (index + n <= msg.length()) {
                map.put(msg.substring(index, index + n), 26 + add++);
            }
            
            list.add(map.get(msg.substring(index, index + n - 1)));
            
            index += n - 1;
        }
        
            
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
     
}